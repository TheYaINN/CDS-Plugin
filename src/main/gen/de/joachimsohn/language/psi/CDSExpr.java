// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSExpr extends PsiElement {

  @NotNull
  List<CDSIdentifier> getIdentifierList();

  @Nullable
  CDSValue_ getValue_();

  @Nullable
  CDSVariable getVariable();

}
