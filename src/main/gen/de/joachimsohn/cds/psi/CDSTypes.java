// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import de.joachimsohn.cds.lang.CDSElementType;
import de.joachimsohn.cds.lang.CDSTokenType;
import de.joachimsohn.cds.psi.impl.*;

public interface CDSTypes {

  IElementType ANNOTATION = new CDSElementType("ANNOTATION");
  IElementType DATATYPES = new CDSElementType("DATATYPES");
  IElementType IDENTIFIER = new CDSElementType("IDENTIFIER");
  IElementType IMPORT_ = new CDSElementType("IMPORT_");
  IElementType MODEL_ = new CDSElementType("MODEL_");
  IElementType NAMESPACE = new CDSElementType("NAMESPACE");
  IElementType ROOT_ITEMS = new CDSElementType("ROOT_ITEMS");
  IElementType SERVICE_ = new CDSElementType("SERVICE_");

  IElementType BLOCK_COMMENT = new CDSTokenType("BLOCK_COMMENT");
  IElementType B_FALSE = new CDSTokenType("false");
  IElementType B_TRUE = new CDSTokenType("true");
  IElementType DELETE = new CDSTokenType("DELETE");
  IElementType ID = new CDSTokenType("id");
  IElementType KW_ACTION = new CDSTokenType("action");
  IElementType KW_ACTIONS = new CDSTokenType("actions");
  IElementType KW_AND = new CDSTokenType("and");
  IElementType KW_ARRAY = new CDSTokenType("array of");
  IElementType KW_AS = new CDSTokenType("as");
  IElementType KW_ASPECT = new CDSTokenType("aspect");
  IElementType KW_ASSERT = new CDSTokenType("assert");
  IElementType KW_ASSOCIATION_TO = new CDSTokenType("Association to");
  IElementType KW_CDS_ON = new CDSTokenType("cds.on");
  IElementType KW_COMPOSITION_OF = new CDSTokenType("Composition of");
  IElementType KW_DEFAULT = new CDSTokenType("default");
  IElementType KW_DEFINE = new CDSTokenType("define");
  IElementType KW_ENTITY = new CDSTokenType("entity");
  IElementType KW_ENUM = new CDSTokenType("enum");
  IElementType KW_EXCLUDING = new CDSTokenType("excluding");
  IElementType KW_EXISTS = new CDSTokenType("exists");
  IElementType KW_FORMAT = new CDSTokenType("format");
  IElementType KW_FROM = new CDSTokenType("from");
  IElementType KW_FUNCTION = new CDSTokenType("function");
  IElementType KW_GRANT = new CDSTokenType("grant");
  IElementType KW_INNER = new CDSTokenType("inner");
  IElementType KW_INSERT = new CDSTokenType("insert");
  IElementType KW_INTEGRITY = new CDSTokenType("integrity");
  IElementType KW_JOIN = new CDSTokenType("join");
  IElementType KW_KEY = new CDSTokenType("key");
  IElementType KW_LEFT = new CDSTokenType("left");
  IElementType KW_MANY = new CDSTokenType("many");
  IElementType KW_NAMESPACE = new CDSTokenType("namespace");
  IElementType KW_NOTNULL = new CDSTokenType("notNull");
  IElementType KW_NOT_NULL = new CDSTokenType("not null");
  IElementType KW_NOW = new CDSTokenType("now");
  IElementType KW_NULL = new CDSTokenType("null");
  IElementType KW_ON = new CDSTokenType("on");
  IElementType KW_OR = new CDSTokenType("or");
  IElementType KW_OUTER = new CDSTokenType("outer");
  IElementType KW_PROJECTION = new CDSTokenType("projection");
  IElementType KW_RANGE = new CDSTokenType("range");
  IElementType KW_READ_ONLY = new CDSTokenType("readonly");
  IElementType KW_REQUIRED = new CDSTokenType("KW_REQUIRED");
  IElementType KW_REQUIRES = new CDSTokenType("requires");
  IElementType KW_RESTRICT = new CDSTokenType("restrict");
  IElementType KW_RETURNS = new CDSTokenType("returns");
  IElementType KW_RIGHT = new CDSTokenType("right");
  IElementType KW_SELECT = new CDSTokenType("select");
  IElementType KW_SERVICE = new CDSTokenType("service");
  IElementType KW_TO = new CDSTokenType("to");
  IElementType KW_TYPE = new CDSTokenType("type");
  IElementType KW_TYPE_OF = new CDSTokenType("type of");
  IElementType KW_UNIQUE = new CDSTokenType("unique");
  IElementType KW_UPDATE = new CDSTokenType("KW_UPDATE");
  IElementType KW_USER = new CDSTokenType("user");
  IElementType KW_USING = new CDSTokenType("using");
  IElementType KW_WHERE = new CDSTokenType("where");
  IElementType LINE_COMMENT = new CDSTokenType("LINE_COMMENT");
  IElementType NUMBERLIT = new CDSTokenType("numberlit");
  IElementType READ = new CDSTokenType("READ");
  IElementType R_DATE = new CDSTokenType("R_DATE");
  IElementType STRINGLIT = new CDSTokenType("stringlit");
  IElementType T_ASSIGN = new CDSTokenType("=");
  IElementType T_AT = new CDSTokenType("@");
  IElementType T_BACKSLASH = new CDSTokenType("\\");
  IElementType T_COLON = new CDSTokenType(":");
  IElementType T_COMMA = new CDSTokenType(",");
  IElementType T_DOLLAR = new CDSTokenType("$");
  IElementType T_DOT = new CDSTokenType(".");
  IElementType T_HYPH = new CDSTokenType("'");
  IElementType T_LBRACE = new CDSTokenType("{");
  IElementType T_LBRACK = new CDSTokenType("[");
  IElementType T_LPAREN = new CDSTokenType("(");
  IElementType T_MINUS = new CDSTokenType("-");
  IElementType T_QOUTE = new CDSTokenType("\"");
  IElementType T_RBRACE = new CDSTokenType("}");
  IElementType T_RBRACK = new CDSTokenType("]");
  IElementType T_RECURSIVE_DESCENT = new CDSTokenType("..");
  IElementType T_RPAREN = new CDSTokenType(")");
  IElementType T_SEMI = new CDSTokenType(";");
  IElementType T_SLASH = new CDSTokenType("/");
  IElementType T_UNDER = new CDSTokenType("_");
  IElementType UPDATE = new CDSTokenType("update");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new CDSAnnotationImpl(node);
      } else if (type == DATATYPES) {
        return new CDSDatatypesImpl(node);
      } else if (type == IDENTIFIER) {
        return new CDSIdentifierImpl(node);
      } else if (type == IMPORT_) {
        return new CDSImport_Impl(node);
      } else if (type == MODEL_) {
        return new CDSModel_Impl(node);
      } else if (type == NAMESPACE) {
        return new CDSNamespaceImpl(node);
      } else if (type == ROOT_ITEMS) {
        return new CDSRootItemsImpl(node);
      } else if (type == SERVICE_) {
        return new CDSService_Impl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
