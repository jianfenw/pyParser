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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MULTILINECOMMENT=9, 
		SINGLELINECOMMENT=10, WORD=11, BESSNF=12, WHITESPACE=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "LOWERCASE", 
		"UPPERCASE", "NUMBER", "MULTILINECOMMENT", "SINGLELINECOMMENT", "WORD", 
		"BESSNF", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\rB\n\r\f\r\16\rE\13\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16P\n\16\f\16\16\16S\13\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\6\17[\n\17\r\17\16\17\\\3\20\3\20\3\20\3"+
		"\20\3\21\6\21d\n\21\r\21\16\21e\3\21\3\21\3\22\5\22k\n\22\3\22\3\22\6"+
		"\22o\n\22\r\22\16\22p\3C\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2"+
		"\25\2\27\2\31\13\33\f\35\r\37\16!\17#\20\3\2\b\3\2c|\3\2C\\\3\2\62;\4"+
		"\2\f\f\17\17\4\2\60\60aa\4\2\13\13\"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3"+
		"\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\67\3\2\2\2\259\3\2\2\2\27;\3\2\2"+
		"\2\31=\3\2\2\2\33K\3\2\2\2\35Z\3\2\2\2\37^\3\2\2\2!c\3\2\2\2#n\3\2\2\2"+
		"%&\7<\2\2&\4\3\2\2\2\'(\7<\2\2()\7<\2\2)\6\3\2\2\2*+\7}\2\2+\b\3\2\2\2"+
		",-\7\177\2\2-\n\3\2\2\2./\7*\2\2/\f\3\2\2\2\60\61\7.\2\2\61\16\3\2\2\2"+
		"\62\63\7+\2\2\63\20\3\2\2\2\64\65\7/\2\2\65\66\7@\2\2\66\22\3\2\2\2\67"+
		"8\t\2\2\28\24\3\2\2\29:\t\3\2\2:\26\3\2\2\2;<\t\4\2\2<\30\3\2\2\2=>\7"+
		"\61\2\2>?\7,\2\2?C\3\2\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA"+
		"\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7,\2\2GH\7\61\2\2HI\3\2\2\2IJ\b\r\2\2J"+
		"\32\3\2\2\2KL\7\61\2\2LM\7\61\2\2MQ\3\2\2\2NP\n\5\2\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\b\16\2\2U\34\3\2\2\2V["+
		"\5\23\n\2W[\5\25\13\2X[\5\27\f\2Y[\t\6\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2"+
		"\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\36\3\2\2\2^_\5\35\17\2"+
		"_`\7*\2\2`a\7+\2\2a \3\2\2\2bd\t\7\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2e"+
		"f\3\2\2\2fg\3\2\2\2gh\b\21\2\2h\"\3\2\2\2ik\7\17\2\2ji\3\2\2\2jk\3\2\2"+
		"\2kl\3\2\2\2lo\7\f\2\2mo\7\17\2\2nj\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2q$\3\2\2\2\13\2CQZ\\ejnp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}