package com.shlg.chuang.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
    
    static String fileJave = "src/com/shlg/chuang/io/FileOutputShortcut.java";

    static String fileOut = "src/com/shlg/chuang/io/FileOutputShortcut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(BufferedInputFile.read(fileJave)));
        PrintWriter out = new PrintWriter(fileOut);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        System.out.println(BufferedInputFile.read(fileOut));
    }
    
}
