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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MULTILINECOMMENT=9, 
		SINGLELINECOMMENT=10, WORD=11, BESSNF=12, WHITESPACE=13, NEWLINE=14;
	public static final int
		RULE_total = 0, RULE_line = 1, RULE_nick_service_path = 2, RULE_tt_service_path = 3, 
		RULE_nickname_tt = 4, RULE_traffic_type = 5, RULE_basic_traffic_type = 6, 
		RULE_nickname_nf = 7, RULE_nf_chain = 8, RULE_nf = 9;
	public static final String[] ruleNames = {
		"total", "line", "nick_service_path", "tt_service_path", "nickname_tt", 
		"traffic_type", "basic_traffic_type", "nickname_nf", "nf_chain", "nf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'::'", "'{'", "'}'", "'('", "','", "')'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "MULTILINECOMMENT", 
		"SINGLELINECOMMENT", "WORD", "BESSNF", "WHITESPACE", "NEWLINE"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				line();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << WORD) | (1L << NEWLINE))) != 0) );
			setState(25);
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
		public Nickname_ttContext nickname_tt() {
			return getRuleContext(Nickname_ttContext.class,0);
		}
		public Nickname_nfContext nickname_nf() {
			return getRuleContext(Nickname_nfContext.class,0);
		}
		public Nick_service_pathContext nick_service_path() {
			return getRuleContext(Nick_service_pathContext.class,0);
		}
		public Tt_service_pathContext tt_service_path() {
			return getRuleContext(Tt_service_pathContext.class,0);
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(27);
				nickname_tt();
				}
				break;
			case 2:
				{
				setState(28);
				nickname_nf();
				}
				break;
			case 3:
				{
				setState(29);
				nick_service_path();
				}
				break;
			case 4:
				{
				setState(30);
				tt_service_path();
				}
				break;
			}
			setState(33);
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

	public static class Nick_service_pathContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(NFCPUserParser.WORD, 0); }
		public Nf_chainContext nf_chain() {
			return getRuleContext(Nf_chainContext.class,0);
		}
		public Nick_service_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nick_service_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNick_service_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNick_service_path(this);
		}
	}

	public final Nick_service_pathContext nick_service_path() throws RecognitionException {
		Nick_service_pathContext _localctx = new Nick_service_pathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nick_service_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(WORD);
			setState(36);
			match(T__0);
			setState(37);
			nf_chain();
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

	public static class Tt_service_pathContext extends ParserRuleContext {
		public Traffic_typeContext traffic_type() {
			return getRuleContext(Traffic_typeContext.class,0);
		}
		public Nf_chainContext nf_chain() {
			return getRuleContext(Nf_chainContext.class,0);
		}
		public Tt_service_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tt_service_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterTt_service_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitTt_service_path(this);
		}
	}

	public final Tt_service_pathContext tt_service_path() throws RecognitionException {
		Tt_service_pathContext _localctx = new Tt_service_pathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tt_service_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			traffic_type();
			setState(40);
			match(T__0);
			setState(41);
			nf_chain();
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

	public static class Nickname_ttContext extends ParserRuleContext {
		public Traffic_typeContext traffic_type() {
			return getRuleContext(Traffic_typeContext.class,0);
		}
		public TerminalNode WORD() { return getToken(NFCPUserParser.WORD, 0); }
		public Nickname_ttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nickname_tt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNickname_tt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNickname_tt(this);
		}
	}

	public final Nickname_ttContext nickname_tt() throws RecognitionException {
		Nickname_ttContext _localctx = new Nickname_ttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nickname_tt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(43);
			match(WORD);
			}
			setState(44);
			match(T__1);
			setState(45);
			traffic_type();
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

	public static class Traffic_typeContext extends ParserRuleContext {
		public List<Basic_traffic_typeContext> basic_traffic_type() {
			return getRuleContexts(Basic_traffic_typeContext.class);
		}
		public Basic_traffic_typeContext basic_traffic_type(int i) {
			return getRuleContext(Basic_traffic_typeContext.class,i);
		}
		public Traffic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traffic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterTraffic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitTraffic_type(this);
		}
	}

	public final Traffic_typeContext traffic_type() throws RecognitionException {
		Traffic_typeContext _localctx = new Traffic_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_traffic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				basic_traffic_type();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(53);
			match(T__3);
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

	public static class Basic_traffic_typeContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(NFCPUserParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(NFCPUserParser.WORD, i);
		}
		public Basic_traffic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_traffic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterBasic_traffic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitBasic_traffic_type(this);
		}
	}

	public final Basic_traffic_typeContext basic_traffic_type() throws RecognitionException {
		Basic_traffic_typeContext _localctx = new Basic_traffic_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basic_traffic_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			match(WORD);
			setState(57);
			match(T__5);
			setState(58);
			match(WORD);
			setState(59);
			match(T__5);
			setState(60);
			match(WORD);
			setState(61);
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

	public static class Nickname_nfContext extends ParserRuleContext {
		public NfContext nf() {
			return getRuleContext(NfContext.class,0);
		}
		public TerminalNode WORD() { return getToken(NFCPUserParser.WORD, 0); }
		public Nickname_nfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nickname_nf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNickname_nf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNickname_nf(this);
		}
	}

	public final Nickname_nfContext nickname_nf() throws RecognitionException {
		Nickname_nfContext _localctx = new Nickname_nfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nickname_nf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			match(WORD);
			}
			setState(64);
			match(T__1);
			setState(65);
			nf();
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

	public static class Nf_chainContext extends ParserRuleContext {
		public List<NfContext> nf() {
			return getRuleContexts(NfContext.class);
		}
		public NfContext nf(int i) {
			return getRuleContext(NfContext.class,i);
		}
		public Nf_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nf_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNf_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNf_chain(this);
		}
	}

	public final Nf_chainContext nf_chain() throws RecognitionException {
		Nf_chainContext _localctx = new Nf_chainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nf_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			nf();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(68);
				match(T__7);
				setState(69);
				nf();
				}
				}
				setState(74);
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

	public static class NfContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(NFCPUserParser.WORD, 0); }
		public TerminalNode BESSNF() { return getToken(NFCPUserParser.BESSNF, 0); }
		public NfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).enterNf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NFCPUserListener ) ((NFCPUserListener)listener).exitNf(this);
		}
	}

	public final NfContext nf() throws RecognitionException {
		NfContext _localctx = new NfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==BESSNF) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\6\7\64\n\7\r\7"+
		"\16\7\65\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\7\nI\n\n\f\n\16\nL\13\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\3\3\2\r\16\2L\2\27\3\2\2\2\4!\3\2\2\2\6%\3\2\2\2\b)\3\2\2\2\n"+
		"-\3\2\2\2\f\61\3\2\2\2\169\3\2\2\2\20A\3\2\2\2\22E\3\2\2\2\24M\3\2\2\2"+
		"\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\"\5\n\6\2\36\"\5\20\t\2\37"+
		"\"\5\6\4\2 \"\5\b\5\2!\35\3\2\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2!\""+
		"\3\2\2\2\"#\3\2\2\2#$\7\20\2\2$\5\3\2\2\2%&\7\r\2\2&\'\7\3\2\2\'(\5\22"+
		"\n\2(\7\3\2\2\2)*\5\f\7\2*+\7\3\2\2+,\5\22\n\2,\t\3\2\2\2-.\7\r\2\2./"+
		"\7\4\2\2/\60\5\f\7\2\60\13\3\2\2\2\61\63\7\5\2\2\62\64\5\16\b\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7"+
		"\6\2\28\r\3\2\2\29:\7\7\2\2:;\7\r\2\2;<\7\b\2\2<=\7\r\2\2=>\7\b\2\2>?"+
		"\7\r\2\2?@\7\t\2\2@\17\3\2\2\2AB\7\r\2\2BC\7\4\2\2CD\5\24\13\2D\21\3\2"+
		"\2\2EJ\5\24\13\2FG\7\n\2\2GI\5\24\13\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2J"+
		"K\3\2\2\2K\23\3\2\2\2LJ\3\2\2\2MN\t\2\2\2N\25\3\2\2\2\6\31!\65J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}