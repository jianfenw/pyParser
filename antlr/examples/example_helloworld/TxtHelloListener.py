import sys
from antlr4 import *
from HelloParser import HelloParser
from HelloListener import HelloListener


class TxtHelloListener(HelloListener):
	def __init__(self, output_file):
		self.output = output_file
		self.output.write("# THIS FILE IS CREATED BY ANTLR4#\n")

	def enterR(self, ctx=HelloParser.RContext):
		self.output.write('<START R>\n')

	def exitR(self, ctx=HelloParser.RContext):
		self.output.write(ctx.WORD().getText()+"\n")
		self.output.write('<END R>\n')

	def enterColor(self, ctx=HelloParser.ColorContext):
		self.output.write("New Color: %s!\n" %(ctx.WORD().getText()) )

	def exitColor(self, ctx=HelloParser.ColorContext):
		pass

	def enterLine(self, ctx=HelloParser.LineContext):
		self.output.write('<START LINE>\n')

	def exitLine(self, ctx=HelloParser.LineContext):
		self.output.write('<END LINE>\n')
