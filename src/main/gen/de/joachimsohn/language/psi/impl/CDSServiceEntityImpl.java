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

public class CDSServiceEntityImpl extends ASTWrapperPsiElement implements CDSServiceEntity {

  public CDSServiceEntityImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitServiceEntity(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSActions_ getActions_() {
    return findChildByClass(CDSActions_.class);
  }

  @Override
  @Nullable
  public CDSAnnotation getAnnotation() {
    return findChildByClass(CDSAnnotation.class);
  }

  @Override
  @Nullable
  public CDSAs_ getAs_() {
    return findChildByClass(CDSAs_.class);
  }

  @Override
  @Nullable
  public CDSExclude_ getExclude_() {
    return findChildByClass(CDSExclude_.class);
  }

  @Override
  @NotNull
  public List<CDSJoin_> getJoin_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSJoin_.class);
  }

  @Override
  @NotNull
  public CDSLiteralExpr getLiteralExpr() {
    return findNotNullChildByClass(CDSLiteralExpr.class);
  }

  @Override
  @Nullable
  public CDSMirror getMirror() {
    return findChildByClass(CDSMirror.class);
  }

}
