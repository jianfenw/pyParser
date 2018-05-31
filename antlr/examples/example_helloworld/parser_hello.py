import sys
from antlr4 import *
from HelloLexer import HelloLexer
from HelloParser import HelloParser
from HelloListener import HelloListener
from TxtHelloListener import TxtHelloListener

def main(argv):
	text_input = FileStream(argv[1])
	lexer = HelloLexer(text_input)
	print("Type of Lexer:", type(lexer))
	stream = CommonTokenStream(lexer)
	print("Type of Stream:", type(stream))
	parser = HelloParser(stream)
	print("Type of Parser:", type(parser))
	tree = parser.total()
	output_file = open('output.txt', 'w')

	txt_hello = TxtHelloListener(output_file)
	walker = ParseTreeWalker()
	walker.walk(txt_hello, tree)

	output_file.close()
	return

if __name__ == '__main__':
	main(sys.argv)