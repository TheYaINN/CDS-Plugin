package de.joachimsohn.language;

import com.intellij.lexer.FlexAdapter;

public class CDSLexerAdapter extends FlexAdapter {

    public CDSLexerAdapter() {
        super(new CDSLexer(null));
    }

}
