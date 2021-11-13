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

public class CDSAnnotationWhereImpl extends ASTWrapperPsiElement implements CDSAnnotationWhere {

  public CDSAnnotationWhereImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitAnnotationWhere(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSConcatKey getConcatKey() {
    return findChildByClass(CDSConcatKey.class);
  }

  @Override
  @NotNull
  public CDSExpr getExpr() {
    return findNotNullChildByClass(CDSExpr.class);
  }

  @Override
  @Nullable
  public CDSSqlStatement getSqlStatement() {
    return findChildByClass(CDSSqlStatement.class);
  }

}
