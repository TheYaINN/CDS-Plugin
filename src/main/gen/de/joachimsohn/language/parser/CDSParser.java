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
  public static boolean action_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_")) return false;
    if (!nextTokenIs(b, ACTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION);
    r = r && method_call(b, l + 1);
    r = r && consumeToken(b, RETURNS);
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ACTION_, r);
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
  // assert'.'unique ':' '{' string_concat':' '[' string (','string)* ']''}'
  public static boolean annotation_assert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, UNIQUE);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "{");
    r = r && string_concat(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "[");
    r = r && consumeToken(b, STRING);
    r = r && annotation_assert_9(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, ANNOTATION_ASSERT, r);
    return r;
  }

  // (','string)*
  private static boolean annotation_assert_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_assert_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_assert_9", c)) break;
    }
    return true;
  }

  // ','string
  private static boolean annotation_assert_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // grant ':' '[' "'" crud_op "'" (',' hyphen_string)* ']' ','?
  public static boolean annotation_grant(PsiBuilder b, int l) {
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
    exit_section_(b, m, ANNOTATION_GRANT, r);
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
  public static boolean annotation_requires(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_requires")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_REQUIRES, "<annotation requires>");
    r = consumeToken(b, "(");
    r = r && consumeToken(b, REQUIRES);
    r = r && consumeToken(b, ":");
    r = r && hyphen_string(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // restrict ':' '['  annotation_statement ']'
  public static boolean annotation_restrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_restrict")) return false;
    if (!nextTokenIs(b, RESTRICT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESTRICT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, "[");
    r = r && annotation_statement(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, ANNOTATION_RESTRICT, r);
    return r;
  }

  /* ********************************************************** */
  // '{' annotation_grant annotation_to? annotation_where? '}'
  public static boolean annotation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION_STATEMENT, "<annotation statement>");
    r = consumeToken(b, "{");
    r = r && annotation_grant(b, l + 1);
    r = r && annotation_statement_2(b, l + 1);
    r = r && annotation_statement_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
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
  public static boolean annotation_to(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_to")) return false;
    if (!nextTokenIs(b, TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && consumeToken(b, ":");
    r = r && hyphen_string(b, l + 1);
    r = r && annotation_to_3(b, l + 1);
    exit_section_(b, m, ANNOTATION_TO, r);
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
  public static boolean annotation_where(PsiBuilder b, int l) {
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
    exit_section_(b, m, ANNOTATION_WHERE, r);
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
  public static boolean as_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_, "<as>");
    r = consumeToken(b, "{");
    r = r && as_recursive(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier as literal_expr (',' as_recursive)*
  public static boolean as_recursive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "as_recursive")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && literal_expr(b, l + 1);
    r = r && as_recursive_3(b, l + 1);
    exit_section_(b, m, AS_RECURSIVE, r);
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
  // "Association to" many? string required_?(on expr)?
  public static boolean association_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_, "<association>");
    r = consumeToken(b, "Association to");
    r = r && association__1(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && association__3(b, l + 1);
    r = r && association__4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // many?
  private static boolean association__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association__1")) return false;
    consumeToken(b, MANY);
    return true;
  }

  // required_?
  private static boolean association__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association__3")) return false;
    required_(b, l + 1);
    return true;
  }

  // (on expr)?
  private static boolean association__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association__4")) return false;
    association__4_0(b, l + 1);
    return true;
  }

  // on expr
  private static boolean association__4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association__4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case when identifier is required_ then "'" string "'" else identifier end as string_concat ':' identifier
  public static boolean case_(PsiBuilder b, int l) {
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
    exit_section_(b, m, CASE_, r);
    return r;
  }

  /* ********************************************************** */
  // "Composition of" many? string on expr
  public static boolean composition_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "composition_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITION_, "<composition>");
    r = consumeToken(b, "Composition of");
    r = r && composition__1(b, l + 1);
    r = r && consumeTokens(b, 0, STRING, ON);
    r = r && expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // many?
  private static boolean composition__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "composition__1")) return false;
    consumeToken(b, MANY);
    return true;
  }

  /* ********************************************************** */
  // and | or
  public static boolean concat_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concat_key")) return false;
    if (!nextTokenIs(b, "<concat key>", AND, OR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCAT_KEY, "<concat key>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // READ | UPDATE | DELETE
  public static boolean crud_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "crud_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CRUD_OP, "<crud op>");
    r = consumeToken(b, READ);
    if (!r) r = consumeToken(b, UPDATE);
    if (!r) r = consumeToken(b, DELETE);
    exit_section_(b, l, m, r, false, null);
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
  // annotation* entity string (':' string)? '{' field_* '}'
  public static boolean data_entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_ENTITY, "<data entity>");
    r = data_entity_0(b, l + 1);
    r = r && consumeTokens(b, 0, ENTITY, STRING);
    r = r && data_entity_3(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && data_entity_5(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // annotation*
  private static boolean data_entity_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entity_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_entity_0", c)) break;
    }
    return true;
  }

  // (':' string)?
  private static boolean data_entity_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entity_3")) return false;
    data_entity_3_0(b, l + 1);
    return true;
  }

  // ':' string
  private static boolean data_entity_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entity_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_*
  private static boolean data_entity_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entity_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_entity_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // excluding '{' literal_expr '}'
  public static boolean exclude_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_")) return false;
    if (!nextTokenIs(b, EXCLUDING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXCLUDING);
    r = r && consumeToken(b, "{");
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, EXCLUDE_, r);
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
  // key? string ':' (dataType | association_ | composition_) required_? ';'
  public static boolean field_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_")) return false;
    if (!nextTokenIs(b, "<field>", KEY, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_, "<field>");
    r = field__0(b, l + 1);
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, ":");
    r = r && field__3(b, l + 1);
    r = r && field__4(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // key?
  private static boolean field__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field__0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // dataType | association_ | composition_
  private static boolean field__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field__3")) return false;
    boolean r;
    r = dataType(b, l + 1);
    if (!r) r = association_(b, l + 1);
    if (!r) r = composition_(b, l + 1);
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
  // "'" string_concat "'"
  public static boolean hyphen_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hyphen_string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HYPHEN_STRING, "<hyphen string>");
    r = consumeToken(b, "'");
    r = r && string_concat(b, l + 1);
    r = r && consumeToken(b, "'");
    exit_section_(b, l, m, r, false, null);
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
  // using (import_values | identifier import_as) from "'" path "';"
  public static boolean import_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && import__1(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && consumeToken(b, "'");
    r = r && path(b, l + 1);
    r = r && consumeToken(b, "';");
    exit_section_(b, m, IMPORT_, r);
    return r;
  }

  // import_values | identifier import_as
  private static boolean import__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import__1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_values(b, l + 1);
    if (!r) r = import__1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier import_as
  private static boolean import__1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import__1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && import_as(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // as string
  public static boolean import_as(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, STRING);
    exit_section_(b, m, IMPORT_AS, r);
    return r;
  }

  /* ********************************************************** */
  // '{' string (','string)* '}'
  public static boolean import_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_VALUES, "<import values>");
    r = consumeToken(b, "{");
    r = r && consumeToken(b, STRING);
    r = r && import_values_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (','string)*
  private static boolean import_values_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_values_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_values_2", c)) break;
    }
    return true;
  }

  // ','string
  private static boolean import_values_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_values_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // service_ | data_entity | COMMENT | CRLF
  public static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM_, "<item>");
    r = service_(b, l + 1);
    if (!r) r = data_entity(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // join_type identifier (as string)? on expr (and expr)? ('{' join_expr (','join_expr)* ('} 'join_condition | '};'))?
  public static boolean join_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_, "<join>");
    r = join_type(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && join__2(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && expr(b, l + 1);
    r = r && join__5(b, l + 1);
    r = r && join__6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  public static boolean join_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_condition")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, JOIN_CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // key? (identifier as string | case_)
  public static boolean join_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_EXPR, "<join expr>");
    r = join_expr_0(b, l + 1);
    r = r && join_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  public static boolean join_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_TYPE, "<join type>");
    r = consumeToken(b, JOIN);
    if (!r) r = consumeToken(b, "left join");
    if (!r) r = consumeToken(b, "left outer join");
    exit_section_(b, l, m, r, false, null);
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
  public static boolean mirror(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mirror")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && mirror_1(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, MIRROR, r);
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
  // (('@' string | '.' | '..' | string_concat | string)('/' | '.')?)*
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    Marker m = enter_section_(b, l, _NONE_, PATH, "<path>");
    while (true) {
      int c = current_position_(b);
      if (!path_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ('@' string | '.' | '..' | string_concat | string)('/' | '.')?
  private static boolean path_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_0_0(b, l + 1);
    r = r && path_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '@' string | '.' | '..' | string_concat | string
  private static boolean path_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_0_0_0(b, l + 1);
    if (!r) r = consumeToken(b, ".");
    if (!r) r = consumeToken(b, "..");
    if (!r) r = string_concat(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // '@' string
  private static boolean path_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@");
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' | '.')?
  private static boolean path_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0_1")) return false;
    path_0_1_0(b, l + 1);
    return true;
  }

  // '/' | '.'
  private static boolean path_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, ".");
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
  public static boolean service_entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SERVICE_ENTITY, "<service entity>");
    r = service_entity_0(b, l + 1);
    r = r && consumeToken(b, ENTITY);
    r = r && literal_expr(b, l + 1);
    r = r && service_entity_3(b, l + 1);
    r = r && service_entity_4(b, l + 1);
    r = r && service_entity_5(b, l + 1);
    r = r && service_entity_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  public static boolean service_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, STRING);
    r = r && consumeToken(b, "{");
    r = r && service_type_3(b, l + 1);
    r = r && consumeToken(b, "};");
    exit_section_(b, m, SERVICE_TYPE, r);
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
  public static boolean sql_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_STATEMENT, "<sql statement>");
    r = consumeToken(b, "select");
    r = r && literal_expr(b, l + 1);
    r = r && consumeToken(b, FROM);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    r = r && sql_Statement_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // string (('-'|'_')?string)*
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

  // (('-'|'_')?string)*
  private static boolean string_concat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!string_concat_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_concat_1", c)) break;
    }
    return true;
  }

  // ('-'|'_')?string
  private static boolean string_concat_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_concat_1_0_0(b, l + 1);
    r = r && consumeToken(b, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('-'|'_')?
  private static boolean string_concat_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1_0_0")) return false;
    string_concat_1_0_0_0(b, l + 1);
    return true;
  }

  // '-'|'_'
  private static boolean string_concat_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_concat_1_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "_");
    return r;
  }

  /* ********************************************************** */
  // ('String' | 'Integer') enum '{' (string';')* '};'
  public static boolean type_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_, "<type>");
    r = type__0(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && consumeToken(b, "{");
    r = r && type__3(b, l + 1);
    r = r && consumeToken(b, "};");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'String' | 'Integer'
  private static boolean type__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__0")) return false;
    boolean r;
    r = consumeToken(b, "String");
    if (!r) r = consumeToken(b, "Integer");
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
  public static boolean value_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_, "<value>");
    r = consumeToken(b, "'");
    r = r && consumeToken(b, STRING);
    r = r && consumeToken(b, "'");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "$"identifier
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = consumeToken(b, "$");
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
