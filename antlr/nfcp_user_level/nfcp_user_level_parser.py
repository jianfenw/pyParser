"""
* 
* NF_CHAIN_PARSER.PY - 
* This script is used to parse the NFCP user-level configuration file.
* 
* The user-level configuration file looks like the following - 
* L2 -> L3 -> ACL
* (The NF chain contains 3 network functions, i.e. L2, L3, and ACL)
* 
* The script will parse network functions in the NF chain.
* These NFs will be stored in two lists, one for P4 libraries and the other one for 
* BESS modules. 
* There are two modules that process the two sets seperately. For P4 libraries, the 
* P4 parser module will combine all P4 libraries together and output the final P4 code. 
* For BESS modules, the BESS parser module will generate a correct BESS configuration 
* file, which can be directly run in the BESS system (bessctl).
* 
* Author: Jianfeng Wang
* Time: 01-19-2017
* Email: jianfenw@usc.edu
*
"""
import sys
import os
import subprocess
import collections
import copy
from util.nfcp_nf_node import *
from util.lang_parser_helper import *
from antlr4 import *
from NFCPUserLexer import NFCPUserLexer
from NFCPUserParser import NFCPUserParser
from NFCPUserListener import NFCPUserListener
from UDNFCPUserListener import UDNFCPUserListener, linkedlist_node


'''
<NFCP script language>
- Provide a Click-like module connection semantics
- All syntactic sugars must be able to co-exist with original Python syntax.
--------------------------------------------------------------------------------
No.		Syntax 						Semantics 				
--------------------------------------------------------------------------------
1		a -> b 						Connect module a and b
2		{'TCP', 'dport', '1000'}	Define a traffic type
3		{} : a -> b -> c 			Assign a traffic type to a network function chain
4		traff_a::{}					Assign a nickname to a traffic type
5		traff_a : a -> b -> c 		Assign a traffic name to a network function chain
6 		nick_name::standard_name 	Assign a nickname to a standard name
7 		a -> nick_name -> b 		Use a nickname to represent a standard module
'''


"""
def nf_chain_get_nf_node_list(scanner):
	p4_list, bess_list = [], []
	curr_sp = 1
	curr_idx = 1
	nsh_encap_required = True
	for nf_chain in scanner.overall_nf_chain_list:
		for nf in nf_chain:
			nf_name = copy.deepcopy(nf)
			tmp_nf_node = nf_node(nf_name, curr_sp, curr_idx)
			if tmp_nf_node.nf_type == 0: # nf_type == 0 (unknown NF name - must be a nickname)
				nf_name = scanner.nickname_nf_mapping[nf_name]
				nf_name = nfcp_get_bess_module_name(nf_name)
				tmp_nf_node = nf_node(nf_name, curr_sp, curr_idx)

			if tmp_nf_node.nf_type == 1: # P4 node
				p4_list.append(tmp_nf_node)
				nsh_encap_required = True
			elif tmp_nf_node.nf_type == 2: # BESS node (however, we still have to create a NSHEncap on P4 side)
				bess_list.append(tmp_nf_node)
				if nsh_encap_required:
					nsh_encap_node = nf_node('NSHEncap', curr_sp, curr_idx)
					p4_list.append(nsh_encap_node)
					nsh_encap_required = False
			
			curr_idx += 1
		curr_sp += 1
		curr_idx = 1
	#print "# of P4 nodes:", len(p4_list)
	#print "# of BESS nodes:", len(bess_list)
	return p4_list, bess_list
"""


def nf_chain_get_nf_node_graph(scanner):



	return


