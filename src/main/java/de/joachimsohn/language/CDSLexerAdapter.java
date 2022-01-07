package de.joachimsohn.language;

import com.intellij.lexer.FlexAdapter;
import de.joachimsohn.language.cds._CDSLexer;

public class CDSLexerAdapter extends FlexAdapter {

    public CDSLexerAdapter() {
        super(new _CDSLexer(null));
    }

}
