package de.joachimsohn.language;


import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import de.joachimsohn.language.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;

public class CDSCompletionContributor extends CompletionContributor {

    public CDSCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(CDSTypes.KW_ENTITY),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Test"));
                    }
                }
        );
    }

}
