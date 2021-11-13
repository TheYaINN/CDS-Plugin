// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSServiceEntity extends PsiElement {

  @Nullable
  CDSActions_ getActions_();

  @Nullable
  CDSAnnotation getAnnotation();

  @Nullable
  CDSAs_ getAs_();

  @Nullable
  CDSExclude_ getExclude_();

  @NotNull
  List<CDSJoin_> getJoin_List();

  @NotNull
  CDSLiteralExpr getLiteralExpr();

  @Nullable
  CDSMirror getMirror();

}
