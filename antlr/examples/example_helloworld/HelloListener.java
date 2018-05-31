// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#total}.
	 * @param ctx the parse tree
	 */
	void enterTotal(HelloParser.TotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#total}.
	 * @param ctx the parse tree
	 */
	void exitTotal(HelloParser.TotalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HelloParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HelloParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#helloworld}.
	 * @param ctx the parse tree
	 */
	void enterHelloworld(HelloParser.HelloworldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#helloworld}.
	 * @param ctx the parse tree
	 */
	void exitHelloworld(HelloParser.HelloworldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(HelloParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(HelloParser.ColorContext ctx);
}