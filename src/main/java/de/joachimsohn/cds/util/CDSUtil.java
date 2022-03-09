package de.joachimsohn.cds.util;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import de.joachimsohn.cds.lang.CDSFile;
import de.joachimsohn.cds.lang.CDSFileType;
import de.joachimsohn.cds.psi.CDSEntity;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CDSUtil {

    public static List<CDSEntity> findEntity(Project project, String key) {
        List<CDSEntity> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(CDSFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CDSFile simpleFile = (CDSFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                CDSEntity[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, CDSEntity.class);
                if (properties != null) {
                    for (CDSEntity property : properties) {
                        if (key.equals(property.getActions())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<CDSEntity> findEntity(Project project) {
        List<CDSEntity> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(CDSFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CDSFile simpleFile = (CDSFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                CDSEntity[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, CDSEntity.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    /**
     * Attempts to collect any comment elements above the Simple key/value pair.
     */
    public static @NotNull String findDocumentationComment(CDSEntity property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String commentText = element.getText().replaceFirst("[!# ]+", "");
                result.add(commentText);
            }
            element = element.getPrevSibling();
        }
        return StringUtil.join(Lists.reverse(result), "\n ");
    }
}
