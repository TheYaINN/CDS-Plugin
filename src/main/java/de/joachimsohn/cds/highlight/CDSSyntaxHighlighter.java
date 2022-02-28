package de.joachimsohn.cds.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import de.joachimsohn.cds.CDSLexerAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static de.joachimsohn.cds.psi.CDSTypes.*;

public class CDSSyntaxHighlighter extends SyntaxHighlighterBase {

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CDSLexerAdapter();
    }

    private final TokenSet KEYWORDS = TokenSet.create(
            KW_NAMESPACE, KW_USING, KW_TYPE, KW_ENTITY,
            KW_ACTION, KW_ACTIONS, KW_ASPECT, B_TRUE,
            B_FALSE, KW_KEY, KW_FUNCTION, KW_SERVICE, KW_FROM
    );
    private final TokenSet ANNOTATION = TokenSet.create(
            ANNOT_RESTRICT, ANNOT_TO, ANNOT_GRANT, ANNOT_ASSERT, ANNOT_UNIQUE, ANNOT_CDS_ON, T_AT, ANNOT_READ_ONLY, ANNOT_MANDATORY, ANNOT_CORE,
            ANNOT_IMMUTABLE, ANNOT_ISMEDIATYPE, ANNOT_ISURL, ANNOT_MEDIATYPE, ANNOT_FIORI_DRAFT_ENABLED, ANNOT_ODATA_DRAFT_ENABLED, ANNOT_REQUIRES
    );
    private final TokenSet NUMBER_LITERALS = TokenSet.create(NUMBERLIT);
    private final TokenSet STRING_LITERALS = TokenSet.create(STRINGLIT);
    private final TokenSet REFERENCES = TokenSet.create(KW_USER, KW_NOW, KW_SELF);

    private static @NotNull TextAttributesKey[] keys(TextAttributesKey keys) {
        return new TextAttributesKey[]{keys};
    }

    @Override
    public @NotNull TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (KEYWORDS.contains(tokenType)) {
            return keys(DefaultLanguageHighlighterColors.KEYWORD);
        } else if (STRING_LITERALS.contains(tokenType)) {
            return keys(DefaultLanguageHighlighterColors.STRING);
        } else if (NUMBER_LITERALS.contains(tokenType)) {
            return keys(DefaultLanguageHighlighterColors.NUMBER);
        } else if (tokenType.equals(LINE_COMMENT)) {
            return keys(DefaultLanguageHighlighterColors.LINE_COMMENT);
        } else if (tokenType.equals(BLOCK_COMMENT)) {
            return keys(DefaultLanguageHighlighterColors.BLOCK_COMMENT);
        } else if (REFERENCES.contains(tokenType)) {
            return keys(DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
        } else if (ANNOTATION.contains(tokenType)) {
            return keys(DefaultLanguageHighlighterColors.METADATA);
        } else {
            return TextAttributesKey.EMPTY_ARRAY;
        }
    }

    public static class CDSSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

        @Override
        public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
            return new CDSSyntaxHighlighter();
        }

    }
}