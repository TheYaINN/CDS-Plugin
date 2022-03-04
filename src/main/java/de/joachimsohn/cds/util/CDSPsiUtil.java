package de.joachimsohn.cds.util;

import com.intellij.lang.ASTNode;
import de.joachimsohn.cds.psi.CDSEntity;
import de.joachimsohn.cds.psi.CDSTypes;

public class CDSPsiUtil {

    public static String getEntityField(CDSEntity element) {
        ASTNode keyNode = element.getNode().findChildByType(CDSTypes.ENTITY_FIELD);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }
}
