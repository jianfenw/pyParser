from __future__ import print_function
import sys
from antlr4 import *
from NFCPUserParser import NFCPUserParser
from NFCPUserListener import NFCPUserListener

class UDNFCPUserListener(NFCPUserListener):
	def __init__(self):
		self.nickname_nf_mapping = {}
		self.nickname_tt_mapping = {}
		self.nickname_sp_mapping = {}
		self.tt_sp_mapping = []

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


	# Line type # 3
	# Enter a parse tree produced by NFCPUserParser#nick_service_path.
	def enterNick_service_path(self, ctx):
		nickname_tt = str(ctx.WORD())

		# nf_chain_list is a list of NFs' name
		self.service_path_count += 1
		nf_chain_obj = ctx.nf_chain()
		nf_chain_list = self.get_nf_chain_list(nf_chain_obj)
		#print(nickname_tt, nf_chain_list)
		self.nickname_sp_mapping[nickname_tt] = (self.service_path_count, nf_chain_list)
		self.overall_nf_chain_list.append(nf_chain_list)
		pass

	# Exit a parse tree produced by NFCPUserParser#nick_service_path.
	def exitNick_service_path(self, ctx):
		pass


	# Line type # 4
	# Enter a parse tree produced by NFCPUserParser#tt_service_path.
	# tt : sp
	def enterTt_service_path(self, ctx):
		tt_obj = ctx.traffic_type()
		#print(self.get_traffic_type(tt_obj))
		traffic_type_list = self.get_traffic_type(tt_obj)

		# nf_chain_list is a list of NFs' name
		self.service_path_count += 1
		nf_chain_obj = ctx.nf_chain()
		nf_chain_list = self.get_nf_chain_list(nf_chain_obj)
		#print(traffic_type_list, nf_chain_list)
		self.tt_sp_mapping.append((traffic_type_list, (self.service_path_count, nf_chain_list)))
		self.overall_nf_chain_list.append(nf_chain_list)
		pass

	# Exit a parse tree produced by NFCPUserParser#tt_service_path.
	def exitTt_service_path(self, ctx):
		pass


	def get_nf_chain_list(self, nf_chain_obj):
		nf_chain_list = []
		nf_chain_obj_list = nf_chain_obj.nf()
		for nf_obj in nf_chain_obj_list:
			nf_name = str(nf_obj.WORD())
			if nf_name == 'None':
				nf_name = str(nf_obj.BESSNF())
			nf_chain_list.append(nf_name)
		return nf_chain_list

	# Line type # 2
	# Enter a parse tree produced by NFCPUserParser#nickname_tt.
	def enterNickname_tt(self, ctx):
		nickname_tt = str(ctx.WORD())
		traffic_type_obj = ctx.traffic_type()
		traffic_type_list = self.get_traffic_type(traffic_type_obj)
		#print(nickname_tt, traffic_type_list)
		self.nickname_tt_mapping[nickname_tt] = traffic_type_list
		pass

	def get_traffic_type(self, traffic_type_obj):
		# Create the list of basic traffic type obj based on the traffic type object
		traffic_type_list = []
		traffic_type_obj_list = traffic_type_obj.basic_traffic_type()
		for basic_tt_obj in traffic_type_obj_list:
			traffic_type_list.append(self.get_basic_traffic_type(basic_tt_obj))
		
		return traffic_type_list

	def get_basic_traffic_type(self, basic_traffic_type_obj):
		tt_obj = basic_traffic_type_obj
		tt = (str(tt_obj.WORD(0)), str(tt_obj.WORD(1)), str(tt_obj.WORD(2)))
		return tt

	# Exit a parse tree produced by NFCPUserParser#nickname_tt.
	def exitNickname_tt(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#traffic_type.
	def enterTraffic_type(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#traffic_type.
	def exitTraffic_type(self, ctx):
		pass

	# Enter a parse tree produced by NFCPUserParser#basic_traffic_type.
	def enterBasic_traffic_type(self, ctx):
		tt = (str(ctx.WORD(0)), str(ctx.WORD(1)), str(ctx.WORD(2)))
		return tt

	# Exit a parse tree produced by NFCPUserParser#basic_traffic_type.
	def exitBasic_traffic_type(self, ctx):
		pass


	# Line type # 1
	# Enter a parse tree produced by NFCPUserParser#nickname_nf.
	# Typically, people will tend to assign nickname for BESS NFs
	def enterNickname_nf(self, ctx):
		nf_nickname = str(ctx.WORD())
		nf_name = str(ctx.nf().WORD())
		if nf_name == 'None':
			nf_name = str(ctx.nf().BESSNF())
		#print( "NickName: %s - NF: %s" %(nf_nickname, nf_name))
		self.nickname_nf_mapping[nf_nickname] = nf_name
		pass

	# Exit a parse tree produced by NFCPUserParser#nickname_nf.
	def exitNickname_nf(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nf_chain.
	def enterNf_chain(self, ctx):
		pass

	# Exit a parse tree produced by NFCPUserParser#nf_chain.
	def exitNf_chain(self, ctx):
		pass


	# Enter a parse tree produced by NFCPUserParser#nf
	def enterNf(self, ctx):
		if ctx.WORD() != None:
			print( "NF's name:", str(ctx.WORD()) )
		else:
			print( "NF's name:", str(ctx.BESSNF()) )
		pass

	# Exit a parse tree produced by NFCPUserParser#nf
	def exitNf(self, ctx):
		pass


