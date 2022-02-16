package de.joachimsohn.cds.completion;


import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;


/**
 * Look at other implementation here:
 * See {@link JavaCompletionContributor}
 */
public class CDSCompletionContributor extends CompletionContributor {

    public CDSCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        PsiElement element = parameters.getPosition();
                        if (parameters.getPosition().getParent() instanceof PsiErrorElement) {
                            if (parameters.getEditor().getDocument().getText().contains("namespace")) {
                                resultSet.addElement(LookupElementBuilder.create("namespace"));
                            }
                            resultSet.addElement(LookupElementBuilder.create("type"));
                            resultSet.addElement(LookupElementBuilder.create("entity"));
                        }
                    }
                }
        );
    }
}
