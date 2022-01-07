package de.joachimsohn.language.cds;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.joachimsohn.language.psi.CDSTypes.*;

%%


%public
%class CDSLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT="//".+
BLOCK_COMMENT="/"\*.*\*"/"
LITERAL_NUMBER=[0-9]+(\.[0-9]*)?
LITERAL_STRING=[a-zA-Z]+

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "{"                   { return T_LBRACE; }
  "("                   { return T_LPAREN; }
  "["                   { return T_LBRACK; }
  "]"                   { return T_RBRACK; }
  ")"                   { return T_RPAREN; }
  "}"                   { return T_RBRACE; }
  "$"                   { return T_DOLLAR; }
  "@"                   { return T_AT; }
  "/"                   { return T_SLASH; }
  "\\"                  { return T_BACKSLASH; }
  ";"                   { return T_SEMI; }
  ":"                   { return T_COLON; }
  ","                   { return T_COMMA; }
  "."                   { return T_DOT; }
  ".."                  { return T_RECURSIVE_DESCENT; }
  "'"                   { return T_HYPH; }
  "\""                  { return T_QOUTE; }
  "="                   { return T_ASSIGN; }
  "_"                   { return T_UNDER; }
  "-"                   { return T_MINUS; }
  "namespace"           { return KW_NAMESPACE; }
  "using"               { return KW_USING; }
  "from"                { return KW_FROM; }
  "define"              { return KW_DEFINE; }
  "entity"              { return KW_ENTITY; }
  "service"             { return KW_SERVICE; }
  "type"                { return KW_TYPE; }
  "key"                 { return KW_KEY; }
  "not null"            { return KW_REQUIRED; }
  "Association to"      { return KW_ASSOCIATION_TO; }
  "Composition of"      { return KW_COMPOSITION_OF; }
  "many"                { return KW_MANY; }
  "on"                  { return KW_ON; }
  "as"                  { return KW_AS; }
  "default"             { return KW_DEFAULT; }
  "type of"             { return KW_TYPE_OF; }
  "function"            { return KW_FUNCTION; }
  "projection"          { return KW_PROJECTION; }
  "select"              { return KW_SELECT; }
  "excluding"           { return KW_EXCLUDING; }
  "action"              { return KW_ACTION; }
  "actions"             { return KW_ACTIONS; }
  "returns"             { return KW_RETURNS; }
  "string"              { return STRING; }
  "and"                 { return AND; }
  "join"                { return JOIN; }
  "where"               { return WHERE; }
  "case"                { return CASE; }
  "when"                { return WHEN; }
  "is"                  { return IS; }
  "then"                { return THEN; }
  "else"                { return ELSE; }
  "end"                 { return END; }
  "string_concat"       { return STRING_CONCAT; }
  "literal_expr"        { return LITERAL_EXPR; }
  "readonly"            { return READONLY; }
  "requires"            { return REQUIRES; }
  "hyphen_string"       { return HYPHEN_STRING; }
  "restrict"            { return RESTRICT; }
  "grant"               { return GRANT; }
  "to"                  { return TO; }
  "exists"              { return EXISTS; }
  "or"                  { return OR; }
  "READ"                { return READ; }
  "UPDATE"              { return UPDATE; }
  "DELETE"              { return DELETE; }

  {LINE_COMMENT}        { return LINE_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {LITERAL_NUMBER}      { return LITERAL_NUMBER; }
  {LITERAL_STRING}      { return LITERAL_STRING; }

}

[^] { return BAD_CHARACTER; }
