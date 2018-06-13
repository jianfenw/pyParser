// Generated from NFCPUser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NFCPUserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MULTILINECOMMENT=11, SINGLELINECOMMENT=12, WHITESPACE=13, NEWLINE=14, 
		INT=15, FLOAT=16, STRING=17, BOOL=18, VARIABLENAME=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "MULTILINECOMMENT", "SINGLELINECOMMENT", "WHITESPACE", "NEWLINE", 
		"LOWERCASE", "UPPERCASE", "DIGIT", "INT", "FLOAT", "STRING", "WILDCARD", 
		"BOOL", "VARIABLENAME"
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


	public NFCPUserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NFCPUser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fK\n\f\f\f\16\fN\13\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\r\3\r\3\16\6\16a\n\16"+
		"\r\16\16\16b\3\16\3\16\3\17\5\17h\n\17\3\17\3\17\6\17l\n\17\r\17\16\17"+
		"m\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23w\n\23\r\23\16\23x\3\24\6\24"+
		"|\n\24\r\24\16\24}\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24\3"+
		"\24\3\24\6\24\u0089\n\24\r\24\16\24\u008a\5\24\u008d\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u0095\n\25\f\25\16\25\u0098\13\25\3\25\5\25\u009b"+
		"\n\25\3\26\7\26\u009e\n\26\f\26\16\26\u00a1\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00ac\n\27\3\30\3\30\3\30\3\30\6\30\u00b2"+
		"\n\30\r\30\16\30\u00b3\5L\u0096\u009f\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\21\'\22)\23+\2-"+
		"\24/\25\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\3\2c|\3\2C\\\3\2\62;\2\u00c3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67"+
		"\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25"+
		"C\3\2\2\2\27F\3\2\2\2\31T\3\2\2\2\33`\3\2\2\2\35k\3\2\2\2\37o\3\2\2\2"+
		"!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'\u008c\3\2\2\2)\u009a\3\2\2\2+\u009f\3"+
		"\2\2\2-\u00ab\3\2\2\2/\u00b1\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63\64\7"+
		"<\2\2\64\6\3\2\2\2\65\66\7*\2\2\66\b\3\2\2\2\678\7+\2\28\n\3\2\2\29:\7"+
		"]\2\2:\f\3\2\2\2;<\7.\2\2<\16\3\2\2\2=>\7_\2\2>\20\3\2\2\2?@\7}\2\2@\22"+
		"\3\2\2\2AB\7\177\2\2B\24\3\2\2\2CD\7/\2\2DE\7@\2\2E\26\3\2\2\2FG\7\61"+
		"\2\2GH\7,\2\2HL\3\2\2\2IK\13\2\2\2JI\3\2\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2"+
		"\2\2MO\3\2\2\2NL\3\2\2\2OP\7,\2\2PQ\7\61\2\2QR\3\2\2\2RS\b\f\2\2S\30\3"+
		"\2\2\2TU\7\61\2\2UV\7\61\2\2VZ\3\2\2\2WY\n\2\2\2XW\3\2\2\2Y\\\3\2\2\2"+
		"ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\b\r\2\2^\32\3\2\2\2_a\t\3"+
		"\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\16\2\2e\34"+
		"\3\2\2\2fh\7\17\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2il\7\f\2\2jl\7\17\2\2"+
		"kg\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\36\3\2\2\2op\t\4\2"+
		"\2p \3\2\2\2qr\t\5\2\2r\"\3\2\2\2st\t\6\2\2t$\3\2\2\2uw\5#\22\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y&\3\2\2\2z|\5#\22\2{z\3\2\2\2|}\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0083\7\60\2\2\u0080\u0082\5"+
		"#\22\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008d\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60"+
		"\2\2\u0087\u0089\5#\22\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c{\3\2\2\2"+
		"\u008c\u0086\3\2\2\2\u008d(\3\2\2\2\u008e\u008f\7)\2\2\u008f\u0090\5+"+
		"\26\2\u0090\u0091\7)\2\2\u0091\u009b\3\2\2\2\u0092\u0096\7$\2\2\u0093"+
		"\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\7$\2\2\u009a\u008e\3\2\2\2\u009a\u0092\3\2\2\2\u009b*\3\2\2\2\u009c"+
		"\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u00a0,\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3"+
		"\7H\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00ac\7g\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2"+
		"\u00aa\u00ac\7g\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac.\3\2"+
		"\2\2\u00ad\u00b2\5\37\20\2\u00ae\u00b2\5!\21\2\u00af\u00b2\5#\22\2\u00b0"+
		"\u00b2\7a\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\60\3\2\2\2\24\2LZbgkmx}\u0083\u008a\u008c\u0096\u009a"+
		"\u009f\u00ab\u00b1\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}