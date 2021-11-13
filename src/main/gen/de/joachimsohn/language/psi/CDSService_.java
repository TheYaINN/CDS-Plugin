// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CDSService_ extends PsiElement {

  @Nullable
  CDSAnnotation getAnnotation();

  @NotNull
  List<CDSFunction_> getFunction_List();

  @NotNull
  CDSLiteralExpr getLiteralExpr();

  @NotNull
  List<CDSServiceEntity> getServiceEntityList();

  @NotNull
  List<CDSServiceType> getServiceTypeList();

}
