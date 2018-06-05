# Generated from NFCPUser.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"\20P\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write(u"\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\6\2\30\n\2\r\2")
        buf.write(u"\16\2\31\3\2\3\2\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3")
        buf.write(u"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3")
        buf.write(u"\7\6\7\64\n\7\r\7\16\7\65\3\7\3\7\3\b\3\b\3\b\3\b\3\b")
        buf.write(u"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nI\n\n\f\n")
        buf.write(u"\16\nL\13\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22")
        buf.write(u"\24\2\3\3\2\r\16\2L\2\27\3\2\2\2\4!\3\2\2\2\6%\3\2\2")
        buf.write(u"\2\b)\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2\169\3\2\2\2\20")
        buf.write(u"A\3\2\2\2\22E\3\2\2\2\24M\3\2\2\2\26\30\5\4\3\2\27\26")
        buf.write(u"\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32")
        buf.write(u"\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\"\5\n\6\2\36")
        buf.write(u"\"\5\20\t\2\37\"\5\6\4\2 \"\5\b\5\2!\35\3\2\2\2!\36\3")
        buf.write(u"\2\2\2!\37\3\2\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$")
        buf.write(u"\7\20\2\2$\5\3\2\2\2%&\7\r\2\2&\'\7\3\2\2\'(\5\22\n\2")
        buf.write(u"(\7\3\2\2\2)*\5\f\7\2*+\7\3\2\2+,\5\22\n\2,\t\3\2\2\2")
        buf.write(u"-.\7\r\2\2./\7\4\2\2/\60\5\f\7\2\60\13\3\2\2\2\61\63")
        buf.write(u"\7\5\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\65\3\2\2\2\65")
        buf.write(u"\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\6\2\28")
        buf.write(u"\r\3\2\2\29:\7\7\2\2:;\7\r\2\2;<\7\b\2\2<=\7\r\2\2=>")
        buf.write(u"\7\b\2\2>?\7\r\2\2?@\7\t\2\2@\17\3\2\2\2AB\7\r\2\2BC")
        buf.write(u"\7\4\2\2CD\5\24\13\2D\21\3\2\2\2EJ\5\24\13\2FG\7\n\2")
        buf.write(u"\2GI\5\24\13\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2")
        buf.write(u"\2K\23\3\2\2\2LJ\3\2\2\2MN\t\2\2\2N\25\3\2\2\2\6\31!")
        buf.write(u"\65J")
        return buf.getvalue()


