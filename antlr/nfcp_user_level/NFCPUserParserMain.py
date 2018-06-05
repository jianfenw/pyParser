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
from antlr4 import *
from NFCPUserLexer import NFCPUserLexer
from NFCPUserParser import NFCPUserParser
from NFCPUserListener import NFCPUserListener
from UDNFCPUserListener import UDNFCPUserListener


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
	scaner = UDNFCPUserListener()
	walker = ParseTreeWalker()
	walker.walk(scaner, tree)
	print("Walker: OK")

	print "# 1 Nickname - NF mapping:", scaner.nickname_nf_mapping
	print "# 2 Nickname - TT mapping:", scaner.nickname_tt_mapping
	print "# 3 Nickname - SP mapping:", scaner.nickname_sp_mapping
	print '# 4 TT - SP mapping:', scaner.tt_sp_mapping
	print 'Total # of SP:', scaner.service_path_count
	print("NFCP User-Level Parser Finished!")

	return



def nf_chain_parser_get_nickname_nf_mapping():
	nickname_nf_mapping = {}

	return


def nf_chain_parser_tester(argv):
	print "NF Chain Parser begins:"
	
	print "List all user-level configuration scripts:"
	#subprocess.call(['ls', './user_level_examples'])
	# return # for test subprocess

	#config_filename = raw_input("Please input the NF chain configuration filename:\n")
	config_filename = 'example.conf'
	nf_chain_parser_main(config_filename)

	# Test whether the service_path_id and service_id are correctly set up
	p4_list, bess_list = [], []
	print("# of P4 modules: %d, # of BESS modules: %d" %( len(p4_list), len(bess_list) ))

	return



if __name__ == '__main__':
	nf_chain_parser_tester(sys.argv)





