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

public class CDSJoin_Impl extends ASTWrapperPsiElement implements CDSJoin_ {

  public CDSJoin_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitJoin_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CDSExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSExpr.class);
  }

  @Override
  @NotNull
  public CDSIdentifier getIdentifier() {
    return findNotNullChildByClass(CDSIdentifier.class);
  }

  @Override
  @Nullable
  public CDSJoinCondition getJoinCondition() {
    return findChildByClass(CDSJoinCondition.class);
  }

  @Override
  @NotNull
  public List<CDSJoinExpr> getJoinExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSJoinExpr.class);
  }

  @Override
  @NotNull
  public CDSJoinType getJoinType() {
    return findNotNullChildByClass(CDSJoinType.class);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
