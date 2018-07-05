from __future__ import print_function
import sys
import subprocess
import copy
from antlr4 import *
from NFCPUserParser import NFCPUserParser
from NFCPUserListener import NFCPUserListener

global spi_val, si_val

spi_val = 0
si_val = 0


class tmp_nf_node(object):
	def __init__(self):
		self.name = None
		self.nf_class = ""
		self.spi = 0
		self.si = 0
		self.visited = False
		self.next = []

	def setup(self, ll_node):
		self.name = ll_node.instance
		self.spi = ll_node.spi
		self.si = ll_node.si
		return

	def get_nf_node_list(self):
		res_list = []
		res_list.append(self)

		for tmp_node in self.next:
			res_list += tmp_node.get_nf_node_list()

		return res_list

def convert_graph(ll_node):
	"""
	convert a ll_node graph into a tmp_nf_node graph (a complete graph)
	"""
	root_node = None
	curr_node = None
	prev_ll_node = None
	curr_ll_node = ll_node

	while curr_ll_node != None:
		new_node = curr_ll_node.get_tmp_nf_node()
		if root_node == None:
			root_node = new_node
			curr_node = root_node
		else:
			curr_node.next.append(new_node)
			curr_node = new_node

		prev_ll_node = curr_ll_node
		curr_ll_node = curr_ll_node.next
	return root_node


class linkedlist_node(object):
	def __init__(self):
		# instance = str, var, nlist
		# transition_condition = ntuple
		# branch = list of network service paths (root nodes of each path)
		# length = the length for the current node
		# prev = prev node
		# next = next node
		self.instance = None
		self.spi = 0
		self.si = 0
		self.transition_condition = None
		self.branch = []
		self.length = 0
		self.prev = None
		self.next = None

	def set_node_instance(self, node_instance, scanner):
		self.instance = copy.deepcopy(node_instance)
		self.postprocess_branches(scanner)

	def set_transition_condition(self, ntuple_instance):
		self.transition_condition = ntuple_instance

	def get_tmp_nf_node(self):
		if len(self.branch) == 0:
			# process a non-branch node
			new_node = tmp_nf_node()
			new_node.setup(self)
			return new_node

	def get_length(self):
		return len(self)

	def __len__(self):
		"""
		This function shall return the maximum length of the WHOLE NF chain
		that starts from the current node.
		"""
		len_count = 0
		curr_node = self
		while curr_node != None:
			len_count += self.length
			curr_node = curr_node.next
		return len_count

	def postprocess_branches(self, scanner):
		if isinstance(self.instance, list):
			# branch node
			curr_branch_length, max_branch_length = 0, 0
			for subchain in self.instance:
				print("subchain:", subchain['nfchain'], " flowspec:", subchain['flowspec'])
				# note: subchain can be var, nlinkedlist
				if isinstance(subchain['nfchain'], str):
					subchain_name = subchain['nfchain']
					if subchain_name in scanner.struct_nlinkedlist_dict:
						# subchain is a chain instance
						self.branch.append(scanner.struct_nlinkedlist_dict[subchain_name])
						curr_branch_length = scanner.struct_nlinkedlist_dict[subchain_name].get_length()
					else:
						# subchain is a single NF
						new_node = linkedlist_node()
						new_node.set_node_instance(subchain_name, scanner)
						self.branch.append(new_node)
						curr_branch_length = 1
					#print("str", scanner.struct_nlinkedlist_dict[subchain_name])
				elif isinstance(subchain['nfchain'], linkedlist_node):
					# subchain is a NF chain definition
					self.branch.append( subchain['nfchain'] )
					curr_branch_length = subchain['nfchain'].get_length()
				max_branch_length = max(max_branch_length, curr_branch_length)
		else:
			# normal NF node
			self.length = 1
		return


	def ll_node_tail(self):
		if self.next == None:
			return self
		else:
			return self.next.ll_node_tail()

	def _draw_pipeline(self, graph_args=None):
		"""
		print_pipeline:
		Print the whole pipeline.
		1. start with a linear NF chain, which does not have any branch
		2. handle the branch struct
		"""
		# generate the NF placement graph (in the output format)

		if graph_args is None:
			graph_args = []

		nf_graph = convert_graph(self)
		modules = nf_graph.get_nf_node_list()
		#print(len(modules))
		names = []
		node_labels = {}

		for m in modules:
			name = m.name
			mclass = m.nf_class
			names.append(name)
			node_labels[name] = '%s\\n%s' %(name, mclass)

		spi_start = self.spi
		spi_end = self.ll_node_tail().spi

		try:
			f = subprocess.Popen('graph-easy ' + ' '.join(graph_args), shell=True,\
				stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE )

			for i in range(len(names)-1):
				print('[%s] -> [%s]' %(node_labels[names[i]], node_labels[names[i+1]]), file=f.stdin )
			output, error = f.communicate()
			f.wait()
			return output

		except IOError as e:
			if e.errno == errno.EPIPE:
				raise cli.CommandError('"graph-easy" program is not available')
			else:
				raise

	def __str__(self):
		res_str = ""
		if len(self.branch) != 0:
			res_str += 'NF Branch[spi=%d]' %(self.spi)
		else:
			res_str += "%s[spi=%d si=%d]" %(self.instance, self.spi, self.si)
		
		if self.next != None:
			res_str += " -> " + self.next.__str__()
		return res_str

	def assign_service_index(self):
		"""
		assign_service_index can assign and update the spi_val and si_val.
		Therefore, achieve the first step for NF placement - assigning SPI
		and SI values for each NF.
		"""
		global spi_val, si_val
		if len(self.branch) != 0:
			# branch node
			self.update_service_index_nextfunc()
			for subchain in self.branch:
				# each subchain is a nll_node (i.e. the root node of the subchain)
				self.update_service_index_nextchain()
				subchain.assign_service_index()
			# set up the spi_val and si_val for the rest of netchain
			if self.next != None:
				self.update_service_index_nextchain()
		else:
			# normal NF node
			self.update_service_index_nextfunc()
			if self.next != None:
				self.next.assign_service_index()
		return

	def update_service_index_nextfunc(self):
		"""
		update_service_index_nextfunc:
		It should update si_val by 1. Also, it sets up the self.spi and self.si
		"""
		global spi_val, si_val
		si_val += 1
		self.spi = spi_val
		self.si = si_val
		return
		
	def update_service_index_nextchain(self):
		"""
		update_service_index_nextchain:
		It should restart spi_val and si_val for a new chain.
		"""
		global spi_val, si_val
		spi_val += 1
		si_val = 0
		return


