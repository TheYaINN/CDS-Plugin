package de.joachimsohn.language.psi;

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

LINE_COMMENT="//"
BLOCK_COMMENT="/"\*.*\*"/"
SPACE=[ \t\n\x0B\f\r]+
NUMBER=[0-9]+(\.[0-9]*)?
STRING=[a-zA-Z]+

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "namespace"          { return NAMESPACE; }
  "using"              { return USING; }
  "enum"               { return ENUM; }
  "COMMENT"            { return COMMENT; }
  "CRLF"               { return CRLF; }
  "key"                { return KEY; }
  "association_"       { return ASSOCIATION_; }
  "composition_"       { return COMPOSITION_; }
  "Association"        { return ASSOCIATION; }
  "to"                 { return TO; }
  "Composition"        { return COMPOSITION; }
  "of"                 { return OF; }
  "many"               { return MANY; }
  "on"                 { return ON; }
  "not"                { return NOT; }
  "null"               { return NULL; }
  "service"            { return SERVICE; }
  "type"               { return TYPE; }
  "entity"             { return ENTITY; }
  "excluding"          { return EXCLUDING; }
  "as"                 { return AS; }
  "projection"         { return PROJECTION; }
  "select"             { return SELECT; }
  "from"               { return FROM; }
  "and"                { return AND; }
  "join"               { return JOIN; }
  "where"              { return WHERE; }
  "case"               { return CASE; }
  "when"               { return WHEN; }
  "is"                 { return IS; }
  "then"               { return THEN; }
  "else"               { return ELSE; }
  "end"                { return END; }
  "actions"            { return ACTIONS; }
  "function"           { return FUNCTION; }
  "returns"            { return RETURNS; }
  "action"             { return ACTION; }
  "readonly"           { return READONLY; }
  "requires"           { return REQUIRES; }
  "restrict"           { return RESTRICT; }
  "grant"              { return GRANT; }
  "exists"             { return EXISTS; }
  "or"                 { return OR; }
  "READ"               { return READ; }
  "UPDATE"             { return UPDATE; }
  "DELETE"             { return DELETE; }

  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {SPACE}              { return SPACE; }
  {NUMBER}             { return NUMBER; }
  {STRING}             { return STRING; }

}

[^] { return BAD_CHARACTER; }