class NFCPUserParser ( Parser ):

    grammarFileName = "NFCPUser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"':'", u"'::'", u"'{'", u"'}'", u"'('", 
                     u"','", u"')'", u"'->'" ]

    symbolicNames = [ u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"MULTILINECOMMENT", u"SINGLELINECOMMENT", 
                      u"WORD", u"BESSNF", u"WHITESPACE", u"NEWLINE" ]

    RULE_total = 0
    RULE_line = 1
    RULE_nick_service_path = 2
    RULE_tt_service_path = 3
    RULE_nickname_tt = 4
    RULE_traffic_type = 5
    RULE_basic_traffic_type = 6
    RULE_nickname_nf = 7
    RULE_nf_chain = 8
    RULE_nf = 9

    ruleNames =  [ u"total", u"line", u"nick_service_path", u"tt_service_path", 
                   u"nickname_tt", u"traffic_type", u"basic_traffic_type", 
                   u"nickname_nf", u"nf_chain", u"nf" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    MULTILINECOMMENT=9
    SINGLELINECOMMENT=10
    WORD=11
    BESSNF=12
    WHITESPACE=13
    NEWLINE=14

    def __init__(self, input, output=sys.stdout):
        super(NFCPUserParser, self).__init__(input, output=output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class TotalContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.TotalContext, self).__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(NFCPUserParser.EOF, 0)

        def line(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(NFCPUserParser.LineContext)
            else:
                return self.getTypedRuleContext(NFCPUserParser.LineContext,i)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_total

        def enterRule(self, listener):
            if hasattr(listener, "enterTotal"):
                listener.enterTotal(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTotal"):
                listener.exitTotal(self)




    def total(self):

        localctx = NFCPUserParser.TotalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_total)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.line()
                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << NFCPUserParser.T__2) | (1 << NFCPUserParser.WORD) | (1 << NFCPUserParser.NEWLINE))) != 0)):
                    break

            self.state = 25
            self.match(NFCPUserParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.LineContext, self).__init__(parent, invokingState)
            self.parser = parser

        def NEWLINE(self):
            return self.getToken(NFCPUserParser.NEWLINE, 0)

        def nickname_tt(self):
            return self.getTypedRuleContext(NFCPUserParser.Nickname_ttContext,0)


        def nickname_nf(self):
            return self.getTypedRuleContext(NFCPUserParser.Nickname_nfContext,0)


        def nick_service_path(self):
            return self.getTypedRuleContext(NFCPUserParser.Nick_service_pathContext,0)


        def tt_service_path(self):
            return self.getTypedRuleContext(NFCPUserParser.Tt_service_pathContext,0)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_line

        def enterRule(self, listener):
            if hasattr(listener, "enterLine"):
                listener.enterLine(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLine"):
                listener.exitLine(self)




    def line(self):

        localctx = NFCPUserParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.state = 27
                self.nickname_tt()

            elif la_ == 2:
                self.state = 28
                self.nickname_nf()

            elif la_ == 3:
                self.state = 29
                self.nick_service_path()

            elif la_ == 4:
                self.state = 30
                self.tt_service_path()


            self.state = 33
            self.match(NFCPUserParser.NEWLINE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Nick_service_pathContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Nick_service_pathContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(NFCPUserParser.WORD, 0)

        def nf_chain(self):
            return self.getTypedRuleContext(NFCPUserParser.Nf_chainContext,0)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_nick_service_path

        def enterRule(self, listener):
            if hasattr(listener, "enterNick_service_path"):
                listener.enterNick_service_path(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitNick_service_path"):
                listener.exitNick_service_path(self)




    def nick_service_path(self):

        localctx = NFCPUserParser.Nick_service_pathContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_nick_service_path)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(NFCPUserParser.WORD)
            self.state = 36
            self.match(NFCPUserParser.T__0)
            self.state = 37
            self.nf_chain()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Tt_service_pathContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Tt_service_pathContext, self).__init__(parent, invokingState)
            self.parser = parser

        def traffic_type(self):
            return self.getTypedRuleContext(NFCPUserParser.Traffic_typeContext,0)


        def nf_chain(self):
            return self.getTypedRuleContext(NFCPUserParser.Nf_chainContext,0)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_tt_service_path

        def enterRule(self, listener):
            if hasattr(listener, "enterTt_service_path"):
                listener.enterTt_service_path(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTt_service_path"):
                listener.exitTt_service_path(self)




    def tt_service_path(self):

        localctx = NFCPUserParser.Tt_service_pathContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_tt_service_path)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.traffic_type()
            self.state = 40
            self.match(NFCPUserParser.T__0)
            self.state = 41
            self.nf_chain()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Nickname_ttContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Nickname_ttContext, self).__init__(parent, invokingState)
            self.parser = parser

        def traffic_type(self):
            return self.getTypedRuleContext(NFCPUserParser.Traffic_typeContext,0)


        def WORD(self):
            return self.getToken(NFCPUserParser.WORD, 0)

        def getRuleIndex(self):
            return NFCPUserParser.RULE_nickname_tt

        def enterRule(self, listener):
            if hasattr(listener, "enterNickname_tt"):
                listener.enterNickname_tt(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitNickname_tt"):
                listener.exitNickname_tt(self)




    def nickname_tt(self):

        localctx = NFCPUserParser.Nickname_ttContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_nickname_tt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(NFCPUserParser.WORD)
            self.state = 44
            self.match(NFCPUserParser.T__1)
            self.state = 45
            self.traffic_type()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Traffic_typeContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Traffic_typeContext, self).__init__(parent, invokingState)
            self.parser = parser

        def basic_traffic_type(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(NFCPUserParser.Basic_traffic_typeContext)
            else:
                return self.getTypedRuleContext(NFCPUserParser.Basic_traffic_typeContext,i)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_traffic_type

        def enterRule(self, listener):
            if hasattr(listener, "enterTraffic_type"):
                listener.enterTraffic_type(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTraffic_type"):
                listener.exitTraffic_type(self)




    def traffic_type(self):

        localctx = NFCPUserParser.Traffic_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_traffic_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(NFCPUserParser.T__2)
            self.state = 49 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 48
                self.basic_traffic_type()
                self.state = 51 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==NFCPUserParser.T__4):
                    break

            self.state = 53
            self.match(NFCPUserParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Basic_traffic_typeContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Basic_traffic_typeContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WORD(self, i=None):
            if i is None:
                return self.getTokens(NFCPUserParser.WORD)
            else:
                return self.getToken(NFCPUserParser.WORD, i)

        def getRuleIndex(self):
            return NFCPUserParser.RULE_basic_traffic_type

        def enterRule(self, listener):
            if hasattr(listener, "enterBasic_traffic_type"):
                listener.enterBasic_traffic_type(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitBasic_traffic_type"):
                listener.exitBasic_traffic_type(self)




    def basic_traffic_type(self):

        localctx = NFCPUserParser.Basic_traffic_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_basic_traffic_type)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(NFCPUserParser.T__4)
            self.state = 56
            self.match(NFCPUserParser.WORD)
            self.state = 57
            self.match(NFCPUserParser.T__5)
            self.state = 58
            self.match(NFCPUserParser.WORD)
            self.state = 59
            self.match(NFCPUserParser.T__5)
            self.state = 60
            self.match(NFCPUserParser.WORD)
            self.state = 61
            self.match(NFCPUserParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Nickname_nfContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Nickname_nfContext, self).__init__(parent, invokingState)
            self.parser = parser

        def nf(self):
            return self.getTypedRuleContext(NFCPUserParser.NfContext,0)


        def WORD(self):
            return self.getToken(NFCPUserParser.WORD, 0)

        def getRuleIndex(self):
            return NFCPUserParser.RULE_nickname_nf

        def enterRule(self, listener):
            if hasattr(listener, "enterNickname_nf"):
                listener.enterNickname_nf(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitNickname_nf"):
                listener.exitNickname_nf(self)




    def nickname_nf(self):

        localctx = NFCPUserParser.Nickname_nfContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_nickname_nf)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(NFCPUserParser.WORD)
            self.state = 64
            self.match(NFCPUserParser.T__1)
            self.state = 65
            self.nf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Nf_chainContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.Nf_chainContext, self).__init__(parent, invokingState)
            self.parser = parser

        def nf(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(NFCPUserParser.NfContext)
            else:
                return self.getTypedRuleContext(NFCPUserParser.NfContext,i)


        def getRuleIndex(self):
            return NFCPUserParser.RULE_nf_chain

        def enterRule(self, listener):
            if hasattr(listener, "enterNf_chain"):
                listener.enterNf_chain(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitNf_chain"):
                listener.exitNf_chain(self)




    def nf_chain(self):

        localctx = NFCPUserParser.Nf_chainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_nf_chain)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.nf()
            self.state = 72
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==NFCPUserParser.T__7:
                self.state = 68
                self.match(NFCPUserParser.T__7)
                self.state = 69
                self.nf()
                self.state = 74
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class NfContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(NFCPUserParser.NfContext, self).__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(NFCPUserParser.WORD, 0)

        def BESSNF(self):
            return self.getToken(NFCPUserParser.BESSNF, 0)

        def getRuleIndex(self):
            return NFCPUserParser.RULE_nf

        def enterRule(self, listener):
            if hasattr(listener, "enterNf"):
                listener.enterNf(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitNf"):
                listener.exitNf(self)




    def nf(self):

        localctx = NFCPUserParser.NfContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_nf)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            _la = self._input.LA(1)
            if not(_la==NFCPUserParser.WORD or _la==NFCPUserParser.BESSNF):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