class UDNFCPUserListener(NFCPUserListener):
	def __init__(self):
		# Lookup Table for basic data types
		self.var_int_dict = {}
		self.var_float_dict = {}
		self.var_string_dict = {}
		self.var_bool_dict = {}
		self.func_dict = {}

		self.struct_ntuple_dict = {}
		self.struct_nlist_dict = {}
		self.struct_nlinkedlist_dict = {}

		# flowspec_nfchain_mapping stores the nfchain configuration
		self.flowspec_nfchain_mapping = {}

		self.overall_nf_chain_list = []
		self.service_path_count = 0
		self.line_count = 0
		return

	# Enter a parse tree produced by NFCPUserParser#total.
	def enterTotal(self, ctx):
		print("NFCP AST Walker starts:")
		pass

	# Exit a parse tree produced by NFCPUserParser#total.
	def exitTotal(self, ctx):
		print("NFCP AST Walker ends!")
		pass


	# Enter a parse tree produced by NFCPUserParser#line.
	def enterLine(self, ctx):
		self.line_count += 1
		pass

	# Exit a parse tree produced by NFCPUserParser#line.
	def exitLine(self, ctx):
		pass

	# Enter a parse tree produced by NFCPUserParser#define_int.
	def enterDefine_int(self, ctx):
		#print(ctx.VARIABLENAME(), ctx.INT(), type(str(ctx.INT())))
		var_name = str(ctx.VARIABLENAME())
		var_value = int(str(ctx.INT()))
		self.var_int_dict[var_name] = var_value
		pass

	# Exit a parse tree produced by NFCPUserParser#define_int.
	def exitDefine_int(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#define_float.
	def enterDefine_float(self, ctx):
		#print(ctx.VARIABLENAME(), ctx.FLOAT(), type(str(ctx.FLOAT())))
		var_name = str(ctx.VARIABLENAME())
		var_value = float(str(ctx.FLOAT()))
		self.var_float_dict[var_name] = var_value
		pass

	# Exit a parse tree produced by NFCPUserParser#define_float.
	def exitDefine_float(self, ctx):
		pass

	def get_string_from_ctx(self, ctx, idx=None):
		if idx == None:
			res = str(ctx.STRING())[1:-1]
		else:
			res = str(ctx.STRING(idx))[1:-1]
		return res

	# Enter a parse tree produced by NFCPUserParser#define_string.
	def enterDefine_string(self, ctx):
		var_name = str(ctx.VARIABLENAME())
		var_value = self.get_string_from_ctx(ctx)
		self.var_string_dict[var_name] = var_value
		pass

	# Exit a parse tree produced by NFCPUserParser#define_string.
	def exitDefine_string(self, ctx):
		pass


	def get_bool_from_ctx(self, ctx):
		res = None
		bool_value = str(ctx.BOOL())
		if bool_value == 'False':
			res = False
		elif bool_value == 'True':
			res = True
		return res

	# Enter a parse tree produced by NFCPUserParser#define_bool.
	def enterDefine_bool(self, ctx):
		var_name = str(ctx.VARIABLENAME())
		var_value = self.get_bool_from_ctx(ctx)
		self.var_bool_dict[var_name] = var_value
		pass

	# Exit a parse tree produced by NFCPUserParser#define_bool.
	def exitDefine_bool(self, ctx):
		pass

	def get_nf_from_ctx(self, ctx):
		# return the NF's name from the netfunction context
		res = str(ctx.VARIABLENAME())
		return res

	# Enter a parse tree produced by NFCPUserParser#define_nfinstance.
	def enterDefine_nfinstance(self, ctx):
		# Note: each NF instance can be either a BESS or P4 module
		#print("Enter Define NetFunc")
		var_name = str(ctx.VARIABLENAME())
		var_value = self.get_nf_from_ctx(ctx.netfunction())
		self.func_dict[var_name] = var_value
		#print(var_name, var_value)
		pass

	# Exit a parse tree produced by NFCPUserParser#define_nfinstance.
	def exitDefine_nfinstance(self, ctx):
		pass


	def get_nlistelem_from_ctx(self, nlist_elem_ctx):
		"""
		return the nlist element based on the nlist_elem object's context
		"""
		nlistelem_obj = nlist_elem_ctx
		res_value = None
		if nlistelem_obj.ntuple() != None:
			res_value = self.get_ntuple_from_ctx(nlistelem_obj.ntuple())
			#print("nlist elem(ntuple):", res_value)
		elif nlistelem_obj.INT() != None:
			res_value = int(str(nlistelem_obj.INT()))
		elif nlistelem_obj.FLOAT() != None:
			res_value = float(str(nlistelem_obj.FLOAT()))
		elif nlistelem_obj.STRING() != None:
			res_value = self.get_string_from_ctx(nlistelem_obj)
		elif nlistelem_obj.VARIABLENAME() != None:
			res_value = str(nlistelem_obj.VARIABLENAME())

		return res_value


	def get_nlist_from_ctx(self, nlist_obj):
		res_nlist = []
		nlistelem_obj_list = nlist_obj.nlist_elem()
		for nlistelem_obj in nlistelem_obj_list:
			var_value = self.get_nlistelem_from_ctx(nlistelem_obj)
			res_nlist.append(var_value)
		return res_nlist

	# Enter a parse tree produced by NFCPUserParser#define_nlist.
	def enterDefine_nlist(self, ctx):
		var_name = str(ctx.VARIABLENAME())
		nlist_obj = ctx.nlist()
		nlist = self.get_nlist_from_ctx(nlist_obj)
		self.struct_nlist_dict[var_name] = nlist
		pass

	# Exit a parse tree produced by NFCPUserParser#define_nlist.
	def exitDefine_nlist(self, ctx):
		pass


	def get_ntupleelem_from_ctx(self, ntuple_elem_ctx):
		"""
		return the ntuple element based on the ntuple_elem object's context
		Note: ntuple elem: {str : str/int/float/var/nlist/nlinkedlist}
		"""
		ntupleelem_obj = ntuple_elem_ctx
		res_value = None
		if ntupleelem_obj.STRING(1) != None:
			#print( str(ntupleelem_obj.STRING(1)) )
			res_value = self.get_string_from_ctx(ntupleelem_obj, 1)
		elif ntupleelem_obj.INT() != None:
			#print( int(str(ntupleelem_obj.INT())) )
			res_value = int(str(ntupleelem_obj.INT()))
		elif ntupleelem_obj.FLOAT() != None:
			#print( float(str(ntupleelem_obj.INT())) )
			res_value = float(str(ntupleelem_obj.INT()))
		elif ntupleelem_obj.VARIABLENAME() != None:
			#print( str(ntupleelem_obj.VARIABLENAME()) )
			res_value = str(ntupleelem_obj.VARIABLENAME())
		elif ntupleelem_obj.nlist() != None:
			#print("focus", self.get_nlist_from_ctx(ntupleelem_obj.nlist()) )
			res_value = self.get_nlist_from_ctx(ntupleelem_obj.nlist())
		elif ntupleelem_obj.nlinkedlist() != None:
			res_value = self.get_nlinkedlist_from_ctx(ntupleelem_obj.nlinkedlist())
		return res_value

	def get_ntuple_from_ctx(self, ntuple_obj):
		# Note: each ntuple_elem has at most two string elements.
		res_ntuple = {}
		ntupleelem_obj_list = ntuple_obj.ntuple_elem()
		for ntupleelem_obj in ntupleelem_obj_list:
			#print( str(ntupleelem_obj.STRING(0)) )
			var_name = self.get_string_from_ctx(ntupleelem_obj, 0)
			var_value = self.get_ntupleelem_from_ctx(ntupleelem_obj)
			res_ntuple[var_name] = var_value
		return res_ntuple

	# Enter a parse tree produced by NFCPUserParser#define_ntuple.
	def enterDefine_ntuple(self, ctx):
		#print("Enter Define Tuple")
		var_name = str(ctx.VARIABLENAME())
		ntuple_obj = ctx.ntuple()
		ntuple = self.get_ntuple_from_ctx(ntuple_obj)
		self.struct_ntuple_dict[var_name] = ntuple
		pass

	# Exit a parse tree produced by NFCPUserParser#define_ntuple.
	def exitDefine_ntuple(self, ctx):
		pass


	def get_nlinkedlistelem_from_ctx(self, nll_elem_obj):
		# Note: nlinkedlistelem can be netfunc (str), var (str), nlist (list)
		res_value = None
		if nll_elem_obj.netfunction() != None:
			#print('nll elem - netfunc:', str(nll_elem_obj.netfunction().VARIABLENAME()))
			res_value = str(nll_elem_obj.netfunction().VARIABLENAME())
		elif nll_elem_obj.VARIABLENAME() != None:
			#print('nll elem - var:', str(nll_elem_obj.VARIABLENAME()))
			res_value = str(nll_elem_obj.VARIABLENAME())
		elif nll_elem_obj.nlist() != None:
			# a 'branch' node
			#print('nll elem - nlist:', self.get_nlist_from_ctx(nll_elem_obj.nlist()))
			res_value = self.get_nlist_from_ctx(nll_elem_obj.nlist())
		return res_value

	def get_nlinkedlist_from_ctx(self, nlinkedlist_obj):
		"""
		This function will return the root node for the defined linkedlist instance.
		At this point, we don't have to further process the linkedlist.
		"""
		# root node
		root_ll_node = None
		curr_ll_node = root_ll_node
		nll_obj_list = nlinkedlist_obj.nlinkedlist_elem()
		for nll_elem_obj in nll_obj_list:
			# for each ll_elem, we create a nlinkedlist_node instance to store
			# information for it.
			# Also, we update the SPI and SI values
			new_ll_node = linkedlist_node()
			node_instance = self.get_nlinkedlistelem_from_ctx(nll_elem_obj)
			new_ll_node.set_node_instance(node_instance, self)
			
			if root_ll_node == None: # the first node
				new_ll_node.prev = None
				root_ll_node = new_ll_node
			else: # not the first node (set up the curr_ll_node's next node)
				new_ll_node.prev = curr_ll_node
				curr_ll_node.next = new_ll_node
			curr_ll_node = new_ll_node
		return root_ll_node

	# Enter a parse tree produced by NFCPUserParser#define_nlinkedlist.
	def enterDefine_nlinkedlist(self, ctx):
		"""
		Enter a new NF chain definition (a nlinkedlist)
		Update the SPI and SI values:
		SPI += 1, SI = 0
		"""
		print("Enter Define nLinkedList")
		var_name = str(ctx.VARIABLENAME())
		nlinkedlist_obj = ctx.nlinkedlist()
		nlinkedlist = self.get_nlinkedlist_from_ctx(nlinkedlist_obj)
		print("Store nlinkedlist. Name: %s, Len: %d" %(var_name, nlinkedlist.get_length()))
		self.struct_nlinkedlist_dict[var_name] = nlinkedlist
		pass

	# Exit a parse tree produced by NFCPUserParser#define_nlinkedlist.
	def exitDefine_nlinkedlist(self, ctx):
		pass

	# Enter a parse tree produced by NFCPUserParser#define_flowspec.
	def enterDefine_flowspec(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#define_flowspec.
	def exitDefine_flowspec(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#define_nfchain.
	def enterDefine_nfchain(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#define_nfchain.
	def exitDefine_nfchain(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#configue_nfchain.
	def enterConfig_nfchain(self, ctx):
		# When a NF chain is configured with a flowspec, we then consider
		# the placement of the NF chain (starting by assigning SPI and SI
		# values for each NF)
		global spi_val, si_val
		spi_val += 1
		si_val = 0

		print(ctx.VARIABLENAME(0), ctx.VARIABLENAME(1))
		flowspec = str(ctx.VARIABLENAME(0))
		nfchain = str(ctx.VARIABLENAME(1))
		self.struct_nlinkedlist_dict[nfchain].assign_service_index()
		self.flowspec_nfchain_mapping[flowspec] = nfchain
		print(self.struct_nlinkedlist_dict[nfchain])
		pass

	# Exit a parse tree produced by NFCPUserParser#configue_nfchain.
	def exitConfig_nfchain(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#flowspec.
	def enterFlowspec(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#flowspec.
	def exitFlowspec(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#netfunction_chain.
	def enterNetfunction_chain(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#netfunction_chain.
	def exitNetfunction_chain(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#netfunction.
	def enterNetfunction(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#netfunction.
	def exitNetfunction(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nlist.
	def enterNlist(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#nlist.
	def exitNlist(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nlist_elem.
	def enterNlist_elem(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#nlist_elem.
	def exitNlist_elem(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#ntuple.
	def enterNtuple(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#ntuple.
	def exitNtuple(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#ntuple_elem.
	def enterNtuple_elem(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#ntuple_elem.
	def exitNtuple_elem(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nlinkedlist.
	def enterNlinkedlist(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#nlinkedlist.
	def exitNlinkedlist(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nlinkedlist_elem.
	def enterNlinkedlist_elem(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#nlinkedlist_elem.
	def exitNlinkedlist_elem(self, ctx):
		pass







