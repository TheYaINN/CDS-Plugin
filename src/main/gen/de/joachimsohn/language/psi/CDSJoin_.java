// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSJoin_ extends PsiElement {

  @NotNull
  List<CDSExpr> getExprList();

  @NotNull
  CDSIdentifier getIdentifier();

  @Nullable
  CDSJoinCondition getJoinCondition();

  @NotNull
  List<CDSJoinExpr> getJoinExprList();

  @NotNull
  CDSJoinType getJoinType();

  @Nullable
  PsiElement getString();

}
