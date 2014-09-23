package com.techern.dlang;

import com.intellij.lang.Language;

/**
 * DLanguage - An extension of {@link com.intellij.lang.Language} defining the D Programming Language
 *
 * @since 0.0.1
 */
public class DLanguage extends Language {

    /**
     * The instance of {@link com.techern.dlang.DLanguage} to be used throughout this plugin
     *
     * @since 0.0.1
     */
    public static final DLanguage INSTANCE = new DLanguage();

    /**
     * Privately constructs a new instance of {@link com.techern.dlang.DLanguage}
     *
     * @since 0.0.1
     */
    private DLanguage() {
        super("D");
    }

}
