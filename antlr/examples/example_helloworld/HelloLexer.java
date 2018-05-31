// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WORD=4, WHITESPACE=5, NEWLINE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LOWERCASE", "UPPERCASE", "WORD", "WHITESPACE", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'hello'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WORD", "WHITESPACE", "NEWLINE"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b8\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\6\7%\n\7\r\7\16\7"+
		"&\3\b\6\b*\n\b\r\b\16\b+\3\b\3\b\3\t\5\t\61\n\t\3\t\3\t\6\t\65\n\t\r\t"+
		"\16\t\66\2\2\n\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\3\2\5\3\2c|\3\2C\\\4"+
		"\2\13\13\"\"\2<\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2"+
		"\2\13\37\3\2\2\2\r$\3\2\2\2\17)\3\2\2\2\21\64\3\2\2\2\23\24\7<\2\2\24"+
		"\4\3\2\2\2\25\26\7j\2\2\26\27\7g\2\2\27\30\7n\2\2\30\31\7n\2\2\31\32\7"+
		"q\2\2\32\6\3\2\2\2\33\34\7\61\2\2\34\b\3\2\2\2\35\36\t\2\2\2\36\n\3\2"+
		"\2\2\37 \t\3\2\2 \f\3\2\2\2!%\5\t\5\2\"%\5\13\6\2#%\7a\2\2$!\3\2\2\2$"+
		"\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\16\3\2\2\2(*\t\4"+
		"\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\b\2\2.\20\3"+
		"\2\2\2/\61\7\17\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\65\7\f"+
		"\2\2\63\65\7\17\2\2\64\60\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\22\3\2\2\2\t\2$&+\60\64\66\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}