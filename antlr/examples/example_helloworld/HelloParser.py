# Generated from Hello.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"\b\37\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r")
        buf.write(u"\2\16\2\r\3\2\3\2\3\3\3\3\3\3\3\3\5\3\26\n\3\3\4\3\4")
        buf.write(u"\3\4\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\34\2\13")
        buf.write(u"\3\2\2\2\4\21\3\2\2\2\6\27\3\2\2\2\b\32\3\2\2\2\n\f\5")
        buf.write(u"\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2")
        buf.write(u"\2\2\16\17\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\5")
        buf.write(u"\6\4\2\22\23\7\3\2\2\23\25\5\b\5\2\24\26\7\b\2\2\25\24")
        buf.write(u"\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\30\7\4\2\2\30")
        buf.write(u"\31\7\6\2\2\31\7\3\2\2\2\32\33\7\5\2\2\33\34\7\6\2\2")
        buf.write(u"\34\35\7\5\2\2\35\t\3\2\2\2\4\r\25")
        return buf.getvalue()


class HelloParser ( Parser ):

    grammarFileName = "Hello.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"':'", u"'hello'", u"'/'" ]

    symbolicNames = [ u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"WORD", u"WHITESPACE", u"NEWLINE" ]

    RULE_total = 0
    RULE_line = 1
    RULE_r = 2
    RULE_color = 3

    ruleNames =  [ u"total", u"line", u"r", u"color" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    WORD=4
    WHITESPACE=5
    NEWLINE=6

    def __init__(self, input, output=sys.stdout):
        super(HelloParser, self).__init__(input, output=output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class TotalContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(HelloParser.TotalContext, self).__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(HelloParser.EOF, 0)

        def line(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(HelloParser.LineContext)
            else:
                return self.getTypedRuleContext(HelloParser.LineContext,i)


        def getRuleIndex(self):
            return HelloParser.RULE_total

        def enterRule(self, listener):
            if hasattr(listener, "enterTotal"):
                listener.enterTotal(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTotal"):
                listener.exitTotal(self)




    def total(self):

        localctx = HelloParser.TotalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_total)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 8
                self.line()
                self.state = 11 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==HelloParser.T__1):
                    break

            self.state = 13
            self.match(HelloParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(HelloParser.LineContext, self).__init__(parent, invokingState)
            self.parser = parser

        def r(self):
            return self.getTypedRuleContext(HelloParser.RContext,0)


        def color(self):
            return self.getTypedRuleContext(HelloParser.ColorContext,0)


        def NEWLINE(self):
            return self.getToken(HelloParser.NEWLINE, 0)

        def getRuleIndex(self):
            return HelloParser.RULE_line

        def enterRule(self, listener):
            if hasattr(listener, "enterLine"):
                listener.enterLine(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLine"):
                listener.exitLine(self)




    def line(self):

        localctx = HelloParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            self.r()
            self.state = 16
            self.match(HelloParser.T__0)
            self.state = 17
            self.color()
            self.state = 19
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==HelloParser.NEWLINE:
                self.state = 18
                self.match(HelloParser.NEWLINE)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class RContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(HelloParser.RContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(HelloParser.WORD, 0)

        def getRuleIndex(self):
            return HelloParser.RULE_r

        def enterRule(self, listener):
            if hasattr(listener, "enterR"):
                listener.enterR(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitR"):
                listener.exitR(self)




    def r(self):

        localctx = HelloParser.RContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_r)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self.match(HelloParser.T__1)
            self.state = 22
            self.match(HelloParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ColorContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(HelloParser.ColorContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(HelloParser.WORD, 0)

        def getRuleIndex(self):
            return HelloParser.RULE_color

        def enterRule(self, listener):
            if hasattr(listener, "enterColor"):
                listener.enterColor(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitColor"):
                listener.exitColor(self)




    def color(self):

        localctx = HelloParser.ColorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_color)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(HelloParser.T__2)
            self.state = 25
            self.match(HelloParser.WORD)
            self.state = 26
            self.match(HelloParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





