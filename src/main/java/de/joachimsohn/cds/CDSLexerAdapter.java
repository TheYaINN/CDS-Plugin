package de.joachimsohn.cds;

import com.intellij.lexer.FlexAdapter;
import de.joachimsohn.cds.parser._CDSLexer;

public class CDSLexerAdapter extends FlexAdapter {

    public CDSLexerAdapter() {
        super(new _CDSLexer(null));
    }

}
