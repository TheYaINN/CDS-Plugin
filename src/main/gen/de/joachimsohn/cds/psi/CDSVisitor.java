// This is a generated file. Not intended for manual editing.
package de.joachimsohn.cds.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class CDSVisitor extends PsiElementVisitor {

  public void visitDatatypes(@NotNull CDSDatatypes o) {
    visitPsiElement(o);
  }

  public void visitNamespace(@NotNull CDSNamespace o) {
    visitPsiElement(o);
  }

  public void visitRootItems(@NotNull CDSRootItems o) {
    visitPsiElement(o);
  }

  public void visitAnnotation(@NotNull CDSAnnotation o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull CDSIdentifier o) {
    visitPsiElement(o);
  }

  public void visitImport_(@NotNull CDSImport_ o) {
    visitPsiElement(o);
  }

  public void visitModel_(@NotNull CDSModel_ o) {
    visitPsiElement(o);
  }

  public void visitService_(@NotNull CDSService_ o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
