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

public class CDSSqlStatementImpl extends ASTWrapperPsiElement implements CDSSqlStatement {

  public CDSSqlStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitSqlStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CDSConcatKey getConcatKey() {
    return findNotNullChildByClass(CDSConcatKey.class);
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
  @NotNull
  public CDSLiteralExpr getLiteralExpr() {
    return findNotNullChildByClass(CDSLiteralExpr.class);
  }

}
