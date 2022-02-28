package de.joachimsohn.cds.formatter;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import de.joachimsohn.cds.lang.CDSLanguage;
import de.joachimsohn.cds.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;

public class CDSFormattingBuilder implements FormattingModelBuilder {

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, CDSLanguage.INSTANCE)
                .around(CDSTypes.T_LBRACE).spaces(1)
                .before(CDSTypes.T_RBRACE).spaces(1)
                .around(CDSTypes.T_COLON).spaces(1)
                ;
    }

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        final CodeStyleSettings codeStyleSettings = formattingContext.getCodeStyleSettings();
        return FormattingModelProvider.createFormattingModelForPsiFile(formattingContext.getContainingFile(),
                new CDSBlock(formattingContext.getNode(), Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(codeStyleSettings)), codeStyleSettings);
    }
}
