package de.joachimsohn.cds.usage;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import de.joachimsohn.cds.CDSLexerAdapter;
import de.joachimsohn.cds.psi.CDSEntity;
import de.joachimsohn.cds.psi.CDSIdentifier;
import de.joachimsohn.cds.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CDSUsageProvider implements FindUsagesProvider {

    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new CDSLexerAdapter(),
                TokenSet.create(CDSTypes.IDENTIFIER, CDSTypes.ENTITY_FIELD),
                TokenSet.create(CDSTypes.BLOCK_COMMENT, CDSTypes.LINE_COMMENT),
                TokenSet.create(CDSTypes.STRINGLIT, CDSTypes.NUMBERLIT));
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        if (element instanceof CDSEntity) {
            return "simple property";
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof CDSIdentifier) {
            return element.getText();
        } else {
            return "";
        }
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof CDSIdentifier) {
            return element.getText();
        } else {
            return "";
        }
    }

}