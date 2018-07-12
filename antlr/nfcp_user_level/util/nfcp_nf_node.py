
"""
* Title: nfcp_nf_node.py
* Description:
* This file defines the 'class nf_node' data structure. 
* Each node represents a network function module in the network function chain graph.
* In order to manipulate each NF ndoe, a set of methods are provided by this library.
* 
* Author: Jianfeng Wang
* Time: 02/26/2018
* Email: jianfenw@usc.edu
*
"""

import copy
import re

global bess_module_list
global p4_module_list

bess_module_list = ["MACSwap", "UpdateTTL", "Update", "ECHO"]

p4_module_list = {'ACL': 'acl.lib', \
	'SilkRoad': 'silkroad.lib', \
	'IPv4Forward': 'ipv4_forward.lib', \
	'NSHEncap': 'send_to_bess.lib', \
	'NAT': 'nat_stan.lib', \
	'P4UpdateTTL': 'update_ttl_p4.lib', \
	'Drop': 'drop.lib'}


class nf_chain_graph(object):
	def __init__(self):
		self.module_list = {}
		self.module_num = 0
		# self.heads contains all nodes that does not have parent nodes
		# self.tails contains all nodes that does not have child nodes
		self.heads = []
		self.tails = []

	def add_module(self, nf_node):
		module_key = nf_node.name
		self.module_list[module_key] = nf_node
		self.module_num += 1
		return

	def get_module(self, module_key):
		if module_key in self.module_list.keys():
			return self.module_list[module_key]
		else:
			return None

	def add_edge(self, src, dst):
		"""
		Input: src, dst (type(src), type(dst) == nf_node)
		Output: None
		"""
		if src.name not in self.module_list:
			self.add_module(src)
			self.heads.append(src)
			self.tails.append(src)
		else:
			src = self.module_list[src.name]
		if dst.name not in self.module_list:
			self.add_module(dst)
			self.heads.append(dst)
			self.tails.append(dst)
		else:
			dst = self.module_list[dst.name]
		if dst in src.adj_nodes:
			return

		if src in self.tails: # src is a new parent
			self.tails.remove(src)
		if dst in self.heads: # dst is a new child
			self.heads.remove(dst)
		
		self.module_list[src.name].add_neighbor(dst)
		return

	def __contains__(self, target_key):
		return (target_key in self.module_list)

	def list_modules(self):
		return self.module_list.values()

	def __iter__(self):
		return iter(self.module_list.values())

	def get_nf_chain_count(self):
		"""
		get_nf_chain_count:
		This function returns the number of service chains for the graph.
		Input: p4_list (type=list)
		Output: count (type=int)
		"""
		"""
		nf_chain_count = 0
		for node in p4_list:
			if node.service_path_id > nf_chain_count:
				nf_chain_count = node.service_path_id
		"""
		return None


