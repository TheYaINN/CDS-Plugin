// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.joachimsohn.language.psi.impl.*;

public interface CDSTypes {

  IElementType ACTIONS_ = new CDSElementType("ACTIONS_");
  IElementType ACTION_ = new CDSElementType("ACTION_");
  IElementType ANNOTATION = new CDSElementType("ANNOTATION");
  IElementType ANNOTATION_ASSERT = new CDSElementType("ANNOTATION_ASSERT");
  IElementType ANNOTATION_GRANT = new CDSElementType("ANNOTATION_GRANT");
  IElementType ANNOTATION_REQUIRES = new CDSElementType("ANNOTATION_REQUIRES");
  IElementType ANNOTATION_RESTRICT = new CDSElementType("ANNOTATION_RESTRICT");
  IElementType ANNOTATION_STATEMENT = new CDSElementType("ANNOTATION_STATEMENT");
  IElementType ANNOTATION_TO = new CDSElementType("ANNOTATION_TO");
  IElementType ANNOTATION_WHERE = new CDSElementType("ANNOTATION_WHERE");
  IElementType ASSOCIATION_ = new CDSElementType("ASSOCIATION_");
  IElementType AS_ = new CDSElementType("AS_");
  IElementType AS_RECURSIVE = new CDSElementType("AS_RECURSIVE");
  IElementType CASE_ = new CDSElementType("CASE_");
  IElementType COMPOSITION_ = new CDSElementType("COMPOSITION_");
  IElementType CONCAT_KEY = new CDSElementType("CONCAT_KEY");
  IElementType CRUD_OP = new CDSElementType("CRUD_OP");
  IElementType DATA_ENTITY = new CDSElementType("DATA_ENTITY");
  IElementType DATA_TYPE = new CDSElementType("DATA_TYPE");
  IElementType EXCLUDE_ = new CDSElementType("EXCLUDE_");
  IElementType EXPR = new CDSElementType("EXPR");
  IElementType FIELD_ = new CDSElementType("FIELD_");
  IElementType FUNCTION_ = new CDSElementType("FUNCTION_");
  IElementType HYPHEN_STRING = new CDSElementType("HYPHEN_STRING");
  IElementType IDENTIFIER = new CDSElementType("IDENTIFIER");
  IElementType IMPORT_ = new CDSElementType("IMPORT_");
  IElementType IMPORT_AS = new CDSElementType("IMPORT_AS");
  IElementType IMPORT_VALUES = new CDSElementType("IMPORT_VALUES");
  IElementType ITEM_ = new CDSElementType("ITEM_");
  IElementType JOIN_ = new CDSElementType("JOIN_");
  IElementType JOIN_CONDITION = new CDSElementType("JOIN_CONDITION");
  IElementType JOIN_EXPR = new CDSElementType("JOIN_EXPR");
  IElementType JOIN_TYPE = new CDSElementType("JOIN_TYPE");
  IElementType LITERAL_EXPR = new CDSElementType("LITERAL_EXPR");
  IElementType METHOD_CALL = new CDSElementType("METHOD_CALL");
  IElementType MIRROR = new CDSElementType("MIRROR");
  IElementType NAMESPACE_ = new CDSElementType("NAMESPACE_");
  IElementType PATH = new CDSElementType("PATH");
  IElementType REQUIRED_ = new CDSElementType("REQUIRED_");
  IElementType SERVICE_ = new CDSElementType("SERVICE_");
  IElementType SERVICE_ENTITY = new CDSElementType("SERVICE_ENTITY");
  IElementType SERVICE_TYPE = new CDSElementType("SERVICE_TYPE");
  IElementType SQL_STATEMENT = new CDSElementType("SQL_STATEMENT");
  IElementType STRING_CONCAT = new CDSElementType("STRING_CONCAT");
  IElementType TYPE_ = new CDSElementType("TYPE_");
  IElementType TYPE_DECLARATION = new CDSElementType("TYPE_DECLARATION");
  IElementType VALUE_ = new CDSElementType("VALUE_");
  IElementType VARIABLE = new CDSElementType("VARIABLE");

