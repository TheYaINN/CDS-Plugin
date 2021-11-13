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

public class CDSActions_Impl extends ASTWrapperPsiElement implements CDSActions_ {

  public CDSActions_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitActions_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CDSAction_> getAction_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSAction_.class);
  }

  @Override
  @NotNull
  public List<CDSFunction_> getFunction_List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CDSFunction_.class);
  }

}
