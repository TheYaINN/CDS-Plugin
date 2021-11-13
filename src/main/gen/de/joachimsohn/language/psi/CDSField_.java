// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSField_ extends PsiElement {

  @Nullable
  CDSAssociation_ getAssociation_();

  @Nullable
  CDSComposition_ getComposition_();

  @Nullable
  CDSDataType getDataType();

  @Nullable
  CDSRequired_ getRequired_();

  @NotNull
  PsiElement getString();

}
