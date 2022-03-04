package de.joachimsohn.cds.intentions;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import de.joachimsohn.cds.lang.CDSFile;
import de.joachimsohn.cds.lang.CDSFileType;
import de.joachimsohn.cds.psi.CDSImport;

public class CDSElementFactory {

    public static CDSImport createProperty(Project project, String name) {
        final CDSFile file = createFile(project, name);
        return (CDSImport) file.getFirstChild();
    }

    public static CDSFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (CDSFile) PsiFileFactory.getInstance(project).createFileFromText(name, CDSFileType.INSTANCE, text);
    }

    public static CDSImport createProperty(Project project, String name, String value) {
        final CDSFile file = createFile(project, name + " = " + value);
        return (CDSImport) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final CDSFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

}
