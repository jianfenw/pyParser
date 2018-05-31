grammar Hello ;

/*
 * Parser Rules
 */

total: (line)+ EOF;
line: helloworld ':' color NEWLINE?;
helloworld : 'hello' WORD ;
color: '/' WORD '/';

/*
 * Lexer Rules
 */

fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
WORD : (LOWERCASE | UPPERCASE | '_' )+;
WHITESPACE : ( ' ' | '\t' )+ -> skip ; 
NEWLINE : ('\r'? '\n' | '\r')+ ;
