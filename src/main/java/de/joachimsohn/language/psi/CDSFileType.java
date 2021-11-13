package de.joachimsohn.language.psi;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class CDSFileType extends LanguageFileType {

    public static final CDSFileType INSTANCE = new CDSFileType();

    private CDSFileType() {
        super(CDSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cds File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cds language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cds";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CDSIcons.FILE;
    }

}