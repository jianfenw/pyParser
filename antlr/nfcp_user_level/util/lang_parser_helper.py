"""
* 
* Author: Jianfeng Wang
* Time: 04-06-2017
* Email: jianfenw@usc.edu
*
* Author: Jane Yen
* Time: 04-06-2018
* Email: yeny@usc.edu
*
"""

import re

# General Lang Parser Helper
def convert_str_to_list(gen_line):
	"""
	This function will convert a list written in string into a real python list
	e.g. "[a, b, c]" -> ['a', 'b', 'c']
	"""
	res = []
	parse_result_multi = re.match(r"\[(.*),(.*)\]", gen_line, re.M|re.I)
	if parse_result_multi:
		#print parse_result_multi.group(1), parse_result_multi.group(2)
		res += convert_str_to_list("[%s]"%(parse_result_multi.group(1)))
		res.append(parse_result_multi.group(2))
	else:
		parse_result_single = re.match(r"\[(.*)\]", gen_line, re.M|re.I)
		if parse_result_single:
			res.append(parse_result_single.group(1))
	return res

def convert_str_to_str(gen_line):
	"""
	This function will convert a 
	"""

# User-level Lang Parser Helper

global built_in_traffic_type
global built_in_traffic_type_lookup_table

built_in_traffic_type = {'IP_Traffic':('srcip', 'dstip'), \
	'TCP_Traffic':('sport', 'dport'), \
	'ALL_Traffic':() \
	}

built_in_traffic_type_lookup_table = {
	'IP_Traffic':{'IP_Traffic':'hdr.ipv4', 'srcip':'srcAddr', 'dstip':'dstAddr'}, \
	'TCP_Traffic':{'TCP_Traffic':'hdr.tcp', 'sport':'srcPort', 'dport':'dstPort'}, \
	'ALL_Traffic':{'ALL_Traffic':''} \
	}

def is_empty_line(user_line):
	return (len(user_line.strip()) == 0)

def user_parser_traffic_type(user_line):
	"""
	Input: 'xxx_Traffic(arguments)'
	Ouput: res [= ('xxx_Traffic': arguments)] / otherwise return None
	"""
	res = None
	parse_result = re.match(r"(.*)\((.*)\)", user_line, re.M|re.I)
	# Match IP Traffic
	if parse_result and parse_result.group(1) == 'IP_Traffic':
		return ('IP_Traffic', convert_str_to_list(parse_result.group(2)) )
	# Match TCP Traffic
	if parse_result and parse_result.group(1) == 'TCP_Traffic':
		return ('TCP_Traffic', convert_str_to_list(parse_result.group(2)) )
	
	if parse_result and parse_result.group(1) == 'ALL_Traffic':
		return ('ALL_Traffic', [] )
	return res

def user_parser_nickname(user_line):
	"""
	This function is used to parse 'Nickname::Standard_name'
	"""
	parse_result = re.match(r"(.*)::(.*)", user_line, re.M|re.I)
	return parse_result.group(1).strip(), parse_result.group(2).strip()


def user_parser_nf_chain(user_line):
	"""
	This function is used to parse "traffic: nf_chain"
	"""
	parse_result = re.match(r"(.*):(.*)", user_line, re.M|re.I)
	return parse_result.group(1).strip(), parse_result.group(2).strip()


# Developer-level Lang Parser Helper
# In the P4 library level, the compiler have to parse different tags for each library
# Here, most functions are written for these tags.

def lib_parser_default_prefix(user_line):
	"""
	This function is used to parse "default_prefix = 'xxx'
	"""
	parse_result = re.match(r"default_prefix(.*)=(.*)", user_line, re.M|re.I)
	return parse_result


def lib_parser_header(user_line):
	# header
	
	return


def lib_parser_parser(user_line):
	# parser
	return


def lib_parser_ingress(user_line):
	# ingress
	return


def lib_parser_egress(user_line):
	# egress
	return


def lib_parser_deparser(user_line):
	return



def lang_parser_tester_main():
	filename = "./example_two_sp.conf"

	# Test general parsing functions

	# 1. convert_str_to_list
	print convert_str_to_list("[a, b, c]")
	
	# Test user_parser



	# Test lib_parser

	# 1. header

	# 2. parser
	# 3. ingress
	# 4. egress
	# 5. deparser

	return

if __name__ == "__main__":
	lang_parser_tester_main()


