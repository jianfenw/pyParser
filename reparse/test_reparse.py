from reparse_functions import functions
import reparse


colortime_parser = reparse.parser( \
	parser_type = reparse.basic_parser,
	expressions_yaml_path = '/Users/jianfeng/git_pyparser/pyParser/reparse/' + 'expressions.yaml',
	patterns_yaml_path= '/Users/jianfeng/git_pyparser/pyParser/reparse/' + 'patterns.yaml',
	functions = functions)


if __name__ == '__main__':
	print(colortime_parser("Orange at 11pm! ~ ~"))
	print(colortime_parser("~ ~ ~ go to the store ~ buy green at 11pm! ~ ~"))

