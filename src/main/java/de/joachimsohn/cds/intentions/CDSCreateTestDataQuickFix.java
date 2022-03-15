package de.joachimsohn.cds.intentions;

import com.intellij.codeInsight.intention.impl.BaseIntentionAction;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.IncorrectOperationException;
import de.joachimsohn.cds.lang.CDSFileType;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CDSCreateTestDataQuickFix extends BaseIntentionAction {

    private final String key;

    public CDSCreateTestDataQuickFix(String key) {
        this.key = key;
    }

    @NotNull
    @Override
    public String getText() {
        return "Generate test data for '" + key + "'";
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return "Generate test data";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull final Project project, final Editor editor, PsiFile file) throws IncorrectOperationException {
        ApplicationManager.getApplication().invokeLater(() -> {
            Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(CDSFileType.INSTANCE, GlobalSearchScope.allScope(project));
            if (virtualFiles.size() == 1) {
                generateTestDataFile(project, virtualFiles.iterator().next());
            } else {
                final FileChooserDescriptor descriptor =
                        FileChooserDescriptorFactory.createSingleFileDescriptor(CDSFileType.INSTANCE);
                descriptor.setRoots(ProjectUtil.guessProjectDir(project));
                final VirtualFile file1 = FileChooser.chooseFile(descriptor, project, null);
                if (file1 != null) {
                    generateTestDataFile(project, file1);
                }
            }
        });
    }

    private void generateTestDataFile(final Project project, final VirtualFile file) {
        WriteCommandAction.writeCommandAction(project).run(() -> {
            System.out.println("TESTING!!!!");
        });
    }

    /* private void createProperty(final Project project, final VirtualFile file) {
        WriteCommandAction.writeCommandAction(project).run(() -> {
            CDSFileType simpleFile = (CDSFileType) PsiManager.getInstance(project).findFile(file);
            ASTNode lastChildNode = simpleFile.getNode().getLastChildNode();
            // TODO: Add another check for CRLF
            if (lastChildNode != null*//* && !lastChildNode.getElementType().equals(SimpleTypes.CRLF)*//*) {
                simpleFile.getNode().addChild(CDSElementFactory.createCRLF(project).getNode());
            }
            // IMPORTANT: change spaces to escaped spaces or the new node will only have the first word for the key
            CDSImport property = CDSElementFactory.createProperty(project, key.replaceAll(" ", "\\\\ "), "");
            simpleFile.getNode().addChild(property.getNode());
            ((Navigatable) property.getLastChild().getNavigationElement()).navigate(true);
            FileEditorManager.getInstance(project).getSelectedTextEditor().getCaretModel().moveCaretRelatively(2, 0, false, false, false);
        });
    }*/
}