def nf_chain_parser_main(config_filename):
	"""
	This function is used to parse the NFCP user-level configuration script.
	It will return:
	(1) nickname - nf mapping
	(2) nickname - tt mapping
	(3) tt - nf chain mapping
	(4) nickname - nf chain mapping
	"""

	nickname_nf_mapping = {}

	conf_input = FileStream(config_filename)
	lexer = NFCPUserLexer(conf_input)
	print("Lexer: OK")

	stream = CommonTokenStream(lexer)
	print("Stream: OK")

	parser = NFCPUserParser(stream)
	print("Parser: OK")

	tree = parser.total()
	scanner = UDNFCPUserListener()
	walker = ParseTreeWalker()
	walker.walk(scanner, tree)
	print("Walker: OK")
	
	print "Tests for basic data types"
	print "# 1 Lookup Table for INT variables:", scanner.var_int_dict
	print "# 2 Lookup Table for FLOAT variables:", scanner.var_float_dict
	print "# 3 Lookup Table for STRING variables:", scanner.var_string_dict
	print "# 4 Lookup Table for BOOL variables:", scanner.var_bool_dict

	print "Tests for NetFunctions"
	print "# 5 Lookup Table for NetFunc instances:", scanner.func_dict

	print "Tests for structured data types - ntuple, nlist, nlinkedlist"
	print "# 6 Lookup Table for ntuple instances:", scanner.struct_ntuple_dict
	print "# 7 Lookup Table for nlist instances:", scanner.struct_nlist_dict
	print "# 8 Lookup Table for nlinkedlist instances:", scanner.struct_nlinkedlist_dict
	for key, val in scanner.struct_nlinkedlist_dict.items():
		print '-', key, '-length', val.get_length()

	#print "# 9 Print a nlinkedlist w/o branches:"
	#print "- linkedlist_a:", scanner.struct_nlinkedlist_dict['linkedlist_a']
	#print "- linkedlist_b:", scanner.struct_nlinkedlist_dict['linkedlist_b']
	print "# 10 Print a nlinkedlist:"
	print "  - sp_1:", scanner.struct_nlinkedlist_dict['sp_1']
	print "print all nodes in netchain sp_1"
	service_path_1 = scanner.struct_nlinkedlist_dict['sp_1'].get_all_nodes()
	for node in service_path_1:
		print node.instance, node.spi, node.si

	print "  - sp_2:", scanner.struct_nlinkedlist_dict['sp_2']
	print "print all nodes in netchain sp_2"
	service_path_2 = scanner.struct_nlinkedlist_dict['sp_2'].get_all_nodes()
	for node in service_path_2:
		print node.instance, node.spi, node.si

	print "# 11 Print a formatted Network Function Chain:"
	print '  - sp_1:\n', scanner.struct_nlinkedlist_dict['sp_1']._draw_pipeline()
	print '  - sp_2:\n', scanner.struct_nlinkedlist_dict['sp_2']._draw_pipeline()
	print '  - sp_3:\n', scanner.struct_nlinkedlist_dict['sp_3']._draw_pipeline()

	return None, None # test walker for basic data types, and structured data types

	print 'Total # of SP:', scanner.service_path_count
	print scanner.overall_nf_chain_list
	print("NFCP User-Level Parser Finished!")

	p4_list, bess_list = nf_chain_get_nf_node_list(scanner)
	return p4_list, bess_list


def nf_chain_parser_tester(argv):
	print "NF Chain Parser begins:"
	
	print "List all user-level configuration scripts:"
	subprocess.call(['ls', './user_level_examples'])
	# return # for test subprocess

	#config_filename = raw_input("Please input the NF chain configuration filename:\n")
	#p4_list, bess_list = nf_chain_parser_main('./user_level_examples/'+config_filename)
	config_filename = 'example.conf'
	p4_list, bess_list = nf_chain_parser_main(config_filename)
	return
	# Test whether the service_path_id and service_id are correctly set up
	print("# of P4 modules: %d, # of BESS modules: %d" %( len(p4_list), len(bess_list) ))
	for p4_node in p4_list:
		print "%s: sp=%d, sidx=%d" %(p4_node.name, p4_node.service_path_id, p4_node.service_id)

	return


if __name__ == '__main__':
	nf_chain_parser_tester(sys.argv)





