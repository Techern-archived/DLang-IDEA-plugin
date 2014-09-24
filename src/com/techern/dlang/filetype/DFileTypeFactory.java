package com.techern.dlang.filetype;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

/**
 * DFileTypeFactory - A {@link com.intellij.openapi.fileTypes.FileTypeFactory} for the D programming language
 *
 * @since 0.0.1
 */
public class DFileTypeFactory extends FileTypeFactory {

    /**
     * Creates the file types
     *
     * @param fileTypeConsumer The {@link com.intellij.openapi.fileTypes.FileTypeConsumer}
     * @since 0.0.1
     */
    @Override
    public void createFileTypes(FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(DFileType.INSTANCE, "d");
    }
}
