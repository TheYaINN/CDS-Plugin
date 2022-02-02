// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import de.joachimsohn.cds.psi.CDSDatatypes;
import de.joachimsohn.cds.psi.CDSIdentifier;
import de.joachimsohn.cds.psi.CDSService_;
import de.joachimsohn.cds.psi.CDSVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CDSService_Impl extends ASTWrapperPsiElement implements CDSService_ {

  public CDSService_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitService_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CDSDatatypes> getDatatypesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSDatatypes.class);
  }

  @Override
  @NotNull
  public List<CDSIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSIdentifier.class);
  }

}
