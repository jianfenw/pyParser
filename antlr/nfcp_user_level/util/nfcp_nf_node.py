
"""
* NFCP_NF_NODE.PY
* This file defines the 'class nf_node' data structure. It is used to hold information
* for each NF node.
* In order to manipulate each NF ndoe, a series of methods should be provided by this library.
* 
* Author: Jianfeng Wang
* Time: 02-26-2018
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


"""
    nfcp_nf_chain_count(...):
    This function returns the number of p4 service chains for the p4_list.
"""
def nfcp_nf_chain_count(p4_list):
	
    nf_chain_count = 0
    for node in p4_list:
        if node.service_path_id > nf_chain_count:
            nf_chain_count = node.service_path_id
    return nf_chain_count


"""
    nfcp_nf_chain_length(...):
    This function returns the length of each NF service chain in terms of the
    # of P4 nodes.
"""
def nfcp_nf_chain_length(p4_list):
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
    Typically, bess modules come with a pair of '\(\)'. Here, we return the name of the NF
    without any attribute.
    """
    res = re.match(r"(.*)\((.*)\)", module_name, re.M|re.I)
    bess_name = res.group(1)
    return bess_name


"""
    nfcp_module_type(...):
    This function will return:
    0, if the module is invalid;
    1, if the module is a P4 module;
    2, if the module is a BESS module;
    3, if the module can be either a P4 module or a BESS module;
"""
def nfcp_module_type(module_name):
    global bess_module_list
    global p4_module_list

    res = (module_name in bess_module_list) * 2 + (module_name in p4_module_list)
    return res


"""
    Note:
    nf_type = -1 -> default
    nf_type = 0 -> P4 module; 
    nf_type = 1 -> BESS module;
    nf_type = 2 -> both P4 and BESS;
"""
class nf_node(object):

    def __init__(self, nf_name=None, service_path_id = -1, seq_index = -1):
        self.name = nf_name
        self.nf_class = None
        self.service_path_id = service_path_id
        self.service_id = seq_index
        self.nf_type = nfcp_module_type(nf_name)
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

