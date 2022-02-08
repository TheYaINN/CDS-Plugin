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
BLOCK_COMMENT="/"\*[\w\n]*\*"/"
STRINGLIT='[\w\.(\.\.)\-/@]+'
NUMBERLIT=-?[0-9]+(\.[0-9]*)?
ID=[a-zA-Z_0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "true"                     { return B_TRUE; }
  "false"                    { return B_FALSE; }
  "enum"                     { return KW_ENUM; }
  "{"                        { return T_LBRACE; }
  "("                        { return T_LPAREN; }
  "["                        { return T_LBRACK; }
  "]"                        { return T_RBRACK; }
  ")"                        { return T_RPAREN; }
  "}"                        { return T_RBRACE; }
  "$"                        { return T_DOLLAR; }
  "@"                        { return T_AT; }
  "/"                        { return T_SLASH; }
  "\\"                       { return T_BACKSLASH; }
  ";"                        { return T_SEMI; }
  ":"                        { return T_COLON; }
  ","                        { return T_COMMA; }
  "."                        { return T_DOT; }
  ".."                       { return T_RECURSIVE_DESCENT; }
  "'"                        { return T_HYPH; }
  "\""                       { return T_QOUTE; }
  "="                        { return T_ASSIGN; }
  "_"                        { return T_UNDER; }
  "-"                        { return T_MINUS; }
  "*"                        { return T_MUL; }
  "namespace"                { return KW_NAMESPACE; }
  "using"                    { return KW_USING; }
  "from"                     { return KW_FROM; }
  "define"                   { return KW_DEFINE; }
  "entity"                   { return KW_ENTITY; }
  "aspect"                   { return KW_ASPECT; }
  "service"                  { return KW_SERVICE; }
  "type"                     { return KW_TYPE; }
  "key"                      { return KW_KEY; }
  "virtual"                  { return KW_VIRTUAL; }
  "function"                 { return KW_FUNCTION; }
  "action"                   { return KW_ACTION; }
  "returns"                  { return KW_RETURNS; }
  "Association to"           { return KW_ASSOCIATION_TO; }
  "Composition of"           { return KW_COMPOSITION_OF; }
  "many"                     { return KW_MANY; }
  "array of"                 { return KW_ARRAY; }
  "on"                       { return KW_ON; }
  "as"                       { return KW_AS; }
  "default"                  { return KW_DEFAULT; }
  "type of"                  { return KW_TYPE_OF; }
  "projection"               { return KW_PROJECTION; }
  "excluding"                { return KW_EXCLUDING; }
  "actions"                  { return KW_ACTIONS; }
  "select"                   { return KW_SELECT; }
  "and"                      { return KW_AND; }
  "or"                       { return KW_OR; }
  "exists"                   { return KW_EXISTS; }
  "insert"                   { return KW_INSERT; }
  "integrity"                { return KW_INTEGRITY; }
  "format"                   { return KW_FORMAT; }
  "range"                    { return KW_RANGE; }
  "notNull"                  { return KW_NOTNULL; }
  "not null"                 { return KW_NOT_NULL; }
  "update"                   { return UPDATE; }
  "$user"                    { return KW_USER; }
  "$now"                     { return KW_NOW; }
  "$self"                    { return KW_SELF; }
  "group by"                 { return KW_GROUP_BY; }
  "order by"                 { return KW_ORDER_BY; }
  "asc"                      { return KW_ASC; }
  "desc"                     { return KW_DESC; }
  "join"                     { return KW_JOIN; }
  "left"                     { return KW_LEFT; }
  "right"                    { return KW_RIGHT; }
  "outer"                    { return KW_OUTER; }
  "inner"                    { return KW_INNER; }
  "where"                    { return KW_WHERE; }
  "requires"                 { return ANNOT_REEQUIRES; }
  "restrict"                 { return ANNOT_RESTRICT; }
  "grant"                    { return ANNOT_GRANT; }
  "to"                       { return ANNOT_TO; }
  "assert"                   { return ANNOT_ASSERT; }
  "unique"                   { return ANNOT_UNIQUE; }
  "cds.on"                   { return ANNOT_CDS_ON; }
  "readonly"                 { return ANNOT_READ_ONLY; }
  "mandatory"                { return ANNOT_MANDATORY; }
  "Core.MediaType"           { return ANNOT_CORE_MEDIATYPE; }
  "fiori.draft.enabled"      { return ANNOT_FIORI_DRAFT_ENABLED; }
  "odata.draft.enabled"      { return ANNOT_ODATA_DRAFT_ENABLED; }
  "KW_UPDATE"                { return KW_UPDATE; }
  "R_DATE"                   { return R_DATE; }
  "READ"                     { return READ; }
  "DELETE"                   { return DELETE; }

  {LINE_COMMENT}             { return LINE_COMMENT; }
  {BLOCK_COMMENT}            { return BLOCK_COMMENT; }
  {STRINGLIT}                { return STRINGLIT; }
  {NUMBERLIT}                { return NUMBERLIT; }
  {ID}                       { return ID; }

}

[^] { return BAD_CHARACTER; }
