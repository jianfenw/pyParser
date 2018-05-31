# Generated from Hello.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2")
        buf.write(u"\b8\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write(u"\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write(u"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\6\7%\n\7\r\7\16\7")
        buf.write(u"&\3\b\6\b*\n\b\r\b\16\b+\3\b\3\b\3\t\5\t\61\n\t\3\t\3")
        buf.write(u"\t\6\t\65\n\t\r\t\16\t\66\2\2\n\3\3\5\4\7\5\t\2\13\2")
        buf.write(u"\r\6\17\7\21\b\3\2\5\3\2c|\3\2C\\\4\2\13\f\"#\2<\2\3")
        buf.write(u"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2")
        buf.write(u"\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\33\3\2")
        buf.write(u"\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r$\3\2\2\2\17)\3\2\2")
        buf.write(u"\2\21\64\3\2\2\2\23\24\7<\2\2\24\4\3\2\2\2\25\26\7j\2")
        buf.write(u"\2\26\27\7g\2\2\27\30\7n\2\2\30\31\7n\2\2\31\32\7q\2")
        buf.write(u"\2\32\6\3\2\2\2\33\34\7\61\2\2\34\b\3\2\2\2\35\36\t\2")
        buf.write(u"\2\2\36\n\3\2\2\2\37 \t\3\2\2 \f\3\2\2\2!%\5\t\5\2\"")
        buf.write(u"%\5\13\6\2#%\7a\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%&")
        buf.write(u"\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\16\3\2\2\2(*\t\4\2\2")
        buf.write(u")(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.")
        buf.write(u"\b\b\2\2.\20\3\2\2\2/\61\7\17\2\2\60/\3\2\2\2\60\61\3")
        buf.write(u"\2\2\2\61\62\3\2\2\2\62\65\7\f\2\2\63\65\7\17\2\2\64")
        buf.write(u"\60\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2")
        buf.write(u"\66\67\3\2\2\2\67\22\3\2\2\2\t\2$&+\60\64\66\3\b\2\2")
        return buf.getvalue()


class HelloLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    WORD = 4
    WHITESPACE = 5
    NEWLINE = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
            u"':'", u"'hello'", u"'/'" ]

    symbolicNames = [ u"<INVALID>",
            u"WORD", u"WHITESPACE", u"NEWLINE" ]

    ruleNames = [ u"T__0", u"T__1", u"T__2", u"LOWERCASE", u"UPPERCASE", 
                  u"WORD", u"WHITESPACE", u"NEWLINE" ]

    grammarFileName = u"Hello.g4"

    def __init__(self, input=None, output=sys.stdout):
        super(HelloLexer, self).__init__(input, output=output)
        self.checkVersion("4.7.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


