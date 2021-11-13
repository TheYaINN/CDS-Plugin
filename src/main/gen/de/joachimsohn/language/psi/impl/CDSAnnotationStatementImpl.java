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

public class CDSAnnotationStatementImpl extends ASTWrapperPsiElement implements CDSAnnotationStatement {

  public CDSAnnotationStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitAnnotationStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CDSAnnotationGrant getAnnotationGrant() {
    return findNotNullChildByClass(CDSAnnotationGrant.class);
  }

  @Override
  @Nullable
  public CDSAnnotationTo getAnnotationTo() {
    return findChildByClass(CDSAnnotationTo.class);
  }

  @Override
  @Nullable
  public CDSAnnotationWhere getAnnotationWhere() {
    return findChildByClass(CDSAnnotationWhere.class);
  }

}
