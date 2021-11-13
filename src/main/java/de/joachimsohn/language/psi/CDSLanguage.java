package de.joachimsohn.language.psi;

import com.intellij.lang.Language;

public class CDSLanguage extends Language {

    public static final CDSLanguage INSTANCE = new CDSLanguage();

    private CDSLanguage() {
        super("Cds");
    }

}