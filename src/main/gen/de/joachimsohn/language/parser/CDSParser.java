// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.joachimsohn.language.psi.CDSTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CDSParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return CDSFile(b, l + 1);
  }

  /* ********************************************************** */
  // namespace_? import_* type_declaration* item_*
  static boolean CDSFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CDSFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CDSFile_0(b, l + 1);
    r = r && CDSFile_1(b, l + 1);
    r = r && CDSFile_2(b, l + 1);
    r = r && CDSFile_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // namespace_?
  private static boolean CDSFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CDSFile_0")) return false;
    namespace_(b, l + 1);
    return true;
  }

  // import_*
  private static boolean CDSFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CDSFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CDSFile_1", c)) break;
    }
    return true;
  }

  // type_declaration*
  private static boolean CDSFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CDSFile_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CDSFile_2", c)) break;
    }
    return true;
  }

  // item_*
  private static boolean CDSFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CDSFile_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CDSFile_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // action method_call returns literal_expr ';'
  static boolean action_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_")) return false;
    if (!nextTokenIs(b, ACTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION);
    r = r && method_call(b, l + 1);
    r = r && consumeToken(b, RETURNS);
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // actions '{' (action_ | function_)* '};'
  public static boolean actions_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions_")) return false;
    if (!nextTokenIs(b, ACTIONS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTIONS);
    r = r && consumeToken(b, "{");
    r = r && actions__2(b, l + 1);
    r = r && consumeToken(b, "};");
    exit_section_(b, m, ACTIONS_, r);
    return r;
  }

  // (action_ | function_)*
  private static boolean actions__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions__2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!actions__2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actions__2", c)) break;
    }
    return true;
  }

  // action_ | function_
  private static boolean actions__2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions__2_0")) return false;
    boolean r;
    r = action_(b, l + 1);
    if (!r) r = function_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '@' (readonly | "cds.on.insert" | annotation_restrict | annotation_requires | annotation_assert*)
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION, "<annotation>");
    r = consumeToken(b, "@");
    r = r && annotation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // readonly | "cds.on.insert" | annotation_restrict | annotation_requires | annotation_assert*
  private static boolean annotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READONLY);
    if (!r) r = consumeToken(b, "cds.on.insert");
    if (!r) r = annotation_restrict(b, l + 1);
    if (!r) r = annotation_requires(b, l + 1);
    if (!r) r = annotation_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation_assert*
  private static boolean annotation_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_1_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_assert(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_1_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "assert.unique" ':' '{' string_concat':' '[' string (','string)* ']''}'
  static boolean annotation_assert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "assert.unique");
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "{");
    r = r && string_concat(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "[");
    r = r && consumeToken(b, STRING);
    r = r && annotation_assert_7(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (','string)*
  private static boolean annotation_assert_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_assert_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_assert_7", c)) break;
    }
    return true;
  }

  // ','string
  private static boolean annotation_assert_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // grant ':' '[' "'" crud_op "'" (',' hyphen_string)* ']' ','?
  static boolean annotation_grant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant")) return false;
    if (!nextTokenIs(b, GRANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GRANT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "[");
    r = r && consumeToken(b, "'");
    r = r && crud_op(b, l + 1);
    r = r && consumeToken(b, "'");
    r = r && annotation_grant_6(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && annotation_grant_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' hyphen_string)*
  private static boolean annotation_grant_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_grant_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_grant_6", c)) break;
    }
    return true;
  }

  // ',' hyphen_string
  private static boolean annotation_grant_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && hyphen_string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean annotation_grant_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_8")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // '(' requires ':' hyphen_string ')'
  static boolean annotation_requires(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_requires")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, REQUIRES);
    r = r && consumeToken(b, ":");
    r = r && hyphen_string(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // restrict ':' '['  annotation_statement ']'
  static boolean annotation_restrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_restrict")) return false;
    if (!nextTokenIs(b, RESTRICT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESTRICT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "[");
    r = r && annotation_statement(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' annotation_grant annotation_to? annotation_where? '}'
  static boolean annotation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && annotation_grant(b, l + 1);
    r = r && annotation_statement_2(b, l + 1);
    r = r && annotation_statement_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation_to?
  private static boolean annotation_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement_2")) return false;
    annotation_to(b, l + 1);
    return true;
  }

  // annotation_where?
  private static boolean annotation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement_3")) return false;
    annotation_where(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // to ':' hyphen_string ','?
  static boolean annotation_to(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_to")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && consumeToken(b, ":");
    r = r && hyphen_string(b, l + 1);
    r = r && annotation_to_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean annotation_to_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_to_3")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // where ':' "'" expr (concat_key exists '(' sql_Statement ')' )? "'"
  static boolean annotation_where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "'");
    r = r && expr(b, l + 1);
    r = r && annotation_where_4(b, l + 1);
    r = r && consumeToken(b, "'");
    exit_section_(b, m, null, r);
    return r;
  }

  // (concat_key exists '(' sql_Statement ')' )?
  private static boolean annotation_where_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where_4")) return false;
    annotation_where_4_0(b, l + 1);
    return true;
  }

  // concat_key exists '(' sql_Statement ')'
  private static boolean annotation_where_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concat_key(b, l + 1);
    r = r && consumeToken(b, EXISTS);
    r = r && consumeToken(b, "(");
    r = r && sql_Statement(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' as_recursive '}'
  static boolean as_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && as_recursive(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier as literal_expr (',' as_recursive)*
  static boolean as_recursive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_recursive")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && literal_expr(b, l + 1);
    r = r && as_recursive_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' as_recursive)*
  private static boolean as_recursive_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_recursive_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!as_recursive_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "as_recursive_3", c)) break;
    }
    return true;
  }

  // ',' as_recursive
  private static boolean as_recursive_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_recursive_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && as_recursive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case when identifier is required_ then "'" string "'" else identifier end as string_concat ':' identifier
  static boolean case_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE, WHEN);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && required_(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && consumeToken(b, "'");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, "'");
    r = r && consumeToken(b, ELSE);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, END, AS);
    r = r && string_concat(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and | or
  static boolean concat_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concat_key")) return false;
    if (!nextTokenIs(b, "", AND, OR)) return false;
    boolean r;
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    return r;
  }

  /* ********************************************************** */
  // READ | UPDATE | DELETE
  static boolean crud_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "crud_op")) return false;
    boolean r;
    r = consumeToken(b, READ);
    if (!r) r = consumeToken(b, UPDATE);
    if (!r) r = consumeToken(b, DELETE);
    return r;
  }

  /* ********************************************************** */
  // 'String' ('('number')')? | 'Integer' | 'DateTime' | string (annotation ':' string)?
  public static boolean dataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = dataType_0(b, l + 1);
    if (!r) r = consumeToken(b, "Integer");
    if (!r) r = consumeToken(b, "DateTime");
    if (!r) r = dataType_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'String' ('('number')')?
  private static boolean dataType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "String");
    r = r && dataType_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('('number')')?
  private static boolean dataType_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_0_1")) return false;
    dataType_0_1_0(b, l + 1);
    return true;
  }

  // '('number')'
  private static boolean dataType_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, NUMBER);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // string (annotation ':' string)?
  private static boolean dataType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && dataType_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (annotation ':' string)?
  private static boolean dataType_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_3_1")) return false;
    dataType_3_1_0(b, l + 1);
    return true;
  }

  // annotation ':' string
  private static boolean dataType_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation* "define"? "entity" string (':' string)? '{' field_* '}'
  static boolean entity_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity__0(b, l + 1);
    r = r && entity__1(b, l + 1);
    r = r && consumeToken(b, "entity");
    r = r && consumeToken(b, STRING);
    r = r && entity__4(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && entity__6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation*
  private static boolean entity__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity__0", c)) break;
    }
    return true;
  }

  // "define"?
  private static boolean entity__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__1")) return false;
    consumeToken(b, "define");
    return true;
  }

  // (':' string)?
  private static boolean entity__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__4")) return false;
    entity__4_0(b, l + 1);
    return true;
  }

  // ':' string
  private static boolean entity__4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_*
  private static boolean entity__6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity__6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // excluding '{' literal_expr '}'
  static boolean exclude_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_")) return false;
    if (!nextTokenIs(b, EXCLUDING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXCLUDING);
    r = r && consumeToken(b, "{");
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' (identifier | variable | value_)
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr_2(b, l + 1);
    exit_section_(b, m, EXPR, r);
    return r;
  }

  // identifier | variable | value_
  private static boolean expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2")) return false;
    boolean r;
    r = identifier(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = value_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // key? string ':' (dataType | relation_ | association_ | composition_) required_? ';'
  static boolean field_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_")) return false;
    if (!nextTokenIs(b, "", KEY, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field__0(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, ":");
    r = r && field__3(b, l + 1);
    r = r && field__4(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // key?
  private static boolean field__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field__0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // dataType | relation_ | association_ | composition_
  private static boolean field__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field__3")) return false;
    boolean r;
    r = dataType(b, l + 1);
    if (!r) r = relation_(b, l + 1);
    if (!r) r = consumeToken(b, ASSOCIATION_);
    if (!r) r = consumeToken(b, COMPOSITION_);
    return r;
  }

  // required_?
  private static boolean field__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field__4")) return false;
    required_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // function method_call returns literal_expr ';'
  public static boolean function_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && method_call(b, l + 1);
    r = r && consumeToken(b, RETURNS);
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, FUNCTION_, r);
    return r;
  }

  /* ********************************************************** */
  // "'" '@'? string (('/'|'-'|'_'|'.'|'..')string)*"'"
  public static boolean hyphen_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HYPHEN_STRING, "<hyphen string>");
    r = consumeToken(b, "'");
    r = r && hyphen_string_1(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && hyphen_string_3(b, l + 1);
    r = r && consumeToken(b, "'");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@'?
  private static boolean hyphen_string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string_1")) return false;
    consumeToken(b, "@");
    return true;
  }

  // (('/'|'-'|'_'|'.'|'..')string)*
  private static boolean hyphen_string_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!hyphen_string_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hyphen_string_3", c)) break;
    }
    return true;
  }

  // ('/'|'-'|'_'|'.'|'..')string
  private static boolean hyphen_string_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hyphen_string_3_0_0(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // '/'|'-'|'_'|'.'|'..'
  private static boolean hyphen_string_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string_3_0_0")) return false;
    boolean r;
    r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "_");
    if (!r) r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "..");
    return r;
  }

  /* ********************************************************** */
  // (string+ '.'?)+
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!identifier_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier", c)) break;
    }
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  // string+ '.'?
  private static boolean identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_0_0(b, l + 1);
    r = r && identifier_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // string+
  private static boolean identifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "identifier_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '.'?
  private static boolean identifier_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0_1")) return false;
    consumeToken(b, ".");
    return true;
  }

  /* ********************************************************** */
  // using'{'import_values'}' 'from' hyphen_string';'
  public static boolean import_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && consumeToken(b, "{");
    r = r && import_values(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeToken(b, "from");
    r = r && hyphen_string(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, IMPORT_, r);
    return r;
  }

  /* ********************************************************** */
  // string (',' string)*
  static boolean import_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && import_values_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' string)*
  private static boolean import_values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_values_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_values_1", c)) break;
    }
    return true;
  }

  // ',' string
  private static boolean import_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // service_ | entity_ | COMMENT | CRLF
  public static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM_, "<item>");
    r = service_(b, l + 1);
    if (!r) r = entity_(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // join_type identifier (as string)? on expr (and expr)? ('{' join_expr (','join_expr)* ('} 'join_condition | '};'))?
  static boolean join_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_type(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && join__2(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && expr(b, l + 1);
    r = r && join__5(b, l + 1);
    r = r && join__6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (as string)?
  private static boolean join__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__2")) return false;
    join__2_0(b, l + 1);
    return true;
  }

  // as string
  private static boolean join__2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // (and expr)?
  private static boolean join__5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__5")) return false;
    join__5_0(b, l + 1);
    return true;
  }

  // and expr
  private static boolean join__5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('{' join_expr (','join_expr)* ('} 'join_condition | '};'))?
  private static boolean join__6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6")) return false;
    join__6_0(b, l + 1);
    return true;
  }

  // '{' join_expr (','join_expr)* ('} 'join_condition | '};')
  private static boolean join__6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && join_expr(b, l + 1);
    r = r && join__6_0_2(b, l + 1);
    r = r && join__6_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','join_expr)*
  private static boolean join__6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!join__6_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "join__6_0_2", c)) break;
    }
    return true;
  }

  // ','join_expr
  private static boolean join__6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && join_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '} 'join_condition | '};'
  private static boolean join__6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join__6_0_3_0(b, l + 1);
    if (!r) r = consumeToken(b, "};");
    exit_section_(b, m, null, r);
    return r;
  }

  // '} 'join_condition
  private static boolean join__6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "} ");
    r = r && join_condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // where expr
  static boolean join_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_condition")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // key? (identifier as string | case_)
  static boolean join_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_expr")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_expr_0(b, l + 1);
    r = r && join_expr_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // key?
  private static boolean join_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_expr_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // identifier as string | case_
  private static boolean join_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_expr_1_0(b, l + 1);
    if (!r) r = case_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier as string
  private static boolean join_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeTokens(b, 0, AS, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // join | "left join" | "left outer join"
  static boolean join_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type")) return false;
    boolean r;
    r = consumeToken(b, JOIN);
    if (!r) r = consumeToken(b, "left join");
    if (!r) r = consumeToken(b, "left outer join");
    return r;
  }

  /* ********************************************************** */
  // (string | number)+
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    if (!nextTokenIs(b, "<literal expr>", NUMBER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = literal_expr_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!literal_expr_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literal_expr", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // string | number
  private static boolean literal_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // string'('(literal_expr ':' identifier)? ')'
  public static boolean method_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && consumeToken(b, "(");
    r = r && method_call_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // (literal_expr ':' identifier)?
  private static boolean method_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_2")) return false;
    method_call_2_0(b, l + 1);
    return true;
  }

  // literal_expr ':' identifier
  private static boolean method_call_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_expr(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // as (projection on | select from) identifier
  static boolean mirror(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mirror")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && mirror_1(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // projection on | select from
  private static boolean mirror_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mirror_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, PROJECTION, ON);
    if (!r) r = parseTokens(b, 0, SELECT, FROM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // namespace identifier';'
  public static boolean namespace_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, NAMESPACE_, r);
    return r;
  }

  /* ********************************************************** */
  // (Association to | Composition of ) many? string required_? (on expr)?
  static boolean relation_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_")) return false;
    if (!nextTokenIs(b, "", ASSOCIATION, COMPOSITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation__0(b, l + 1);
    r = r && relation__1(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && relation__3(b, l + 1);
    r = r && relation__4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Association to | Composition of
  private static boolean relation__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, ASSOCIATION, TO);
    if (!r) r = parseTokens(b, 0, COMPOSITION, OF);
    exit_section_(b, m, null, r);
    return r;
  }

  // many?
  private static boolean relation__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__1")) return false;
    consumeToken(b, MANY);
    return true;
  }

  // required_?
  private static boolean relation__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__3")) return false;
    required_(b, l + 1);
    return true;
  }

  // (on expr)?
  private static boolean relation__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__4")) return false;
    relation__4_0(b, l + 1);
    return true;
  }

  // on expr
  private static boolean relation__4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // not? null
  public static boolean required_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "required_")) return false;
    if (!nextTokenIs(b, "<required>", NOT, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REQUIRED_, "<required>");
    r = required__0(b, l + 1);
    r = r && consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // not?
  private static boolean required__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "required__0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  /* ********************************************************** */
  // service literal_expr annotation? '{' ( service_entity | function_ | service_type)+ '}'
  public static boolean service_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_")) return false;
    if (!nextTokenIs(b, SERVICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SERVICE);
    r = r && literal_expr(b, l + 1);
    r = r && service__2(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && service__4(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, SERVICE_, r);
    return r;
  }

  // annotation?
  private static boolean service__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service__2")) return false;
    annotation(b, l + 1);
    return true;
  }

  // ( service_entity | function_ | service_type)+
  private static boolean service__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service__4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service__4_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!service__4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service__4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // service_entity | function_ | service_type
  private static boolean service__4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service__4_0")) return false;
    boolean r;
    r = service_entity(b, l + 1);
    if (!r) r = function_(b, l + 1);
    if (!r) r = service_type(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // annotation? entity literal_expr mirror? join_* exclude_? ( as_ | actions_ | ';')?
  static boolean service_entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_entity_0(b, l + 1);
    r = r && consumeToken(b, ENTITY);
    r = r && literal_expr(b, l + 1);
    r = r && service_entity_3(b, l + 1);
    r = r && service_entity_4(b, l + 1);
    r = r && service_entity_5(b, l + 1);
    r = r && service_entity_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation?
  private static boolean service_entity_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_0")) return false;
    annotation(b, l + 1);
    return true;
  }

  // mirror?
  private static boolean service_entity_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_3")) return false;
    mirror(b, l + 1);
    return true;
  }

  // join_*
  private static boolean service_entity_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!join_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_entity_4", c)) break;
    }
    return true;
  }

  // exclude_?
  private static boolean service_entity_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_5")) return false;
    exclude_(b, l + 1);
    return true;
  }

  // ( as_ | actions_ | ';')?
  private static boolean service_entity_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_6")) return false;
    service_entity_6_0(b, l + 1);
    return true;
  }

  // as_ | actions_ | ';'
  private static boolean service_entity_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_6_0")) return false;
    boolean r;
    r = as_(b, l + 1);
    if (!r) r = actions_(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    return r;
  }

  /* ********************************************************** */
  // type string '{' (string ':' many? dataType';')* '};'
  static boolean service_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, STRING);
    r = r && consumeToken(b, "{");
    r = r && service_type_3(b, l + 1);
    r = r && consumeToken(b, "};");
    exit_section_(b, m, null, r);
    return r;
  }

  // (string ':' many? dataType';')*
  private static boolean service_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_type_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_type_3", c)) break;
    }
    return true;
  }

  // string ':' many? dataType';'
  private static boolean service_type_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && consumeToken(b, ":");
    r = r && service_type_3_0_2(b, l + 1);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // many?
  private static boolean service_type_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_3_0_2")) return false;
    consumeToken(b, MANY);
    return true;
  }

  /* ********************************************************** */
  // "select" literal_expr from identifier where expr (concat_key expr)
  static boolean sql_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "select");
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    r = r && sql_Statement_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // concat_key expr
  private static boolean sql_Statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_Statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concat_key(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string ('-'|'_'string)*
  public static boolean string_concat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && string_concat_1(b, l + 1);
    exit_section_(b, m, STRING_CONCAT, r);
    return r;
  }

  // ('-'|'_'string)*
  private static boolean string_concat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_concat_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_concat_1", c)) break;
    }
    return true;
  }

  // '-'|'_'string
  private static boolean string_concat_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    if (!r) r = string_concat_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '_'string
  private static boolean string_concat_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "_");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dataType enum '{' (string';')* '};'
  static boolean type_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dataType(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && consumeToken(b, "{");
    r = r && type__3(b, l + 1);
    r = r && consumeToken(b, "};");
    exit_section_(b, m, null, r);
    return r;
  }

  // (string';')*
  private static boolean type__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type__3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type__3", c)) break;
    }
    return true;
  }

  // string';'
  private static boolean type__3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "type" string ':' type_
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = consumeToken(b, "type");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, ":");
    r = r && type_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "'" string "'"
  static boolean value_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "'");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, "'");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // " $"identifier
  static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, " $");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
