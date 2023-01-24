// "grammar": this is a combined lexer/parser grammar
// ANTLR will generate JsonLexer and JsonParser
grammar Json;

// Parser rules (lowerCamelCase)
// ANTLR parser rules are written the same way as in the grammar, except
//   → becomes :
//   we terminate a rule using a semicolon ;
// (Kathy likes to put the nonterminal name on its own line and each option/production
// on a subsequent line)
json
    : value EOF
    ;

value
    : array
    | object
    | STRING
    | NUMBER
    | 'true'
    | 'false'
    | 'null'
    ;

array
    : '[' ']'
    | '[' values ']'
    ;

values
    : value
    | value ',' values
    ;

object
    : '{' '}'
    | '{' elements '}'
    ;

element
    : STRING ':' value
    ;

elements
    : element
    | element ',' elements
    ;

// Lexer rules (UPPER_SNAKE_CASE)
NUMBER
    : [+-]? [0-9]+ '.' [0-9]+
    | [+-]? [0-9]+
    ;

STRING
    : '"' .*? '"'
    ;

WHITESPACE
    : [ \r\n\t]+    -> skip
    ;
