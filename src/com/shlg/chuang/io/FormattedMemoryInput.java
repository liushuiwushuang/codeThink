package com.shlg.chuang.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
    
    private static String filename= "src/com/shlg/chuang/io/FormattedMemoryInput.java";

    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile.read(filename).getBytes()));
            while (true)
                System.out.print((char) in.readByte());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