"""
	Note:
	nf_type = -1 -> default
	nf_type = 0 -> P4 module; 
	nf_type = 1 -> BESS module;
	nf_type = 2 -> both P4 and BESS;
"""
class nf_node(object):
	def __init__(self, ll_node=None):
		# self.name = network function instance's name
		# self.nf_class = network function's name
		# self.adj_nodes = a list of nodes which has the current node as its parent
		self.name = None
		self.nf_class = None
		self.nf_type = None
		self.service_path_id = -1
		self.service_id = -1
		if ll_node != None:
			self.setup_node_from_ll_node(ll_node)
		# connection_status:
		# 1. self.is_parent: the node is a parent node of another node
		# 2. self.is_child: the node is a child node of another node
		#self.is_parent = False
		#self.is_child = False
		self.adj_nodes = []

		self.arg = None
		self.nickname = None
		self.marco_list = None
		self.const_list = None
		self.header_list = None
		self.metadata_dict = None
		self.parser_states = None
		self.output_prefix = None
		self.action_prefix = None
		self.table_prefix = None
		self.ingress_actions = None
		self.ingress_tables = None
		self.ingress_apply_rules = None
		self.egress_code = None
		self.deparser_header_list = None
		self.argument_list = None
		return

	def setup_node_from_argument(self, nf_name, spi, si):
		self.name = copy.deepcopy(nf_name)
		self.service_path_id = spi
		self.service_id = si
		return

	def setup_node_from_ll_node(self, ll_node):
		self.name = ll_node.instance
		self.service_path_id = ll_node.spi
		self.service_id = ll_node.si
		return

	def setup_node_module_type(self):
		"""
		nfcp_module_type(...):
		This function will return:
		0, if the module is invalid;
		1, if the module is a P4 module;
		2, if the module is a BESS module;
		3, if the module can be either a P4 module or a BESS module;
		"""
		global bess_module_list
		global p4_module_list
		res = (self.nf_class in bess_module_list) * 2 + (self.nf_class in p4_module_list)
		return res

	def add_neighbor(self, neighbor_nf_node):
		self.adj_nodes.append(neighbor_nf_node)
		return

	def __cmp__(self, other_nf_node):
		if self.name < other_nf_node.name:
			return -1
		elif self.name > other_nf_node.name:
			return 1
		else:
			if self.service_path_id < other_nf_node.service_path_id:
				return -1
			elif self.service_path_id == other_nf_node.service_path_id:
				if self.service_id < other_nf_node.service_id:
					return -1
				elif self.service_id == other_nf_node.service_id:
					return 0
				else:
					return 1
			else:
				return 1

	def get_nf_node_list(self):
		"""
		get_nf_node_list:
		This function returns a list of nf_node. The list includes all nodes in 
		the branch, starting from the current nf_node.
		"""
		res_nf_nodes = []
		res_nf_nodes.append(self)
		for tmp_node in self.adj_nodes:
			res_nf_nodes += tmp_node.get_nf_node_list()
		return res_nf_nodes

	def nf_node_store_marco(self, input_marco_list):
		self.marco_list = copy.deepcopy(input_marco_list)
		return

	def nf_node_store_const(self, input_const_list):
		self.const_list = copy.deepcopy(input_const_list)
		return

	def nf_node_store_header(self, input_header_list):
		"""
		This function will store all headers in the list named self.headers
		"""
		#print input_header_list
		self.header_list = copy.deepcopy(input_header_list)
		return

	def nf_node_store_metadata(self, input_header_dict):
		"""
		This function will store all headers in the list named self.headers
		"""
		self.metadata_dict = copy.deepcopy(input_header_dict)
		return

	def nf_node_store_parser_state(self, input_state_list):
		"""
		This function will store all parser states in the list named self.parser_states
		"""
		self.parser_state_list = copy.deepcopy(input_state_list)
		return

	def nf_node_store_ingress_code(self, default_prefix, actions, tables, apply_rules):
		"""
		This function will store actions, tables, apply rules in the OrderedDict()
		Also, default_prefix is stored as self.output_prefix
		"""
		self.output_prefix = copy.deepcopy(default_prefix)
		self.action_prefix = copy.deepcopy(default_prefix)
		self.table_prefix = self.action_prefix + "_%d_%d" %(self.service_path_id, self.service_id)
		self.ingress_actions = copy.deepcopy(actions)
		self.ingress_tables = copy.deepcopy(tables)
		self.ingress_apply_rule = copy.deepcopy(apply_rules)
		return

	def nf_node_store_egress_code(self):
		return

	def nf_node_store_deparser(self, input_header_list):
		self.deparser_header_list = copy.deepcopy(input_header_list)
		return

	def nf_node_store_arg(self, input_arg_list):
		self.arg = input_arg_list
		return
	
	def nf_node_store_nickname(self, nickname):
		self.nickname = nickname
		return

'''
class tmp_nf_node(object):
	def __init__(self, ll_node=None):
		self.name = None
		self.nf_class = ""
		self.spi = 0
		self.si = 0
		self.adj_nodes = []
		# connection_status:
		# 1. self.is_parent: the node is a parent node of another node
		# 2. self.is_child: the node is a child node of another node
		#self.is_parent = False
		#self.is_child = False
		if ll_node != None:
			self.setup(ll_node)

	def __cmp__(self, other_node):
		if self.name < other_node.name:
			return -1
		elif self.name > other_node.name:
			return 1
		else:
			if self.spi < other_node.spi:
				return -1
			elif self.spi == other_node.spi:
				if self.si < other_node.si:
					return -1
				elif self.si == other_node.si:
					return 0
				else:
					return 1
			else:
				return 1

	def setup(self, ll_node):
		self.name = ll_node.instance
		self.spi = ll_node.spi
		self.si = ll_node.si
		return

	def get_nf_node_list(self):
		"""
		get_nf_node_list:
		This function returns a list of nf_node. It contains every nodes in the current
		NF graph, starting from the current node.
		"""
		res_list = []
		res_list.append(self)
		for tmp_node in self.adj_nodes:
			res_list += tmp_node.get_nf_node_list()
		return res_list

	def add_neighbor(self, neighbor):
		self.adj_nodes.append(neighbor)
		return
'''

def nfcp_nf_chain_length(p4_list):
	"""
	nfcp_nf_chain_length(...):
	The function returns the length of each NF service chain in terms of the
	# of P4 nodes.
	Input: p4_list (type=list)
	Output: length (type=int)
	"""
	nf_chain_length = []
	for node in p4_list:
		if node.service_path_id > len(nf_chain_length):
			nf_chain_length.append(node.service_id)
		else:
			len_n = len(nf_chain_length)
			if node.service_id > nf_chain_length[len_n-1]:
				nf_chain_length[len_n-1] = node.service_id
	return nf_chain_length


def nfcp_get_bess_module_name(module_name):
	"""
	nfcp_get_bess_module_name:
	The function removes the brackets and returns the BESS NF's name
	"""
	res = re.match(r"(.*)\((.*)\)", module_name, re.M|re.I)
	print res.group(0)
	return bess_module




