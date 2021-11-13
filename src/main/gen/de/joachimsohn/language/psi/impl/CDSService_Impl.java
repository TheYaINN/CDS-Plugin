// This is a generated file. Not intended for manual editing.
package de.joachimsohn.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.joachimsohn.language.psi.CDSTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.joachimsohn.language.psi.*;

public class CDSService_Impl extends ASTWrapperPsiElement implements CDSService_ {

  public CDSService_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitService_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSAnnotation getAnnotation() {
    return findChildByClass(CDSAnnotation.class);
  }

  @Override
  @NotNull
  public List<CDSFunction_> getFunction_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSFunction_.class);
  }

  @Override
  @NotNull
  public CDSLiteralExpr getLiteralExpr() {
    return findNotNullChildByClass(CDSLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<CDSServiceEntity> getServiceEntityList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSServiceEntity.class);
  }

  @Override
  @NotNull
  public List<CDSServiceType> getServiceTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSServiceType.class);
  }

}
