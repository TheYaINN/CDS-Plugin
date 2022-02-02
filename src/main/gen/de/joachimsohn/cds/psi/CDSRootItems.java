// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface CDSRootItems extends PsiElement {

  @NotNull
  CDSAnnotation getAnnotation();

  @NotNull
  List<CDSModel_> getModel_List();

  @NotNull
  List<CDSService_> getService_List();

}
