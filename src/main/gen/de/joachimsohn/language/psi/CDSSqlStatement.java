// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSSqlStatement extends PsiElement {

  @NotNull
  CDSConcatKey getConcatKey();

  @NotNull
  List<CDSExpr> getExprList();

  @NotNull
  CDSIdentifier getIdentifier();

  @NotNull
  CDSLiteralExpr getLiteralExpr();

}
