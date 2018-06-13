// Generated from NFCPUser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NFCPUserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MULTILINECOMMENT=11, SINGLELINECOMMENT=12, WHITESPACE=13, NEWLINE=14, 
		INT=15, FLOAT=16, STRING=17, BOOL=18, VARIABLENAME=19;
	public static final int
		RULE_total = 0, RULE_line = 1, RULE_define_int = 2, RULE_define_float = 3, 
		RULE_define_string = 4, RULE_define_bool = 5, RULE_define_nlist = 6, RULE_define_ntuple = 7, 
		RULE_define_nlinkedlist = 8, RULE_define_nfinstance = 9, RULE_define_flowspec = 10, 
		RULE_define_nfchain = 11, RULE_configue_nfchain = 12, RULE_flowspec = 13, 
		RULE_netfunction_chain = 14, RULE_netfunction = 15, RULE_nlist = 16, RULE_nlist_elem = 17, 
		RULE_ntuple = 18, RULE_ntuple_elem = 19, RULE_nlinkedlist = 20, RULE_nlinkedlist_elem = 21;
	public static final String[] ruleNames = {
		"total", "line", "define_int", "define_float", "define_string", "define_bool", 
		"define_nlist", "define_ntuple", "define_nlinkedlist", "define_nfinstance", 
		"define_flowspec", "define_nfchain", "configue_nfchain", "flowspec", "netfunction_chain", 
		"netfunction", "nlist", "nlist_elem", "ntuple", "ntuple_elem", "nlinkedlist", 
		"nlinkedlist_elem"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':'", "'('", "')'", "'['", "','", "']'", "'{'", "'}'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "MULTILINECOMMENT", 
		"SINGLELINECOMMENT", "WHITESPACE", "NEWLINE", "INT", "FLOAT", "STRING", 
		"BOOL", "VARIABLENAME"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NFCPUser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NFCPUserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TotalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NFCPUserParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TotalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterTotal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitTotal(this);
		}
	}

	public final TotalContext total() throws RecognitionException {
		TotalContext _localctx = new TotalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_total);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				line();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE || _la==VARIABLENAME );
			}
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(NFCPUserParser.NEWLINE, 0); }
		public Define_intContext define_int() {
			return getRuleContext(Define_intContext.class,0);
		}
		public Define_floatContext define_float() {
			return getRuleContext(Define_floatContext.class,0);
		}
		public Define_stringContext define_string() {
			return getRuleContext(Define_stringContext.class,0);
		}
		public Define_boolContext define_bool() {
			return getRuleContext(Define_boolContext.class,0);
		}
		public Define_nlistContext define_nlist() {
			return getRuleContext(Define_nlistContext.class,0);
		}
		public Define_ntupleContext define_ntuple() {
			return getRuleContext(Define_ntupleContext.class,0);
		}
		public Define_nlinkedlistContext define_nlinkedlist() {
			return getRuleContext(Define_nlinkedlistContext.class,0);
		}
		public Define_nfinstanceContext define_nfinstance() {
			return getRuleContext(Define_nfinstanceContext.class,0);
		}
		public Define_flowspecContext define_flowspec() {
			return getRuleContext(Define_flowspecContext.class,0);
		}
		public Define_nfchainContext define_nfchain() {
			return getRuleContext(Define_nfchainContext.class,0);
		}
		public Configue_nfchainContext configue_nfchain() {
			return getRuleContext(Configue_nfchainContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(51);
				define_int();
				}
				break;
			case 2:
				{
				setState(52);
				define_float();
				}
				break;
			case 3:
				{
				setState(53);
				define_string();
				}
				break;
			case 4:
				{
				setState(54);
				define_bool();
				}
				break;
			case 5:
				{
				setState(55);
				define_nlist();
				}
				break;
			case 6:
				{
				setState(56);
				define_ntuple();
				}
				break;
			case 7:
				{
				setState(57);
				define_nlinkedlist();
				}
				break;
			case 8:
				{
				setState(58);
				define_nfinstance();
				}
				break;
			case 9:
				{
				setState(59);
				define_flowspec();
				}
				break;
			case 10:
				{
				setState(60);
				define_nfchain();
				}
				break;
			case 11:
				{
				setState(61);
				configue_nfchain();
				}
				break;
			}
			setState(64);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_intContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public TerminalNode INT() { return getToken(NFCPUserParser.INT, 0); }
		public Define_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_int(this);
		}
	}

	public final Define_intContext define_int() throws RecognitionException {
		Define_intContext _localctx = new Define_intContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VARIABLENAME);
			setState(67);
			match(T__0);
			setState(68);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_floatContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public TerminalNode FLOAT() { return getToken(NFCPUserParser.FLOAT, 0); }
		public Define_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_float(this);
		}
	}

	public final Define_floatContext define_float() throws RecognitionException {
		Define_floatContext _localctx = new Define_floatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VARIABLENAME);
			setState(71);
			match(T__0);
			setState(72);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_stringContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public TerminalNode STRING() { return getToken(NFCPUserParser.STRING, 0); }
		public Define_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_string(this);
		}
	}

	public final Define_stringContext define_string() throws RecognitionException {
		Define_stringContext _localctx = new Define_stringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(VARIABLENAME);
			setState(75);
			match(T__0);
			setState(76);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_boolContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public TerminalNode BOOL() { return getToken(NFCPUserParser.BOOL, 0); }
		public Define_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_bool(this);
		}
	}

	public final Define_boolContext define_bool() throws RecognitionException {
		Define_boolContext _localctx = new Define_boolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(VARIABLENAME);
			setState(79);
			match(T__0);
			setState(80);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_nlistContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public NlistContext nlist() {
			return getRuleContext(NlistContext.class,0);
		}
		public Define_nlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_nlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_nlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_nlist(this);
		}
	}

	public final Define_nlistContext define_nlist() throws RecognitionException {
		Define_nlistContext _localctx = new Define_nlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define_nlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VARIABLENAME);
			setState(83);
			match(T__0);
			setState(84);
			nlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_ntupleContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public NtupleContext ntuple() {
			return getRuleContext(NtupleContext.class,0);
		}
		public Define_ntupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_ntuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_ntuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_ntuple(this);
		}
	}

	public final Define_ntupleContext define_ntuple() throws RecognitionException {
		Define_ntupleContext _localctx = new Define_ntupleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_ntuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VARIABLENAME);
			setState(87);
			match(T__0);
			setState(88);
			ntuple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_nlinkedlistContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public NlinkedlistContext nlinkedlist() {
			return getRuleContext(NlinkedlistContext.class,0);
		}
		public Define_nlinkedlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_nlinkedlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_nlinkedlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_nlinkedlist(this);
		}
	}

	public final Define_nlinkedlistContext define_nlinkedlist() throws RecognitionException {
		Define_nlinkedlistContext _localctx = new Define_nlinkedlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_define_nlinkedlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(VARIABLENAME);
			setState(91);
			match(T__0);
			setState(92);
			nlinkedlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_nfinstanceContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public NetfunctionContext netfunction() {
			return getRuleContext(NetfunctionContext.class,0);
		}
		public Define_nfinstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_nfinstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_nfinstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_nfinstance(this);
		}
	}

	public final Define_nfinstanceContext define_nfinstance() throws RecognitionException {
		Define_nfinstanceContext _localctx = new Define_nfinstanceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_define_nfinstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(VARIABLENAME);
			setState(95);
			match(T__0);
			setState(96);
			netfunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_flowspecContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public FlowspecContext flowspec() {
			return getRuleContext(FlowspecContext.class,0);
		}
		public Define_flowspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_flowspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_flowspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_flowspec(this);
		}
	}

	public final Define_flowspecContext define_flowspec() throws RecognitionException {
		Define_flowspecContext _localctx = new Define_flowspecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_define_flowspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(VARIABLENAME);
			setState(99);
			match(T__0);
			setState(100);
			flowspec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_nfchainContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public Netfunction_chainContext netfunction_chain() {
			return getRuleContext(Netfunction_chainContext.class,0);
		}
		public Define_nfchainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_nfchain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterDefine_nfchain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitDefine_nfchain(this);
		}
	}

	public final Define_nfchainContext define_nfchain() throws RecognitionException {
		Define_nfchainContext _localctx = new Define_nfchainContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_define_nfchain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(VARIABLENAME);
			setState(103);
			match(T__0);
			setState(104);
			netfunction_chain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configue_nfchainContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(NFCPUserParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(NFCPUserParser.VARIABLENAME, i);
		}
		public Configue_nfchainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configue_nfchain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterConfigue_nfchain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitConfigue_nfchain(this);
		}
	}

	public final Configue_nfchainContext configue_nfchain() throws RecognitionException {
		Configue_nfchainContext _localctx = new Configue_nfchainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_configue_nfchain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(VARIABLENAME);
			setState(107);
			match(T__1);
			setState(108);
			match(VARIABLENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlowspecContext extends ParserRuleContext {
		public NlistContext nlist() {
			return getRuleContext(NlistContext.class,0);
		}
		public FlowspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterFlowspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitFlowspec(this);
		}
	}

	public final FlowspecContext flowspec() throws RecognitionException {
		FlowspecContext _localctx = new FlowspecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_flowspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			nlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Netfunction_chainContext extends ParserRuleContext {
		public NlinkedlistContext nlinkedlist() {
			return getRuleContext(NlinkedlistContext.class,0);
		}
		public Netfunction_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_netfunction_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNetfunction_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNetfunction_chain(this);
		}
	}

	public final Netfunction_chainContext netfunction_chain() throws RecognitionException {
		Netfunction_chainContext _localctx = new Netfunction_chainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_netfunction_chain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			nlinkedlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NetfunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public NetfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_netfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNetfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNetfunction(this);
		}
	}

	public final NetfunctionContext netfunction() throws RecognitionException {
		NetfunctionContext _localctx = new NetfunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_netfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			match(VARIABLENAME);
			setState(115);
			match(T__2);
			setState(116);
			match(T__3);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NlistContext extends ParserRuleContext {
		public List<Nlist_elemContext> nlist_elem() {
			return getRuleContexts(Nlist_elemContext.class);
		}
		public Nlist_elemContext nlist_elem(int i) {
			return getRuleContext(Nlist_elemContext.class,i);
		}
		public NlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNlist(this);
		}
	}

	public final NlistContext nlist() throws RecognitionException {
		NlistContext _localctx = new NlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__4);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << VARIABLENAME))) != 0)) {
					{
					setState(119);
					nlist_elem();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(122);
				nlist_elem();
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					match(T__5);
					setState(124);
					nlist_elem();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				}
				break;
			}
			setState(131);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nlist_elemContext extends ParserRuleContext {
		public NtupleContext ntuple() {
			return getRuleContext(NtupleContext.class,0);
		}
		public TerminalNode INT() { return getToken(NFCPUserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(NFCPUserParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(NFCPUserParser.STRING, 0); }
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public Nlist_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlist_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNlist_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNlist_elem(this);
		}
	}

	public final Nlist_elemContext nlist_elem() throws RecognitionException {
		Nlist_elemContext _localctx = new Nlist_elemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nlist_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(133);
				ntuple();
				}
				break;
			case INT:
				{
				setState(134);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(135);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(136);
				match(STRING);
				}
				break;
			case VARIABLENAME:
				{
				setState(137);
				match(VARIABLENAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NtupleContext extends ParserRuleContext {
		public List<Ntuple_elemContext> ntuple_elem() {
			return getRuleContexts(Ntuple_elemContext.class);
		}
		public Ntuple_elemContext ntuple_elem(int i) {
			return getRuleContext(Ntuple_elemContext.class,i);
		}
		public NtupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNtuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNtuple(this);
		}
	}

	public final NtupleContext ntuple() throws RecognitionException {
		NtupleContext _localctx = new NtupleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ntuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__7);
			{
			setState(141);
			ntuple_elem();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(142);
				match(T__5);
				setState(143);
				ntuple_elem();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(149);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ntuple_elemContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(NFCPUserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(NFCPUserParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(NFCPUserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(NFCPUserParser.FLOAT, 0); }
		public Ntuple_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntuple_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNtuple_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNtuple_elem(this);
		}
	}

	public final Ntuple_elemContext ntuple_elem() throws RecognitionException {
		Ntuple_elemContext _localctx = new Ntuple_elemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ntuple_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			match(STRING);
			}
			setState(152);
			match(T__1);
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NlinkedlistContext extends ParserRuleContext {
		public List<Nlinkedlist_elemContext> nlinkedlist_elem() {
			return getRuleContexts(Nlinkedlist_elemContext.class);
		}
		public Nlinkedlist_elemContext nlinkedlist_elem(int i) {
			return getRuleContext(Nlinkedlist_elemContext.class,i);
		}
		public NlinkedlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlinkedlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNlinkedlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNlinkedlist(this);
		}
	}

	public final NlinkedlistContext nlinkedlist() throws RecognitionException {
		NlinkedlistContext _localctx = new NlinkedlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nlinkedlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			nlinkedlist_elem();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(156);
				match(T__9);
				setState(157);
				nlinkedlist_elem();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nlinkedlist_elemContext extends ParserRuleContext {
		public NetfunctionContext netfunction() {
			return getRuleContext(NetfunctionContext.class,0);
		}
		public TerminalNode VARIABLENAME() { return getToken(NFCPUserParser.VARIABLENAME, 0); }
		public Nlinkedlist_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlinkedlist_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNlinkedlist_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNlinkedlist_elem(this);
		}
	}

	public final Nlinkedlist_elemContext nlinkedlist_elem() throws RecognitionException {
		Nlinkedlist_elemContext _localctx = new Nlinkedlist_elemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nlinkedlist_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(163);
				netfunction();
				}
				break;
			case 2:
				{
				setState(164);
				match(VARIABLENAME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22{\n\22\3\22\3\22\3\22\6\22\u0080"+
		"\n\22\r\22\16\22\u0081\5\22\u0084\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u008d\n\23\3\24\3\24\3\24\3\24\7\24\u0093\n\24\f\24\16\24\u0096"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00a1\n\26\f"+
		"\26\16\26\u00a4\13\26\3\27\3\27\5\27\u00a8\n\27\3\27\2\2\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\21\23\2\u00a9\2/\3\2\2\2"+
		"\4@\3\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16T\3\2\2\2\20"+
		"X\3\2\2\2\22\\\3\2\2\2\24`\3\2\2\2\26d\3\2\2\2\30h\3\2\2\2\32l\3\2\2\2"+
		"\34p\3\2\2\2\36r\3\2\2\2 t\3\2\2\2\"x\3\2\2\2$\u008c\3\2\2\2&\u008e\3"+
		"\2\2\2(\u0099\3\2\2\2*\u009d\3\2\2\2,\u00a7\3\2\2\2.\60\5\4\3\2/.\3\2"+
		"\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\2\2"+
		"\3\64\3\3\2\2\2\65A\5\6\4\2\66A\5\b\5\2\67A\5\n\6\28A\5\f\7\29A\5\16\b"+
		"\2:A\5\20\t\2;A\5\22\n\2<A\5\24\13\2=A\5\26\f\2>A\5\30\r\2?A\5\32\16\2"+
		"@\65\3\2\2\2@\66\3\2\2\2@\67\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3"+
		"\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7"+
		"\20\2\2C\5\3\2\2\2DE\7\25\2\2EF\7\3\2\2FG\7\21\2\2G\7\3\2\2\2HI\7\25\2"+
		"\2IJ\7\3\2\2JK\7\22\2\2K\t\3\2\2\2LM\7\25\2\2MN\7\3\2\2NO\7\23\2\2O\13"+
		"\3\2\2\2PQ\7\25\2\2QR\7\3\2\2RS\7\24\2\2S\r\3\2\2\2TU\7\25\2\2UV\7\3\2"+
		"\2VW\5\"\22\2W\17\3\2\2\2XY\7\25\2\2YZ\7\3\2\2Z[\5&\24\2[\21\3\2\2\2\\"+
		"]\7\25\2\2]^\7\3\2\2^_\5*\26\2_\23\3\2\2\2`a\7\25\2\2ab\7\3\2\2bc\5 \21"+
		"\2c\25\3\2\2\2de\7\25\2\2ef\7\3\2\2fg\5\34\17\2g\27\3\2\2\2hi\7\25\2\2"+
		"ij\7\3\2\2jk\5\36\20\2k\31\3\2\2\2lm\7\25\2\2mn\7\4\2\2no\7\25\2\2o\33"+
		"\3\2\2\2pq\5\"\22\2q\35\3\2\2\2rs\5*\26\2s\37\3\2\2\2tu\7\25\2\2uv\7\5"+
		"\2\2vw\7\6\2\2w!\3\2\2\2x\u0083\7\7\2\2y{\5$\23\2zy\3\2\2\2z{\3\2\2\2"+
		"{\u0084\3\2\2\2|\177\5$\23\2}~\7\b\2\2~\u0080\5$\23\2\177}\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083z\3\2\2\2\u0083|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\t\2"+
		"\2\u0086#\3\2\2\2\u0087\u008d\5&\24\2\u0088\u008d\7\21\2\2\u0089\u008d"+
		"\7\22\2\2\u008a\u008d\7\23\2\2\u008b\u008d\7\25\2\2\u008c\u0087\3\2\2"+
		"\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d%\3\2\2\2\u008e\u008f\7\n\2\2\u008f\u0094\5(\25\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0093\5(\25\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\13\2\2\u0098\'\3\2\2\2\u0099\u009a\7\23\2"+
		"\2\u009a\u009b\7\4\2\2\u009b\u009c\t\2\2\2\u009c)\3\2\2\2\u009d\u00a2"+
		"\5,\27\2\u009e\u009f\7\f\2\2\u009f\u00a1\5,\27\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3+\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00a8\5 \21\2\u00a6\u00a8\7\25\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8-\3\2\2\2\13\61@z\u0081\u0083\u008c"+
		"\u0094\u00a2\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}