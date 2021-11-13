// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSAnnotation extends PsiElement {

  @NotNull
  List<CDSAnnotationAssert> getAnnotationAssertList();

  @Nullable
  CDSAnnotationRequires getAnnotationRequires();

  @Nullable
  CDSAnnotationRestrict getAnnotationRestrict();

}
