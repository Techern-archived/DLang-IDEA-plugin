package com.techern.dlang.parsing;

import com.intellij.psi.tree.IElementType;
import com.techern.dlang.DLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * DTokenType - An extension of {@link com.intellij.psi.tree.IElementType}
 *
 * @since 0.0.1
 */
public class DTokenType extends IElementType {

    /**
     * Constructs a new {@link com.techern.dlang.parsing.DTokenType
     *
     * @param debugName
     * @since 0.0.1
     */
    public DTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DLanguage.INSTANCE);
    }

    /**
     * Returns a {@link java.lang.String} representing this {@link com.techern.dlang.parsing.DTokenType}
     *
     * @return A {@link java.lang.String}
     * @since 0.0.1
     */
    @Override
    public String toString() {
        return "DTokenType." + super.toString();
    }

}
