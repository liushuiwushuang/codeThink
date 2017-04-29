package com.shlg.chuang.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEOF {

    private static String filename = "src/com/shlg/chuang/io/TestEOF.java";

    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
            while (in.available() != 0)
                System.out.print((char) in.readByte());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
