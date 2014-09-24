package com.techern.dlang.parsing;

import com.intellij.psi.tree.IElementType;
import com.techern.dlang.DLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * DElementType - An extension of {@link com.intellij.psi.tree.IElementType}
 *
 * @since 0.0.1
 */
public class DElementType extends IElementType {

    /**
     * Constructs a new {@link com.techern.dlang.parsing.DElementType
     *
     * @param debugName
     * @since 0.0.1
     */
    public DElementType(@NotNull @NonNls String debugName) {
        super(debugName, DLanguage.INSTANCE);
    }

}