  IElementType ACTION = new CDSTokenType("action");
  IElementType ACTIONS = new CDSTokenType("actions");
  IElementType AND = new CDSTokenType("and");
  IElementType AS = new CDSTokenType("as");
  IElementType ASSERT = new CDSTokenType("assert");
  IElementType CASE = new CDSTokenType("case");
  IElementType COMMENT = new CDSTokenType("COMMENT");
  IElementType CRLF = new CDSTokenType("CRLF");
  IElementType DELETE = new CDSTokenType("DELETE");
  IElementType ELSE = new CDSTokenType("else");
  IElementType END = new CDSTokenType("end");
  IElementType ENTITY = new CDSTokenType("entity");
  IElementType ENUM = new CDSTokenType("enum");
  IElementType EXCLUDING = new CDSTokenType("excluding");
  IElementType EXISTS = new CDSTokenType("exists");
  IElementType FROM = new CDSTokenType("from");
  IElementType FUNCTION = new CDSTokenType("function");
  IElementType GRANT = new CDSTokenType("grant");
  IElementType IS = new CDSTokenType("is");
  IElementType JOIN = new CDSTokenType("join");
  IElementType KEY = new CDSTokenType("key");
  IElementType MANY = new CDSTokenType("many");
  IElementType NAMESPACE = new CDSTokenType("namespace");
  IElementType NOT = new CDSTokenType("not");
  IElementType NULL = new CDSTokenType("null");
  IElementType NUMBER = new CDSTokenType("number");
  IElementType ON = new CDSTokenType("on");
  IElementType OR = new CDSTokenType("or");
  IElementType PROJECTION = new CDSTokenType("projection");
  IElementType READ = new CDSTokenType("READ");
  IElementType READONLY = new CDSTokenType("readonly");
  IElementType REQUIRES = new CDSTokenType("requires");
  IElementType RESTRICT = new CDSTokenType("restrict");
  IElementType RETURNS = new CDSTokenType("returns");
  IElementType SELECT = new CDSTokenType("select");
  IElementType SERVICE = new CDSTokenType("service");
  IElementType STRING = new CDSTokenType("string");
  IElementType THEN = new CDSTokenType("then");
  IElementType TO = new CDSTokenType("to");
  IElementType TYPE = new CDSTokenType("type");
  IElementType UNIQUE = new CDSTokenType("unique");
  IElementType UPDATE = new CDSTokenType("UPDATE");
  IElementType USING = new CDSTokenType("using");
  IElementType WHEN = new CDSTokenType("when");
  IElementType WHERE = new CDSTokenType("where");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTIONS_) {
        return new CDSActions_Impl(node);
      }
      else if (type == ACTION_) {
        return new CDSAction_Impl(node);
      }
      else if (type == ANNOTATION) {
        return new CDSAnnotationImpl(node);
      }
      else if (type == ANNOTATION_ASSERT) {
        return new CDSAnnotationAssertImpl(node);
      }
      else if (type == ANNOTATION_GRANT) {
        return new CDSAnnotationGrantImpl(node);
      }
      else if (type == ANNOTATION_REQUIRES) {
        return new CDSAnnotationRequiresImpl(node);
      }
      else if (type == ANNOTATION_RESTRICT) {
        return new CDSAnnotationRestrictImpl(node);
      }
      else if (type == ANNOTATION_STATEMENT) {
        return new CDSAnnotationStatementImpl(node);
      }
      else if (type == ANNOTATION_TO) {
        return new CDSAnnotationToImpl(node);
      }
      else if (type == ANNOTATION_WHERE) {
        return new CDSAnnotationWhereImpl(node);
      }
      else if (type == ASSOCIATION_) {
        return new CDSAssociation_Impl(node);
      }
      else if (type == AS_) {
        return new CDSAs_Impl(node);
      }
      else if (type == AS_RECURSIVE) {
        return new CDSAsRecursiveImpl(node);
      }
      else if (type == CASE_) {
        return new CDSCase_Impl(node);
      }
      else if (type == COMPOSITION_) {
        return new CDSComposition_Impl(node);
      }
      else if (type == CONCAT_KEY) {
        return new CDSConcatKeyImpl(node);
      }
      else if (type == CRUD_OP) {
        return new CDSCrudOpImpl(node);
      }
      else if (type == DATA_ENTITY) {
        return new CDSDataEntityImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new CDSDataTypeImpl(node);
      }
      else if (type == EXCLUDE_) {
        return new CDSExclude_Impl(node);
      }
      else if (type == EXPR) {
        return new CDSExprImpl(node);
      }
      else if (type == FIELD_) {
        return new CDSField_Impl(node);
      }
      else if (type == FUNCTION_) {
        return new CDSFunction_Impl(node);
      }
      else if (type == HYPHEN_STRING) {
        return new CDSHyphenStringImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new CDSIdentifierImpl(node);
      }
      else if (type == IMPORT_) {
        return new CDSImport_Impl(node);
      }
      else if (type == IMPORT_AS) {
        return new CDSImportAsImpl(node);
      }
      else if (type == IMPORT_VALUES) {
        return new CDSImportValuesImpl(node);
      }
      else if (type == ITEM_) {
        return new CDSItem_Impl(node);
      }
      else if (type == JOIN_) {
        return new CDSJoin_Impl(node);
      }
      else if (type == JOIN_CONDITION) {
        return new CDSJoinConditionImpl(node);
      }
      else if (type == JOIN_EXPR) {
        return new CDSJoinExprImpl(node);
      }
      else if (type == JOIN_TYPE) {
        return new CDSJoinTypeImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new CDSLiteralExprImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new CDSMethodCallImpl(node);
      }
      else if (type == MIRROR) {
        return new CDSMirrorImpl(node);
      }
      else if (type == NAMESPACE_) {
        return new CDSNamespace_Impl(node);
      }
      else if (type == PATH) {
        return new CDSPathImpl(node);
      }
      else if (type == REQUIRED_) {
        return new CDSRequired_Impl(node);
      }
      else if (type == SERVICE_) {
        return new CDSService_Impl(node);
      }
      else if (type == SERVICE_ENTITY) {
        return new CDSServiceEntityImpl(node);
      }
      else if (type == SERVICE_TYPE) {
        return new CDSServiceTypeImpl(node);
      }
      else if (type == SQL_STATEMENT) {
        return new CDSSqlStatementImpl(node);
      }
      else if (type == STRING_CONCAT) {
        return new CDSStringConcatImpl(node);
      }
      else if (type == TYPE_) {
        return new CDSType_Impl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new CDSTypeDeclarationImpl(node);
      }
      else if (type == VALUE_) {
        return new CDSValue_Impl(node);
      }
      else if (type == VARIABLE) {
        return new CDSVariableImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
