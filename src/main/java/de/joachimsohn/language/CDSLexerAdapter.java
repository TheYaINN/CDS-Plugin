package de.joachimsohn.language;

import com.intellij.lexer.FlexAdapter;
import de.joachimsohn.language.cds.CDSLexer;

public class CDSLexerAdapter extends FlexAdapter {

    public CDSLexerAdapter() {
        super(new CDSLexer(null));
    }

}
