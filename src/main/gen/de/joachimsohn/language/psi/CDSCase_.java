// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSCase_ extends PsiElement {

  @NotNull
  List<CDSIdentifier> getIdentifierList();

  @NotNull
  CDSRequired_ getRequired_();

  @NotNull
  CDSStringConcat getStringConcat();

  @NotNull
  PsiElement getString();

}
