package de.joachimsohn.cds.lang;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CDSElementType extends IElementType {

    public CDSElementType(@NotNull @NonNls String debugName) {
        super(debugName, CDSLanguage.INSTANCE);
    }

}