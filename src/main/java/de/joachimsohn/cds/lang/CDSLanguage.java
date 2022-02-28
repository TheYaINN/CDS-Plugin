package de.joachimsohn.cds.lang;

import com.intellij.lang.Language;

public class CDSLanguage extends Language {

    public static final CDSLanguage INSTANCE = new CDSLanguage();

    private CDSLanguage() {
        super(Constants.LANG_NAME);
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }

}