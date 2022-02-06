// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import de.joachimsohn.cds.psi.CDSNamespace;
import de.joachimsohn.cds.psi.CDSVisitor;
import org.jetbrains.annotations.NotNull;

public class CDSNamespaceImpl extends ASTWrapperPsiElement implements CDSNamespace {

  public CDSNamespaceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitNamespace(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor) visitor);
    else super.accept(visitor);
  }

}
