// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import de.joachimsohn.cds.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CDSRootItemsImpl extends ASTWrapperPsiElement implements CDSRootItems {

  public CDSRootItemsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitRootItems(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CDSAnnotation getAnnotation() {
    return findNotNullChildByClass(CDSAnnotation.class);
  }

  @Override
  @NotNull
  public List<CDSModel_> getModel_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSModel_.class);
  }

  @Override
  @NotNull
  public List<CDSService_> getService_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSService_.class);
  }

}
