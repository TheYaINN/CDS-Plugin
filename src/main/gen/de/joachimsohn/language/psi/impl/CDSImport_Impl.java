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

public class CDSImport_Impl extends ASTWrapperPsiElement implements CDSImport_ {

  public CDSImport_Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CDSVisitor visitor) {
    visitor.visitImport_(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CDSVisitor) accept((CDSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CDSIdentifier getIdentifier() {
    return findChildByClass(CDSIdentifier.class);
  }

  @Override
  @Nullable
  public CDSImportAs getImportAs() {
    return findChildByClass(CDSImportAs.class);
  }

  @Override
  @Nullable
  public CDSImportValues getImportValues() {
    return findChildByClass(CDSImportValues.class);
  }

  @Override
  @NotNull
  public CDSPath getPath() {
    return findNotNullChildByClass(CDSPath.class);
  }

}
