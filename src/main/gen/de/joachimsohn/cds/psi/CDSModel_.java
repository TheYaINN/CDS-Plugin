// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface CDSModel_ extends PsiElement {

  @NotNull
  List<CDSDatatypes> getDatatypesList();

  @NotNull
  List<CDSAnnotation> getAnnotationList();

  @NotNull
  List<CDSIdentifier> getIdentifierList();

}
