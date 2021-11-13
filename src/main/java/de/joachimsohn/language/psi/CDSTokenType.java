package de.joachimsohn.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CDSTokenType extends IElementType {

    public CDSTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CDSLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CDSTokenType." + super.toString();
    }

}