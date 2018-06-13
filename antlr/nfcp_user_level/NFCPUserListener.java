// Generated from NFCPUser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NFCPUserParser}.
 */
public interface NFCPUserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#total}.
	 * @param ctx the parse tree
	 */
	void enterTotal(NFCPUserParser.TotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#total}.
	 * @param ctx the parse tree
	 */
	void exitTotal(NFCPUserParser.TotalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NFCPUserParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NFCPUserParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_int}.
	 * @param ctx the parse tree
	 */
	void enterDefine_int(NFCPUserParser.Define_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_int}.
	 * @param ctx the parse tree
	 */
	void exitDefine_int(NFCPUserParser.Define_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_float}.
	 * @param ctx the parse tree
	 */
	void enterDefine_float(NFCPUserParser.Define_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_float}.
	 * @param ctx the parse tree
	 */
	void exitDefine_float(NFCPUserParser.Define_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_string}.
	 * @param ctx the parse tree
	 */
	void enterDefine_string(NFCPUserParser.Define_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_string}.
	 * @param ctx the parse tree
	 */
	void exitDefine_string(NFCPUserParser.Define_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_bool}.
	 * @param ctx the parse tree
	 */
	void enterDefine_bool(NFCPUserParser.Define_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_bool}.
	 * @param ctx the parse tree
	 */
	void exitDefine_bool(NFCPUserParser.Define_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_nlist}.
	 * @param ctx the parse tree
	 */
	void enterDefine_nlist(NFCPUserParser.Define_nlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_nlist}.
	 * @param ctx the parse tree
	 */
	void exitDefine_nlist(NFCPUserParser.Define_nlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_ntuple}.
	 * @param ctx the parse tree
	 */
	void enterDefine_ntuple(NFCPUserParser.Define_ntupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_ntuple}.
	 * @param ctx the parse tree
	 */
	void exitDefine_ntuple(NFCPUserParser.Define_ntupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_nlinkedlist}.
	 * @param ctx the parse tree
	 */
	void enterDefine_nlinkedlist(NFCPUserParser.Define_nlinkedlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_nlinkedlist}.
	 * @param ctx the parse tree
	 */
	void exitDefine_nlinkedlist(NFCPUserParser.Define_nlinkedlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_nfinstance}.
	 * @param ctx the parse tree
	 */
	void enterDefine_nfinstance(NFCPUserParser.Define_nfinstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_nfinstance}.
	 * @param ctx the parse tree
	 */
	void exitDefine_nfinstance(NFCPUserParser.Define_nfinstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_flowspec}.
	 * @param ctx the parse tree
	 */
	void enterDefine_flowspec(NFCPUserParser.Define_flowspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_flowspec}.
	 * @param ctx the parse tree
	 */
	void exitDefine_flowspec(NFCPUserParser.Define_flowspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#define_nfchain}.
	 * @param ctx the parse tree
	 */
	void enterDefine_nfchain(NFCPUserParser.Define_nfchainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#define_nfchain}.
	 * @param ctx the parse tree
	 */
	void exitDefine_nfchain(NFCPUserParser.Define_nfchainContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#configue_nfchain}.
	 * @param ctx the parse tree
	 */
	void enterConfigue_nfchain(NFCPUserParser.Configue_nfchainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#configue_nfchain}.
	 * @param ctx the parse tree
	 */
	void exitConfigue_nfchain(NFCPUserParser.Configue_nfchainContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#flowspec}.
	 * @param ctx the parse tree
	 */
	void enterFlowspec(NFCPUserParser.FlowspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#flowspec}.
	 * @param ctx the parse tree
	 */
	void exitFlowspec(NFCPUserParser.FlowspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#netfunction_chain}.
	 * @param ctx the parse tree
	 */
	void enterNetfunction_chain(NFCPUserParser.Netfunction_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#netfunction_chain}.
	 * @param ctx the parse tree
	 */
	void exitNetfunction_chain(NFCPUserParser.Netfunction_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#netfunction}.
	 * @param ctx the parse tree
	 */
	void enterNetfunction(NFCPUserParser.NetfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#netfunction}.
	 * @param ctx the parse tree
	 */
	void exitNetfunction(NFCPUserParser.NetfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#nlist}.
	 * @param ctx the parse tree
	 */
	void enterNlist(NFCPUserParser.NlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#nlist}.
	 * @param ctx the parse tree
	 */
	void exitNlist(NFCPUserParser.NlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#nlist_elem}.
	 * @param ctx the parse tree
	 */
	void enterNlist_elem(NFCPUserParser.Nlist_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#nlist_elem}.
	 * @param ctx the parse tree
	 */
	void exitNlist_elem(NFCPUserParser.Nlist_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#ntuple}.
	 * @param ctx the parse tree
	 */
	void enterNtuple(NFCPUserParser.NtupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#ntuple}.
	 * @param ctx the parse tree
	 */
	void exitNtuple(NFCPUserParser.NtupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#ntuple_elem}.
	 * @param ctx the parse tree
	 */
	void enterNtuple_elem(NFCPUserParser.Ntuple_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#ntuple_elem}.
	 * @param ctx the parse tree
	 */
	void exitNtuple_elem(NFCPUserParser.Ntuple_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#nlinkedlist}.
	 * @param ctx the parse tree
	 */
	void enterNlinkedlist(NFCPUserParser.NlinkedlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#nlinkedlist}.
	 * @param ctx the parse tree
	 */
	void exitNlinkedlist(NFCPUserParser.NlinkedlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NFCPUserParser#nlinkedlist_elem}.
	 * @param ctx the parse tree
	 */
	void enterNlinkedlist_elem(NFCPUserParser.Nlinkedlist_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NFCPUserParser#nlinkedlist_elem}.
	 * @param ctx the parse tree
	 */
	void exitNlinkedlist_elem(NFCPUserParser.Nlinkedlist_elemContext ctx);
}