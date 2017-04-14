package com.shlg.chuang.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {

    public static byte[] read(File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] data = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(data);
            return data;
        } finally {
            bufferedInputStream.close();
        }
    }
    
    public static byte[] read(String fileString) throws IOException {
        return read(new File(fileString).getAbsoluteFile());
    }
}
