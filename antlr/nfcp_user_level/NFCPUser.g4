grammar NFCPUser ;


/*
 * Parser Rules
 */

total : (line)+ EOF;
line : (nickname_tt | nickname_nf | nick_service_path | tt_service_path)? NEWLINE;

nick_service_path : WORD ':' nf_chain ;
tt_service_path : traffic_type ':' nf_chain ;

nickname_tt : (WORD) '::' traffic_type ;
traffic_type : '{' (basic_traffic_type)+ '}' ;
basic_traffic_type : '(' WORD ',' WORD ',' WORD ')' ;

nickname_nf : (WORD) '::' nf ;
nf_chain : ( nf ('->' nf)* ) ;
nf : (WORD | BESSNF);



/*
 * Lexer Rules
 */

fragment LOWERCASE : [a-z];
fragment UPPERCASE : [A-Z];
fragment NUMBER : [0-9];

MULTILINECOMMENT : '/*' .*? '*/' -> skip ;
SINGLELINECOMMENT : '//' ~[\r\n]* -> skip ;

WORD : (LOWERCASE | UPPERCASE | NUMBER | '_' | '.' )+ ;
BESSNF: WORD '()' ;

WHITESPACE : ( ' ' | '\t' )+ -> skip ; 
NEWLINE : ('\r'? '\n' | '\r')+ ;
