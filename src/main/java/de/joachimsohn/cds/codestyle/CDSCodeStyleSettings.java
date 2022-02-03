package de.joachimsohn.cds.codestyle;


import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class CDSCodeStyleSettings extends CustomCodeStyleSettings {

    public CDSCodeStyleSettings(CodeStyleSettings settings) {
        super("CDSCodeStyleSettings", settings);
    }

}
