package de.joachimsohn.cds.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import de.joachimsohn.cds.CDSLexerAdapter;
import de.joachimsohn.cds.psi.CDSTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CDSSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey ANNOTATION = createTextAttributesKey("CDSAnnotation", DefaultLanguageHighlighterColors.METADATA);
    private static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("CDSBlockComment", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey KEY = createTextAttributesKey("CDSKey", DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey STRING = createTextAttributesKey("CDSString", DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey NUMBER = createTextAttributesKey("CDSNumber", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("CDSLineComment", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT, BLOCK_COMMENT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] ANNOTATION_KEYS = new TextAttributesKey[]{ANNOTATION};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};


    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CDSLexerAdapter();
    }


    @Override
    public @NotNull TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CDSTypes.KW_NAMESPACE) || tokenType.equals(CDSTypes.KW_USING)
                || tokenType.equals(CDSTypes.KW_TYPE) || tokenType.equals(CDSTypes.KW_ENTITY)
                || tokenType.equals(CDSTypes.KW_ACTION) || tokenType.equals(CDSTypes.KW_ACTIONS)
                || tokenType.equals(CDSTypes.KW_ASPECT) || tokenType.equals(CDSTypes.B_TRUE)
                || tokenType.equals(CDSTypes.B_FALSE)
                || tokenType.equals(CDSTypes.KW_KEY) || tokenType.equals(CDSTypes.KW_FUNCTION)
                || tokenType.equals(CDSTypes.KW_SERVICE) || tokenType.equals(CDSTypes.KW_FROM)) {
            return KEY_KEYS;
        } else if (tokenType.equals(CDSTypes.NUMBERLIT) || tokenType.equals(CDSTypes.KW_USER) || tokenType.equals(CDSTypes.KW_NOW) || tokenType.equals(CDSTypes.KW_SELF)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(CDSTypes.STRINGLIT)) {
            return STRING_KEYS;
        } else if (tokenType.equals(CDSTypes.T_AT) || tokenType.equals(CDSTypes.ANNOT_RESTRICT)
                || tokenType.equals(CDSTypes.ANNOT_GRANT) || tokenType.equals(CDSTypes.ANNOT_TO)
                || tokenType.equals(CDSTypes.ANNOT_ASSERT) || tokenType.equals(CDSTypes.ANNOT_UNIQUE)
                || tokenType.equals(CDSTypes.ANNOT_CDS_ON) || tokenType.equals(CDSTypes.ANNOT_READ_ONLY)
                || tokenType.equals(CDSTypes.ANNOT_MANDATORY) || tokenType.equals(CDSTypes.ANNOT_CORE)
                || tokenType.equals(CDSTypes.ANNOT_IMMUTABLE) || tokenType.equals(CDSTypes.ANNOT_ISMEDIATYPE)
                || tokenType.equals(CDSTypes.ANNOT_ISURL) || tokenType.equals(CDSTypes.ANNOT_MEDIATYPE)
                || tokenType.equals(CDSTypes.ANNOT_FIORI_DRAFT_ENABLED) || tokenType.equals(CDSTypes.ANNOT_ODATA_DRAFT_ENABLED)
                || tokenType.equals(CDSTypes.ANNOT_REQUIRES)
        ) {
            return ANNOTATION_KEYS;
        } else if (tokenType.equals(CDSTypes.LINE_COMMENT) || tokenType.equals(CDSTypes.BLOCK_COMMENT)) {
            return COMMENT_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

    public static class CDSSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

        @Override
        public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
            return new CDSSyntaxHighlighter();
        }
    }
}
