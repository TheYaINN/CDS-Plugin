// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static de.joachimsohn.cds.psi.CDSTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CDSParser implements PsiParser, LightPsiParser {

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  /* ********************************************************** */
  // Datatypes [Datatype_Enum]
  static boolean Datatype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Datatypes(b, l + 1);
    r = r && Datatype_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Datatype_Enum]
  private static boolean Datatype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_1")) return false;
    Datatype_Enum(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_LPAREN literal_number T_RPAREN
  static boolean Datatype_Argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Argument")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && literal_number(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_LPAREN literal_number T_COMMA  literal_number T_RPAREN
  static boolean Datatype_Argument_Decimal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Argument_Decimal")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && literal_number(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    r = r && literal_number(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ENUM T_LBRACE (identifier (Datatype_Enum_assignment)? T_SEMI)+ T_RBRACE
  static boolean Datatype_Enum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ENUM, T_LBRACE);
    r = r && Datatype_Enum_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (identifier (Datatype_Enum_assignment)? T_SEMI)+
  private static boolean Datatype_Enum_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Datatype_Enum_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Datatype_Enum_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Datatype_Enum_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier (Datatype_Enum_assignment)? T_SEMI
  private static boolean Datatype_Enum_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && Datatype_Enum_2_0_1(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Datatype_Enum_assignment)?
  private static boolean Datatype_Enum_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_2_0_1")) return false;
    Datatype_Enum_2_0_1_0(b, l + 1);
    return true;
  }

  // (Datatype_Enum_assignment)
  private static boolean Datatype_Enum_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Datatype_Enum_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_ASSIGN (literal_string | literal_number | literal_boolean)
  static boolean Datatype_Enum_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_assignment")) return false;
    if (!nextTokenIs(b, T_ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ASSIGN);
    r = r && Datatype_Enum_assignment_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // literal_string | literal_number | literal_boolean
  private static boolean Datatype_Enum_assignment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatype_Enum_assignment_1")) return false;
    boolean r;
    r = literal_string(b, l + 1);
    if (!r) r = literal_number(b, l + 1);
    if (!r) r = literal_boolean(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'Boolean'
  //             | 'Integer'
  //             | 'Integer64'
  //             | 'Decimal' [Datatype_Argument_Decimal]
  //             | 'Double'
  //             | 'Date'
  //             | 'Time'
  //             | 'DateTime'
  //             | 'String' [Datatype_Argument]
  //             | 'Binary' [Datatype_Argument]
  //             | 'LargeBinary'
  //             | 'LargeString'
  //             | entity_identifier
  //             | type_identifier
  public static boolean Datatypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPES, "<datatypes>");
    r = consumeToken(b, "Boolean");
    if (!r) r = consumeToken(b, "Integer");
    if (!r) r = consumeToken(b, "Integer64");
    if (!r) r = Datatypes_3(b, l + 1);
    if (!r) r = consumeToken(b, "Double");
    if (!r) r = consumeToken(b, "Date");
    if (!r) r = consumeToken(b, "Time");
    if (!r) r = consumeToken(b, "DateTime");
    if (!r) r = Datatypes_8(b, l + 1);
    if (!r) r = Datatypes_9(b, l + 1);
    if (!r) r = consumeToken(b, "LargeBinary");
    if (!r) r = consumeToken(b, "LargeString");
    if (!r) r = entity_identifier(b, l + 1);
    if (!r) r = type_identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'Decimal' [Datatype_Argument_Decimal]
  private static boolean Datatypes_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "Decimal");
    r = r && Datatypes_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Datatype_Argument_Decimal]
  private static boolean Datatypes_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_3_1")) return false;
    Datatype_Argument_Decimal(b, l + 1);
    return true;
  }

  // 'String' [Datatype_Argument]
  private static boolean Datatypes_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "String");
    r = r && Datatypes_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Datatype_Argument]
  private static boolean Datatypes_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_8_1")) return false;
    Datatype_Argument(b, l + 1);
    return true;
  }

  // 'Binary' [Datatype_Argument]
  private static boolean Datatypes_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "Binary");
    r = r && Datatypes_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Datatype_Argument]
  private static boolean Datatypes_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Datatypes_9_1")) return false;
    Datatype_Argument(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [Namespace] import_* RootItems
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = File_0(b, l + 1);
    r = r && File_1(b, l + 1);
    r = r && RootItems(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [Namespace]
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    Namespace(b, l + 1);
    return true;
  }

  // import_*
  private static boolean File_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_NAMESPACE PropertyPath T_SEMI
  public static boolean Namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Namespace")) return false;
    if (!nextTokenIs(b, KW_NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NAMESPACE);
    r = r && PropertyPath(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  /* ********************************************************** */
  // id (T_DOT id)*
  static boolean PropertyPath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyPath")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && PropertyPath_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_DOT id)*
  private static boolean PropertyPath_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyPath_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PropertyPath_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PropertyPath_1", c)) break;
    }
    return true;
  }

  // T_DOT id
  private static boolean PropertyPath_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyPath_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation ( model_ | service_ )*
  public static boolean RootItems(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootItems")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROOT_ITEMS, "<root items>");
    r = annotation(b, l + 1);
    r = r && RootItems_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( model_ | service_ )*
  private static boolean RootItems_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootItems_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RootItems_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RootItems_1", c)) break;
    }
    return true;
  }

  // model_ | service_
  private static boolean RootItems_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RootItems_1_0")) return false;
    boolean r;
    r = model_(b, l + 1);
    if (!r) r = service_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_ACTIONS T_LBRACE (method_ T_SEMI)* T_RBRACE
  static boolean actions_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions_")) return false;
    if (!nextTokenIs(b, KW_ACTIONS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ACTIONS, T_LBRACE);
    r = r && actions__2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (method_ T_SEMI)*
  private static boolean actions__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions__2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!actions__2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actions__2", c)) break;
    }
    return true;
  }

  // method_ T_SEMI
  private static boolean actions__2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actions__2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // annotation_entry*
  public static boolean annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation")) return false;
    Marker m = enter_section_(b, l, _NONE_, ANNOTATION, "<annotation>");
    while (true) {
      int c = current_position_(b);
      if (!annotation_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // KW_ASSERT T_DOT (annotation_assert_unique | annotation_assert_integrity | annotation_assert_format | annotation_assert_range | annotation_assert_notnull)
  static boolean annotation_assert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert")) return false;
    if (!nextTokenIs(b, KW_ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASSERT, T_DOT);
    r = r && annotation_assert_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // annotation_assert_unique | annotation_assert_integrity | annotation_assert_format | annotation_assert_range | annotation_assert_notnull
  private static boolean annotation_assert_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_2")) return false;
    boolean r;
    r = annotation_assert_unique(b, l + 1);
    if (!r) r = annotation_assert_integrity(b, l + 1);
    if (!r) r = annotation_assert_format(b, l + 1);
    if (!r) r = annotation_assert_range(b, l + 1);
    if (!r) r = annotation_assert_notnull(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_FORMAT T_COLON stringlit T_COLON
  static boolean annotation_assert_format(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_format")) return false;
    if (!nextTokenIs(b, KW_FORMAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_FORMAT, T_COLON, STRINGLIT, T_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_INTEGRITY T_COLON literal_boolean
  static boolean annotation_assert_integrity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_integrity")) return false;
    if (!nextTokenIs(b, KW_INTEGRITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INTEGRITY, T_COLON);
    r = r && literal_boolean(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NOTNULL T_COLON literal_boolean
  static boolean annotation_assert_notnull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_notnull")) return false;
    if (!nextTokenIs(b, KW_NOTNULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_NOTNULL, T_COLON);
    r = r && literal_boolean(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RANGE T_COLON (T_LBRACK ( literal_number | R_DATE ) T_RBRACK | Datatype_Enum) T_COLON
  static boolean annotation_assert_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_range")) return false;
    if (!nextTokenIs(b, KW_RANGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_RANGE, T_COLON);
    r = r && annotation_assert_range_2(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LBRACK ( literal_number | R_DATE ) T_RBRACK | Datatype_Enum
  private static boolean annotation_assert_range_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_range_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = annotation_assert_range_2_0(b, l + 1);
    if (!r) r = Datatype_Enum(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_LBRACK ( literal_number | R_DATE ) T_RBRACK
  private static boolean annotation_assert_range_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_range_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACK);
    r = r && annotation_assert_range_2_0_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // literal_number | R_DATE
  private static boolean annotation_assert_range_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_range_2_0_1")) return false;
    boolean r;
    r = literal_number(b, l + 1);
    if (!r) r = consumeToken(b, R_DATE);
    return r;
  }

  /* ********************************************************** */
  // KW_UNIQUE T_COLON T_LBRACE annotation_assert_unique_field (T_COMMA annotation_assert_unique_field)* T_RBRACE
  static boolean annotation_assert_unique(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique")) return false;
    if (!nextTokenIs(b, KW_UNIQUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_UNIQUE, T_COLON, T_LBRACE);
    r = r && annotation_assert_unique_field(b, l + 1);
    r = r && annotation_assert_unique_4(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA annotation_assert_unique_field)*
  private static boolean annotation_assert_unique_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_assert_unique_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_assert_unique_4", c)) break;
    }
    return true;
  }

  // T_COMMA annotation_assert_unique_field
  private static boolean annotation_assert_unique_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && annotation_assert_unique_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_field_identifier T_COLON T_LBRACK identifier (T_COMMA identifier)* T_RBRACK
  static boolean annotation_assert_unique_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_field_identifier(b, l + 1);
    r = r && consumeTokens(b, 0, T_COLON, T_LBRACK);
    r = r && identifier(b, l + 1);
    r = r && annotation_assert_unique_field_4(b, l + 1);
    r = r && consumeToken(b, T_RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA identifier)*
  private static boolean annotation_assert_unique_field_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique_field_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_assert_unique_field_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_assert_unique_field_4", c)) break;
    }
    return true;
  }

  // T_COMMA identifier
  private static boolean annotation_assert_unique_field_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_assert_unique_field_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CDS_ON (KW_INSERT | KW_UPDATE) T_COLON T_DOLLAR (KW_NOW | KW_USER)
  static boolean annotation_cds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_cds")) return false;
    if (!nextTokenIs(b, KW_CDS_ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CDS_ON);
    r = r && annotation_cds_1(b, l + 1);
    r = r && consumeTokens(b, 0, T_COLON, T_DOLLAR);
    r = r && annotation_cds_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_INSERT | KW_UPDATE
  private static boolean annotation_cds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_cds_1")) return false;
    boolean r;
    r = consumeToken(b, KW_INSERT);
    if (!r) r = consumeToken(b, KW_UPDATE);
    return r;
  }

  // KW_NOW | KW_USER
  private static boolean annotation_cds_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_cds_4")) return false;
    boolean r;
    r = consumeToken(b, KW_NOW);
    if (!r) r = consumeToken(b, KW_USER);
    return r;
  }

  /* ********************************************************** */
  // T_AT (KW_READ_ONLY | annotation_cds | annotation_restrict | annotation_requires | annotation_assert)
  static boolean annotation_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_entry")) return false;
    if (!nextTokenIs(b, T_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_AT);
    r = r && annotation_entry_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_READ_ONLY | annotation_cds | annotation_restrict | annotation_requires | annotation_assert
  private static boolean annotation_entry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_entry_1")) return false;
    boolean r;
    r = consumeToken(b, KW_READ_ONLY);
    if (!r) r = annotation_cds(b, l + 1);
    if (!r) r = annotation_restrict(b, l + 1);
    if (!r) r = annotation_requires(b, l + 1);
    if (!r) r = annotation_assert(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_GRANT T_COLON T_LBRACK T_HYPH annotation_grant_authorization T_HYPH (T_COMMA stringlit)* T_RBRACK T_COMMA?
  static boolean annotation_grant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant")) return false;
    if (!nextTokenIs(b, KW_GRANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_GRANT, T_COLON, T_LBRACK, T_HYPH);
    r = r && annotation_grant_authorization(b, l + 1);
    r = r && consumeToken(b, T_HYPH);
    r = r && annotation_grant_6(b, l + 1);
    r = r && consumeToken(b, T_RBRACK);
    r = r && annotation_grant_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA stringlit)*
  private static boolean annotation_grant_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!annotation_grant_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "annotation_grant_6", c)) break;
    }
    return true;
  }

  // T_COMMA stringlit
  private static boolean annotation_grant_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_COMMA, STRINGLIT);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean annotation_grant_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_8")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // READ | KW_UPDATE | DELETE
  static boolean annotation_grant_authorization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_grant_authorization")) return false;
    boolean r;
    r = consumeToken(b, READ);
    if (!r) r = consumeToken(b, KW_UPDATE);
    if (!r) r = consumeToken(b, DELETE);
    return r;
  }

  /* ********************************************************** */
  // T_LPAREN KW_REQUIRED T_COLON stringlit T_RPAREN
  static boolean annotation_requires(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_requires")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_LPAREN, KW_REQUIRED, T_COLON, STRINGLIT, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RESTRICT  T_COLON T_LBRACK annotation_statement T_RBRACK
  static boolean annotation_restrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_restrict")) return false;
    if (!nextTokenIs(b, KW_RESTRICT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_RESTRICT, T_COLON, T_LBRACK);
    r = r && annotation_statement(b, l + 1);
    r = r && consumeToken(b, T_RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACK annotation_grant annotation_to? annotation_where? T_RBRACE
  static boolean annotation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_statement")) return false;
    if (!nextTokenIs(b, T_LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACK);
    r = r && annotation_grant(b, l + 1);
    r = r && annotation_statement_2(b, l + 1);
    r = r && annotation_statement_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
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
  // KW_TO T_COLON stringlit T_COMMA?
  static boolean annotation_to(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_to")) return false;
    if (!nextTokenIs(b, KW_TO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TO, T_COLON, STRINGLIT);
    r = r && annotation_to_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COMMA?
  private static boolean annotation_to_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_to_3")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_WHERE T_COLON T_HYPH expression ( KW_EXISTS T_LPAREN sql_Statement T_RPAREN )? T_HYPH
  static boolean annotation_where(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WHERE, T_COLON, T_HYPH);
    r = r && expression(b, l + 1);
    r = r && annotation_where_4(b, l + 1);
    r = r && consumeToken(b, T_HYPH);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KW_EXISTS T_LPAREN sql_Statement T_RPAREN )?
  private static boolean annotation_where_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where_4")) return false;
    annotation_where_4_0(b, l + 1);
    return true;
  }

  // KW_EXISTS T_LPAREN sql_Statement T_RPAREN
  private static boolean annotation_where_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "annotation_where_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXISTS, T_LPAREN);
    r = r && sql_Statement(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASPECT aspect_identifier T_LBRACE aspect_field+ T_RBRACE T_SEMI
  static boolean aspect_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aspect_")) return false;
    if (!nextTokenIs(b, KW_ASPECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ASPECT);
    r = r && aspect_identifier(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && aspect__3(b, l + 1);
    r = r && consumeTokens(b, 0, T_RBRACE, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // aspect_field+
  private static boolean aspect__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aspect__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = aspect_field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!aspect_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aspect__3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // aspect_identifier T_COLON Datatype T_SEMI
  static boolean aspect_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aspect_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = aspect_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && Datatype(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean aspect_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_ENTITY entity_identifier entity_extend? T_LBRACE entity_field+ T_RBRACE T_SEMI
  static boolean entity_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_")) return false;
    if (!nextTokenIs(b, KW_ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENTITY);
    r = r && entity_identifier(b, l + 1);
    r = r && entity__2(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && entity__4(b, l + 1);
    r = r && consumeTokens(b, 0, T_RBRACE, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // entity_extend?
  private static boolean entity__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__2")) return false;
    entity_extend(b, l + 1);
    return true;
  }

  // entity_field+
  private static boolean entity__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity__4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!entity_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity__4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEFAULT entity_default_value
  static boolean entity_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_default")) return false;
    if (!nextTokenIs(b, KW_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEFAULT);
    r = r && entity_default_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal_number | stringlit
  static boolean entity_default_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_default_value")) return false;
    if (!nextTokenIs(b, "", NUMBERLIT, STRINGLIT)) return false;
    boolean r;
    r = literal_number(b, l + 1);
    if (!r) r = consumeToken(b, STRINGLIT);
    return r;
  }

  /* ********************************************************** */
  // T_COLON entity_extend_identifier (T_COMMA entity_extend_identifier)*
  static boolean entity_extend(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_extend")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && entity_extend_identifier(b, l + 1);
    r = r && entity_extend_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA entity_extend_identifier)*
  private static boolean entity_extend_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_extend_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!entity_extend_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_extend_2", c)) break;
    }
    return true;
  }

  // T_COMMA entity_extend_identifier
  private static boolean entity_extend_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_extend_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && entity_extend_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean entity_extend_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_KEY? entity_field_identifier T_COLON (Datatype [entity_default] | relation_ | entity_type_reference ) [KW_REQUIRED] annotation T_SEMI
  static boolean entity_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field")) return false;
    if (!nextTokenIs(b, "", ID, KW_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_field_0(b, l + 1);
    r = r && entity_field_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && entity_field_3(b, l + 1);
    r = r && entity_field_4(b, l + 1);
    r = r && annotation(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_KEY?
  private static boolean entity_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_0")) return false;
    consumeToken(b, KW_KEY);
    return true;
  }

  // Datatype [entity_default] | relation_ | entity_type_reference
  private static boolean entity_field_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_field_3_0(b, l + 1);
    if (!r) r = relation_(b, l + 1);
    if (!r) r = entity_type_reference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Datatype [entity_default]
  private static boolean entity_field_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Datatype(b, l + 1);
    r = r && entity_field_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [entity_default]
  private static boolean entity_field_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_3_0_1")) return false;
    entity_default(b, l + 1);
    return true;
  }

  // [KW_REQUIRED]
  private static boolean entity_field_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_field_4")) return false;
    consumeToken(b, KW_REQUIRED);
    return true;
  }

  /* ********************************************************** */
  // identifier
  static boolean entity_field_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // identifier
  static boolean entity_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_TYPE_OF entity_type_reference_object_identifier
  static boolean entity_type_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_type_reference")) return false;
    if (!nextTokenIs(b, KW_TYPE_OF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TYPE_OF);
    r = r && entity_type_reference_object_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id [T_COLON id]
  static boolean entity_type_reference_object_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_type_reference_object_identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && entity_type_reference_object_identifier_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [T_COLON id]
  private static boolean entity_type_reference_object_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_type_reference_object_identifier_1")) return false;
    parseTokens(b, 0, T_COLON, ID);
    return true;
  }

  /* ********************************************************** */
  // (expression_key T_ASSIGN expression_value) | expression_exists
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    if (!nextTokenIs(b, "", ID, KW_EXISTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_0(b, l + 1);
    if (!r) r = expression_exists(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression_key T_ASSIGN expression_value
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_key(b, l + 1);
    r = r && consumeToken(b, T_ASSIGN);
    r = r && expression_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_EXISTS T_LPAREN sql_Statement T_RPAREN
  static boolean expression_exists(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_exists")) return false;
    if (!nextTokenIs(b, KW_EXISTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXISTS, T_LPAREN);
    r = r && sql_Statement(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PropertyPath
  static boolean expression_key(PsiBuilder b, int l) {
    return PropertyPath(b, l + 1);
  }

  /* ********************************************************** */
  // string_under | ( T_DOLLAR | T_COLON )? PropertyPath
  static boolean expression_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_value")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_under(b, l + 1);
    if (!r) r = expression_value_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_DOLLAR | T_COLON )? PropertyPath
  private static boolean expression_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_value_1_0(b, l + 1);
    r = r && PropertyPath(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( T_DOLLAR | T_COLON )?
  private static boolean expression_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_value_1_0")) return false;
    expression_value_1_0_0(b, l + 1);
    return true;
  }

  // T_DOLLAR | T_COLON
  private static boolean expression_value_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_value_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_DOLLAR);
    if (!r) r = consumeToken(b, T_COLON);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_USING  ( import_multiple | import_identifier )? KW_FROM literal_string T_SEMI
  public static boolean import_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_")) return false;
    if (!nextTokenIs(b, KW_USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_USING);
    r = r && import__1(b, l + 1);
    r = r && consumeToken(b, KW_FROM);
    r = r && literal_string(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, IMPORT_, r);
    return r;
  }

  // ( import_multiple | import_identifier )?
  private static boolean import__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import__1")) return false;
    import__1_0(b, l + 1);
    return true;
  }

  // import_multiple | import_identifier
  private static boolean import__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import__1_0")) return false;
    boolean r;
    r = import_multiple(b, l + 1);
    if (!r) r = import_identifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_AS import_as_identifier
  static boolean import_as(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_as")) return false;
    if (!nextTokenIs(b, KW_AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && import_as_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean import_as_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // PropertyPath [import_as]
  static boolean import_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyPath(b, l + 1);
    r = r && import_identifier_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [import_as]
  private static boolean import_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_identifier_1")) return false;
    import_as(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_LBRACE import_multiple_item (T_COMMA import_multiple_item)* T_RBRACE
  static boolean import_multiple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_multiple")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && import_multiple_item(b, l + 1);
    r = r && import_multiple_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA import_multiple_item)*
  private static boolean import_multiple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_multiple_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_multiple_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_multiple_2", c)) break;
    }
    return true;
  }

  // T_COMMA import_multiple_item
  private static boolean import_multiple_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_multiple_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && import_multiple_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // import_identifier
  static boolean import_multiple_item(PsiBuilder b, int l) {
    return import_identifier(b, l + 1);
  }

  /* ********************************************************** */
  // join_type identifier KW_ON expression [join_body] join_condition
  static boolean join_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_type(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, KW_ON);
    r = r && expression(b, l + 1);
    r = r && join__4(b, l + 1);
    r = r && join_condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [join_body]
  private static boolean join__4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join__4")) return false;
    join_body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_LBRACE join_field  (T_COMMA join_field)* T_RBRACE
  static boolean join_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_body")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && join_field(b, l + 1);
    r = r && join_body_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA join_field)*
  private static boolean join_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_body_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!join_body_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "join_body_2", c)) break;
    }
    return true;
  }

  // T_COMMA join_field
  private static boolean join_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && join_field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHERE expression
  static boolean join_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_condition")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHERE);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PropertyPath ( KW_AS identifier)?
  static boolean join_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyPath(b, l + 1);
    r = r && join_field_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( KW_AS identifier)?
  private static boolean join_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_field_1")) return false;
    join_field_1_0(b, l + 1);
    return true;
  }

  // KW_AS identifier
  private static boolean join_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_field_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KW_LEFT | KW_RIGHT)? (KW_OUTER | KW_INNER)? KW_JOIN
  static boolean join_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_type_0(b, l + 1);
    r = r && join_type_1(b, l + 1);
    r = r && consumeToken(b, KW_JOIN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_LEFT | KW_RIGHT)?
  private static boolean join_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type_0")) return false;
    join_type_0_0(b, l + 1);
    return true;
  }

  // KW_LEFT | KW_RIGHT
  private static boolean join_type_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type_0_0")) return false;
    boolean r;
    r = consumeToken(b, KW_LEFT);
    if (!r) r = consumeToken(b, KW_RIGHT);
    return r;
  }

  // (KW_OUTER | KW_INNER)?
  private static boolean join_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type_1")) return false;
    join_type_1_0(b, l + 1);
    return true;
  }

  // KW_OUTER | KW_INNER
  private static boolean join_type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_type_1_0")) return false;
    boolean r;
    r = consumeToken(b, KW_OUTER);
    if (!r) r = consumeToken(b, KW_INNER);
    return r;
  }

  /* ********************************************************** */
  // B_FALSE | B_TRUE
  static boolean literal_boolean(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_boolean")) return false;
    if (!nextTokenIs(b, "", B_FALSE, B_TRUE)) return false;
    boolean r;
    r = consumeToken(b, B_FALSE);
    if (!r) r = consumeToken(b, B_TRUE);
    return r;
  }

  /* ********************************************************** */
  // numberlit
  static boolean literal_number(PsiBuilder b, int l) {
    return consumeToken(b, NUMBERLIT);
  }

  /* ********************************************************** */
  // stringlit
  static boolean literal_string(PsiBuilder b, int l) {
    return consumeToken(b, STRINGLIT);
  }

  /* ********************************************************** */
  // ( KW_ACTION | KW_FUNCTION ) method_identifier method_parameters method_return?
  static boolean method_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_")) return false;
    if (!nextTokenIs(b, "", KW_ACTION, KW_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method__0(b, l + 1);
    r = r && method_identifier(b, l + 1);
    r = r && method_parameters(b, l + 1);
    r = r && method__3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_ACTION | KW_FUNCTION
  private static boolean method__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method__0")) return false;
    boolean r;
    r = consumeToken(b, KW_ACTION);
    if (!r) r = consumeToken(b, KW_FUNCTION);
    return r;
  }

  // method_return?
  private static boolean method__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method__3")) return false;
    method_return(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  static boolean method_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // T_LPAREN (method_parameters_value (T_COMMA method_parameters_value)*)? T_RPAREN
  static boolean method_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && method_parameters_1(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (method_parameters_value (T_COMMA method_parameters_value)*)?
  private static boolean method_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters_1")) return false;
    method_parameters_1_0(b, l + 1);
    return true;
  }

  // method_parameters_value (T_COMMA method_parameters_value)*
  private static boolean method_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_parameters_value(b, l + 1);
    r = r && method_parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA method_parameters_value)*
  private static boolean method_parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_parameters_1_0_1", c)) break;
    }
    return true;
  }

  // T_COMMA method_parameters_value
  private static boolean method_parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && method_parameters_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier T_COLON identifier
  static boolean method_parameters_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_parameters_value")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_RETURNS Datatype
  static boolean method_return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_return")) return false;
    if (!nextTokenIs(b, KW_RETURNS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURNS);
    r = r && Datatype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEFINE? ( type_ | entity_ | aspect_ )
  public static boolean model_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_, "<model>");
    r = model__0(b, l + 1);
    r = r && model__1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KW_DEFINE?
  private static boolean model__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model__0")) return false;
    consumeToken(b, KW_DEFINE);
    return true;
  }

  // type_ | entity_ | aspect_
  private static boolean model__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model__1")) return false;
    boolean r;
    r = type_(b, l + 1);
    if (!r) r = entity_(b, l + 1);
    if (!r) r = aspect_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (KW_ASSOCIATION_TO | KW_COMPOSITION_OF) KW_MANY? (relation_single | relation_body)
  static boolean relation_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_")) return false;
    if (!nextTokenIs(b, "", KW_ASSOCIATION_TO, KW_COMPOSITION_OF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation__0(b, l + 1);
    r = r && relation__1(b, l + 1);
    r = r && relation__2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_ASSOCIATION_TO | KW_COMPOSITION_OF
  private static boolean relation__0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__0")) return false;
    boolean r;
    r = consumeToken(b, KW_ASSOCIATION_TO);
    if (!r) r = consumeToken(b, KW_COMPOSITION_OF);
    return r;
  }

  // KW_MANY?
  private static boolean relation__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__1")) return false;
    consumeToken(b, KW_MANY);
    return true;
  }

  // relation_single | relation_body
  private static boolean relation__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation__2")) return false;
    boolean r;
    r = relation_single(b, l + 1);
    if (!r) r = relation_body(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACE relation_field+ T_RBRACE
  static boolean relation_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_body")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && relation_body_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation_field+
  private static boolean relation_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!relation_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relation_body_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_KEY? relation_field_identifier T_COLON ( Datatype | relation_ ) T_SEMI
  static boolean relation_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_field")) return false;
    if (!nextTokenIs(b, "", ID, KW_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_field_0(b, l + 1);
    r = r && relation_field_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && relation_field_3(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_KEY?
  private static boolean relation_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_field_0")) return false;
    consumeToken(b, KW_KEY);
    return true;
  }

  // Datatype | relation_
  private static boolean relation_field_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_field_3")) return false;
    boolean r;
    r = Datatype(b, l + 1);
    if (!r) r = relation_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean relation_field_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // PropertyPath
  static boolean relation_identifier(PsiBuilder b, int l) {
    return PropertyPath(b, l + 1);
  }

  /* ********************************************************** */
  // relation_identifier KW_REQUIRED? (KW_ON expression)?
  static boolean relation_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_single")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_identifier(b, l + 1);
    r = r && relation_single_1(b, l + 1);
    r = r && relation_single_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_REQUIRED?
  private static boolean relation_single_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_single_1")) return false;
    consumeToken(b, KW_REQUIRED);
    return true;
  }

  // (KW_ON expression)?
  private static boolean relation_single_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_single_2")) return false;
    relation_single_2_0(b, l + 1);
    return true;
  }

  // KW_ON expression
  private static boolean relation_single_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_single_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SERVICE service_identifier service_body T_SEMI
  public static boolean service_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_")) return false;
    if (!nextTokenIs(b, KW_SERVICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SERVICE);
    r = r && service_identifier(b, l + 1);
    r = r && service_body(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, SERVICE_, r);
    return r;
  }

  /* ********************************************************** */
  // T_LBRACE (( service_entity |  service_type | method_ | actions_ ) T_SEMI )+ T_RBRACE
  static boolean service_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_body")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && service_body_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (( service_entity |  service_type | method_ | actions_ ) T_SEMI )+
  private static boolean service_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_body_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!service_body_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_body_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ( service_entity |  service_type | method_ | actions_ ) T_SEMI
  private static boolean service_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_body_1_0_0(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // service_entity |  service_type | method_ | actions_
  private static boolean service_body_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_body_1_0_0")) return false;
    boolean r;
    r = service_entity(b, l + 1);
    if (!r) r = service_type(b, l + 1);
    if (!r) r = method_(b, l + 1);
    if (!r) r = actions_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_ENTITY service_entity_identifier method_parameters? (service_entity_body | service_entity_mirror) (join_body | join_ | sql_where_clause )? actions_?
  static boolean service_entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity")) return false;
    if (!nextTokenIs(b, KW_ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENTITY);
    r = r && service_entity_identifier(b, l + 1);
    r = r && service_entity_2(b, l + 1);
    r = r && service_entity_3(b, l + 1);
    r = r && service_entity_4(b, l + 1);
    r = r && service_entity_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // method_parameters?
  private static boolean service_entity_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_2")) return false;
    method_parameters(b, l + 1);
    return true;
  }

  // service_entity_body | service_entity_mirror
  private static boolean service_entity_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_3")) return false;
    boolean r;
    r = service_entity_body(b, l + 1);
    if (!r) r = service_entity_mirror(b, l + 1);
    return r;
  }

  // (join_body | join_ | sql_where_clause )?
  private static boolean service_entity_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_4")) return false;
    service_entity_4_0(b, l + 1);
    return true;
  }

  // join_body | join_ | sql_where_clause
  private static boolean service_entity_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_4_0")) return false;
    boolean r;
    r = join_body(b, l + 1);
    if (!r) r = join_(b, l + 1);
    if (!r) r = sql_where_clause(b, l + 1);
    return r;
  }

  // actions_?
  private static boolean service_entity_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_5")) return false;
    actions_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // T_LBRACE service_entity_field T_RBRACE
  static boolean service_entity_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_body")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && service_entity_field(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [KW_KEY] service_entity_field_identifier T_COLON Datatype
  static boolean service_entity_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_field")) return false;
    if (!nextTokenIs(b, "", ID, KW_KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_entity_field_0(b, l + 1);
    r = r && service_entity_field_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && Datatype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [KW_KEY]
  private static boolean service_entity_field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_field_0")) return false;
    consumeToken(b, KW_KEY);
    return true;
  }

  /* ********************************************************** */
  // identifier
  static boolean service_entity_field_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // identifier
  static boolean service_entity_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_AS (KW_PROJECTION KW_ON | KW_SELECT KW_FROM) service_entity_mirror_identifier (T_LPAREN service_entity_mirror_params T_RPAREN)?
  static boolean service_entity_mirror(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror")) return false;
    if (!nextTokenIs(b, KW_AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && service_entity_mirror_1(b, l + 1);
    r = r && service_entity_mirror_identifier(b, l + 1);
    r = r && service_entity_mirror_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_PROJECTION KW_ON | KW_SELECT KW_FROM
  private static boolean service_entity_mirror_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, KW_PROJECTION, KW_ON);
    if (!r) r = parseTokens(b, 0, KW_SELECT, KW_FROM);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_LPAREN service_entity_mirror_params T_RPAREN)?
  private static boolean service_entity_mirror_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_3")) return false;
    service_entity_mirror_3_0(b, l + 1);
    return true;
  }

  // T_LPAREN service_entity_mirror_params T_RPAREN
  private static boolean service_entity_mirror_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && service_entity_mirror_params(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PropertyPath
  static boolean service_entity_mirror_identifier(PsiBuilder b, int l) {
    return PropertyPath(b, l + 1);
  }

  /* ********************************************************** */
  // service_entity_mirror_params_identifier service_entity_mirror_params_value (T_COMMA service_entity_mirror_params_identifier service_entity_mirror_params_value)*
  static boolean service_entity_mirror_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_params")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_entity_mirror_params_identifier(b, l + 1);
    r = r && service_entity_mirror_params_value(b, l + 1);
    r = r && service_entity_mirror_params_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_COMMA service_entity_mirror_params_identifier service_entity_mirror_params_value)*
  private static boolean service_entity_mirror_params_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_params_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!service_entity_mirror_params_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_entity_mirror_params_2", c)) break;
    }
    return true;
  }

  // T_COMMA service_entity_mirror_params_identifier service_entity_mirror_params_value
  private static boolean service_entity_mirror_params_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_params_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && service_entity_mirror_params_identifier(b, l + 1);
    r = r && service_entity_mirror_params_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier T_COLON
  static boolean service_entity_mirror_params_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_params_identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_COLON identifier
  static boolean service_entity_mirror_params_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_entity_mirror_params_value")) return false;
    if (!nextTokenIs(b, T_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean service_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_TYPE service_type_identifier T_LBRACE service_type_field+ T_RBRACE
  static boolean service_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TYPE);
    r = r && service_type_identifier(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && service_type_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // service_type_field+
  private static boolean service_type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_type_field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!service_type_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "service_type_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // service_type_field_identifier T_COLON KW_MANY? Datatype T_SEMI
  static boolean service_type_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = service_type_field_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && service_type_field_2(b, l + 1);
    r = r && Datatype(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_MANY?
  private static boolean service_type_field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "service_type_field_2")) return false;
    consumeToken(b, KW_MANY);
    return true;
  }

  /* ********************************************************** */
  // identifier
  static boolean service_type_field_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // identifier
  static boolean service_type_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // sql_select_clause sql_from_clause sql_where_clause
  static boolean sql_Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_Statement")) return false;
    if (!nextTokenIs(b, KW_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sql_select_clause(b, l + 1);
    r = r && sql_from_clause(b, l + 1);
    r = r && sql_where_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FROM sql_from_clause_identifier (KW_AS sql_from_clause_identifier)?
  static boolean sql_from_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_from_clause")) return false;
    if (!nextTokenIs(b, KW_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FROM);
    r = r && sql_from_clause_identifier(b, l + 1);
    r = r && sql_from_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_AS sql_from_clause_identifier)?
  private static boolean sql_from_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_from_clause_2")) return false;
    sql_from_clause_2_0(b, l + 1);
    return true;
  }

  // KW_AS sql_from_clause_identifier
  private static boolean sql_from_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_from_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && sql_from_clause_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean sql_from_clause_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_SELECT sql_select_clause_identifier (KW_AS sql_select_clause_identifier)?
  static boolean sql_select_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_select_clause")) return false;
    if (!nextTokenIs(b, KW_SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SELECT);
    r = r && sql_select_clause_identifier(b, l + 1);
    r = r && sql_select_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_AS sql_select_clause_identifier)?
  private static boolean sql_select_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_select_clause_2")) return false;
    sql_select_clause_2_0(b, l + 1);
    return true;
  }

  // KW_AS sql_select_clause_identifier
  private static boolean sql_select_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_select_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && sql_select_clause_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean sql_select_clause_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // KW_WHERE expression ((KW_AND | KW_OR) expression)*
  static boolean sql_where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_where_clause")) return false;
    if (!nextTokenIs(b, KW_WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_WHERE);
    r = r && expression(b, l + 1);
    r = r && sql_where_clause_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((KW_AND | KW_OR) expression)*
  private static boolean sql_where_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_where_clause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sql_where_clause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sql_where_clause_2", c)) break;
    }
    return true;
  }

  // (KW_AND | KW_OR) expression
  private static boolean sql_where_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_where_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sql_where_clause_2_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_AND | KW_OR
  private static boolean sql_where_clause_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_where_clause_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, KW_AND);
    if (!r) r = consumeToken(b, KW_OR);
    return r;
  }

  /* ********************************************************** */
  // literal_string (T_UNDER literal_string)+
  static boolean string_under(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_under")) return false;
    if (!nextTokenIs(b, STRINGLIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_string(b, l + 1);
    r = r && string_under_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (T_UNDER literal_string)+
  private static boolean string_under_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_under_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_under_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!string_under_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_under_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // T_UNDER literal_string
  private static boolean string_under_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_under_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_UNDER);
    r = r && literal_string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPE type_identifier ( T_COLON  ( Datatype | relation_ ) | type_object ) T_SEMI
  static boolean type_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TYPE);
    r = r && type_identifier(b, l + 1);
    r = r && type__2(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COLON  ( Datatype | relation_ ) | type_object
  private static boolean type__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type__2_0(b, l + 1);
    if (!r) r = type_object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_COLON  ( Datatype | relation_ )
  private static boolean type__2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLON);
    r = r && type__2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Datatype | relation_
  private static boolean type__2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type__2_0_1")) return false;
    boolean r;
    r = Datatype(b, l + 1);
    if (!r) r = relation_(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // type_field_identifier T_COLON Datatype T_SEMI
  static boolean type_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_field")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_field_identifier(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && Datatype(b, l + 1);
    r = r && consumeToken(b, T_SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  static boolean type_field_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // identifier
  static boolean type_identifier(PsiBuilder b, int l) {
    return identifier(b, l + 1);
  }

  /* ********************************************************** */
  // T_LBRACE type_field* T_RBRACE
  static boolean type_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_object")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && type_object_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_field*
  private static boolean type_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_object_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_object_1", c)) break;
    }
    return true;
  }

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

}
