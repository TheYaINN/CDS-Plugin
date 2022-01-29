package de.joachimsohn.cds.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CDSFile extends PsiFileBase {

    public CDSFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CDSLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CDSFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return Constants.FILE;
    }

}
