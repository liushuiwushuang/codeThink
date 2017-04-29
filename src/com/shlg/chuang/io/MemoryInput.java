package com.shlg.chuang.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

    public static void main(String[] args) {
        StringReader in = null;
        try {
            in = new StringReader(BufferedInputFile.read("src/com/shlg/chuang/io/MemoryInput.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int c;
        try {
            while ((c = in.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
