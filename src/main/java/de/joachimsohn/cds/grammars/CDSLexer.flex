package de.joachimsohn.cds.grammars;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.joachimsohn.cds.psi.CDSTypes.*;

%%

%{
  public _CDSLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CDSLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

LINE_COMMENT="//".+
BLOCK_COMMENT="/"\*.*\*"/"
STRINGLIT='[\w\./@]+'
NUMBERLIT=[0-9]+(\.[0-9]*)?
ID=[a-zA-Z_0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "true"                { return B_TRUE; }
  "false"               { return B_FALSE; }
  "enum"                { return KW_ENUM; }
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
  "aspect"              { return KW_ASPECT; }
  "service"             { return KW_SERVICE; }
  "type"                { return KW_TYPE; }
  "key"                 { return KW_KEY; }
  "not null"            { return KW_REQUIRED; }
  "requires"            { return KW_REQUIRES; }
  "Association to"      { return KW_ASSOCIATION_TO; }
  "Composition of"      { return KW_COMPOSITION_OF; }
  "many"                { return KW_MANY; }
  "array of"            { return KW_ARRAY; }
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
  "join"                { return KW_JOIN; }
  "left"                { return KW_LEFT; }
  "right"               { return KW_RIGHT; }
  "outer"               { return KW_OUTER; }
  "inner"               { return KW_INNER; }
  "where"               { return KW_WHERE; }
  "and"                 { return KW_AND; }
  "or"                  { return KW_OR; }
  "exists"              { return KW_EXISTS; }
  "readonly"            { return KW_READ_ONLY; }
  "cds.on"              { return KW_CDS_ON; }
  "insert"              { return KW_INSERT; }
  "assert"              { return KW_ASSERT; }
  "unique"              { return KW_UNIQUE; }
  "integrity"           { return KW_INTEGRITY; }
  "format"              { return KW_FORMAT; }
  "range"               { return KW_RANGE; }
  "notNull"             { return KW_NOTNULL; }
  "null"                { return KW_NULL; }
  "not null"            { return KW_NOT_NULL; }
  "update"              { return UPDATE; }
  "user"                { return KW_USER; }
  "now"                 { return KW_NOW; }
  "restrict"            { return KW_RESTRICT; }
  "grant"               { return KW_GRANT; }
  "to"                  { return KW_TO; }
  "KW_UPDATE"           { return KW_UPDATE; }
  "R_DATE"              { return R_DATE; }
  "READ"                { return READ; }
  "DELETE"              { return DELETE; }

  {LINE_COMMENT}        { return LINE_COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {STRINGLIT}           { return STRINGLIT; }
  {NUMBERLIT}           { return NUMBERLIT; }
  {ID}                  { return ID; }

}

[^] { return BAD_CHARACTER; }
