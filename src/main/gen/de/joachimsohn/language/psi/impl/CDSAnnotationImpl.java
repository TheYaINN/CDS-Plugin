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

public class CDSAnnotationImpl extends ASTWrapperPsiElement implements CDSAnnotation {

  public CDSAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CDSAnnotationAssert> getAnnotationAssertList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSAnnotationAssert.class);
  }

  @Override
  @Nullable
  public CDSAnnotationRequires getAnnotationRequires() {
    return findChildByClass(CDSAnnotationRequires.class);
  }

  @Override
  @Nullable
  public CDSAnnotationRestrict getAnnotationRestrict() {
    return findChildByClass(CDSAnnotationRestrict.class);
  }

}
