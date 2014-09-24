package com.techern.dlang.filetype;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.techern.dlang.DLanguage;
import com.techern.dlang.util.DLanguageIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * DFileType - An extension of {@link com.intellij.openapi.fileTypes.LanguageFileType} for D files
 *
 * @since 0.0.1
 */
public class DFileType extends LanguageFileType {

    /**
     * The instance of {@link DFileType}
     *
     * @since 0.0.1
     */
    public static final DFileType INSTANCE = new DFileType();

    /**
     * Privately constructs a new {@link DFileType}
     *
     * @since 0.0.1
     */
    private DFileType() {
        super(DLanguage.INSTANCE);
    }

    /**
     * Gets the name of this {@link DFileType}
     *
     * @return The name
     * @since 0.0.1
     */
    @NotNull
    @Override
    public String getName() {
        return "D file";
    }

    /**
     * Gets the description of this {@link DFileType}
     *
     * @return The description
     * @since 0.0.1
     */
    @NotNull
    @Override
    public String getDescription() {
        return "A file containing code written in the D programming language";
    }

    /**
     * Gets the default file extension
     *
     * @return The default file description
     * @since 0.0.1
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "d";
    }

    /**
     * Gets the default icon
     *
     * @return The default icon
     * @since 0.0.1
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return DLanguageIcons.CLASS_ICON; //TODO Find a way to identify class/interface/enum/code, then change icon
    }
}
