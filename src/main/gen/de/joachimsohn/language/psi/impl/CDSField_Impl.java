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

public class CDSField_Impl extends ASTWrapperPsiElement implements CDSField_ {

  public CDSField_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitField_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSAssociation_ getAssociation_() {
    return findChildByClass(CDSAssociation_.class);
  }

  @Override
  @Nullable
  public CDSComposition_ getComposition_() {
    return findChildByClass(CDSComposition_.class);
  }

  @Override
  @Nullable
  public CDSDataType getDataType() {
    return findChildByClass(CDSDataType.class);
  }

  @Override
  @Nullable
  public CDSRequired_ getRequired_() {
    return findChildByClass(CDSRequired_.class);
  }

  @Override
  @NotNull
  public PsiElement getString() {
    return findNotNullChildByType(STRING);
  }

}
