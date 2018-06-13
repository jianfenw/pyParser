total : (line)+ EOF;

line : (define_nfinstance | define_flowspec | flowspec_to_servicepath )? NEWLINE;

define_nfinstance : (WORD) '=' nf ;

define_flowspec : (WORD) '=' flowspec ;
flowspec : '{' ( (basic_flowspec)? | basic_flowspec (',' basic_flowspec)+ ) '}' ;
basic_flowspec : ( '(' WORD ',' WORD ',' WORD ')' );

define_argument : (WORD) '=' ( tuple ) ;

flowspec_to_servicepath : WORD ':' nf_chain ;

nf_chain : ( nf ('->' nf)* ) ;
nf : (WORD | BESSNF) ;


/*
 * Basic data types
 */

tuple : '{' ( basic_tuple_elem (',' basic_tuple_elem)+ ) '}' ;

basic_tuple_elem : (WORD) ':' (WORD) ;