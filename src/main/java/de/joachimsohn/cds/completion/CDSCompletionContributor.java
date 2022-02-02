package de.joachimsohn.cds.completion;


import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
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
                    }
                }
        );
    }
}
