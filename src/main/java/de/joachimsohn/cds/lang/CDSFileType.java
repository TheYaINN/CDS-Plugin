package de.joachimsohn.cds.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static de.joachimsohn.cds.lang.Constants.EXTENSIONS;

public class CDSFileType extends LanguageFileType {

    public static final CDSFileType INSTANCE = new CDSFileType();

    private CDSFileType() {
        super(CDSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return Constants.FILE;
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cds language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return EXTENSIONS;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CDSIcons.FILE;
    }

}