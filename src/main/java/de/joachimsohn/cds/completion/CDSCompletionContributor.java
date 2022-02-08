package de.joachimsohn.cds.completion;


import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import de.joachimsohn.cds.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;

public class CDSCompletionContributor extends CompletionContributor {

    public CDSCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("type"));
                        resultSet.addElement(LookupElementBuilder.create("entity"));
                        if (parameters.getEditor().getDocument().getText().contains("namespace")) {
                            resultSet.addElement(LookupElementBuilder.create("namespace"));
                        }
                        if (isInContext(parameters, CDSTypes.ANNOTATION)) {
                            System.out.println("CONTEXT");
                        }
                    }
                }
        );
    }

    private boolean isInContext(@NotNull CompletionParameters parameters, @NotNull IElementType type) {
        PsiElement context = parameters.getPosition().getContext();
        if (context == null) {
            return false;
        } else {
            return context.getParent().equals(type);
        }
    }
}
