// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import de.joachimsohn.cds.psi.CDSAnnotation;
import de.joachimsohn.cds.psi.CDSIdentifier;
import de.joachimsohn.cds.psi.CDSVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CDSAnnotationImpl extends ASTWrapperPsiElement implements CDSAnnotation {

  public CDSAnnotationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitAnnotation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CDSIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSIdentifier.class);
  }

}
