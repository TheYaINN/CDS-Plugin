package de.joachimsohn.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import de.joachimsohn.language.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CDSHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("Block Comment", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    private static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("Line Comment", DefaultLanguageHighlighterColors.LINE_COMMENT);
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT, BLOCK_COMMENT};

    private static final TextAttributesKey KEY = createTextAttributesKey("Key", DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};

    private static final TextAttributesKey STRING = createTextAttributesKey("String", DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};

    private static final TextAttributesKey NUMBER = createTextAttributesKey("Number", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};

    private static final TextAttributesKey METHOD = createTextAttributesKey("Method", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    private static final TextAttributesKey[] METHOD_KEYS = new TextAttributesKey[]{METHOD};

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CDSLexerAdapter();
    }


    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CDSTypes.KW_NAMESPACE) || tokenType.equals(CDSTypes.KW_USING)
                || tokenType.equals(CDSTypes.KW_TYPE) || tokenType.equals(CDSTypes.KW_ENTITY)
                || tokenType.equals(CDSTypes.KW_ACTION) || tokenType.equals(CDSTypes.KW_ACTIONS)
                || tokenType.equals(CDSTypes.KW_KEY) || tokenType.equals(CDSTypes.KW_FUNCTION)
                || tokenType.equals(CDSTypes.KW_SERVICE) || tokenType.equals(CDSTypes.KW_FROM)) {
            return KEY_KEYS;
        } else if (tokenType.equals(CDSTypes.SINGLE_QUOTED_STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(CDSTypes.R_NUMERIC)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(CDSTypes.IDENTIFIER)) {
            return METHOD_KEYS;
        } else if (tokenType.equals(CDSTypes.BLOCK_COMMENT) || tokenType.equals(CDSTypes.LINE_COMMENT)) {
            return COMMENT_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}
