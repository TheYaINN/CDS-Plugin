package de.joachimsohn.cds.formatter;

import com.intellij.formatting.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import de.joachimsohn.cds.lang.CDSLanguage;
import de.joachimsohn.cds.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;

public class CDSFormattingBuilder implements FormattingModelBuilder {

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, CDSLanguage.INSTANCE)
                .withinPair(CDSTypes.T_LBRACE, CDSTypes.T_RBRACE).spaceIf(settings.getCommonSettings(CDSLanguage.INSTANCE.getID()).SPACE_WITHIN_BRACES)
                .withinPair(CDSTypes.T_LBRACK, CDSTypes.T_RBRACK).spaceIf(settings.getCommonSettings(CDSLanguage.INSTANCE.getID()).SPACE_WITHIN_BRACKETS)
                .withinPair(CDSTypes.T_LPAREN, CDSTypes.T_RPAREN).spaceIf(settings.getCommonSettings(CDSLanguage.INSTANCE.getID()).SPACE_WITHIN_PARENTHESES)
                .after(CDSTypes.T_COLON).spaceIf(settings.getCommonSettings(CDSLanguage.INSTANCE.getID()).SPACE_AFTER_COLON)
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
