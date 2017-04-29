package com.shlg.chuang.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Date;

public class BasicFileOutput {
    
    static String fileJave = "src/com/shlg/chuang/io/BasicFileOutput.java";

    static String fileOut = "src/com/shlg/chuang/io/BasicFileOutput.out";
    
    public static void main(String[] args) throws IOException {
        Date startDate = new Date();
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(fileJave)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileOut)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        Date endDate = new Date();
        System.out.println("==========================");
        System.out.println(endDate.getTime() - startDate.getTime());
        System.out.println(BufferedInputFile.read(fileOut));
    }
}
