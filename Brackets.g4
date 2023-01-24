/*
 * The Brackets language consists of all strings where parentheses ( ), brackets [ ],
 * and braces { } are balanced.
 * ([ )] is not allowed
 * [ is not allowed
 */

grammar Brackets;

// Parser rules
brackets
    : balance EOF
    ;

balance
    : '(' balance ')'
    | '[' balance ']'
    | '{' balance '}'
    |           // empty: no tokens at all
    ;


// Lexer rules
EVERYTHING_ELSE : .     -> skip;