// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import de.joachimsohn.cds.psi.CDSDatatypes;
import de.joachimsohn.cds.psi.CDSIdentifier;
import de.joachimsohn.cds.psi.CDSVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CDSDatatypesImpl extends ASTWrapperPsiElement implements CDSDatatypes {

  public CDSDatatypesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitDatatypes(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSIdentifier getIdentifier() {
    return findChildByClass(CDSIdentifier.class);
  }

}
