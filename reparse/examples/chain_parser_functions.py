"""
* chain_parser_functions.py
*
* Author: Jianfeng Wang
* Time: 05/24/2018
"""





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

def assign_type_2():
	return

functions = {
	'basic_assign_traffic_type' : assign_type_2,
}
