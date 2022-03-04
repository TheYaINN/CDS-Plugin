package de.joachimsohn.cds.intentions;

import com.intellij.codeInsight.intention.impl.BaseIntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

public class CDSCreatePropertyQuickFix extends BaseIntentionAction {

    private final String key;

    CDSCreatePropertyQuickFix(String key) {
        this.key = key;
    }

    @NotNull
    @Override
    public String getText() {
        return "Create property '" + key + "'";
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return "Create property";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull final Project project, final Editor editor, PsiFile file) throws IncorrectOperationException {
       /* ApplicationManager.getApplication().invokeLater(() -> {
            Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(CDSFileType.INSTANCE, GlobalSearchScope.allScope(project));
            if (virtualFiles.size() == 1) {
                createProperty(project, virtualFiles.iterator().next());
            } else {
                final FileChooserDescriptor descriptor =
                        FileChooserDescriptorFactory.createSingleFileDescriptor(CDSFileType.INSTANCE);
                descriptor.setRoots(ProjectUtil.guessProjectDir(project));
                final VirtualFile file1 = FileChooser.chooseFile(descriptor, project, null);
                if (file1 != null) {
                    createProperty(project, file1);
                }
            }
        });*/
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
