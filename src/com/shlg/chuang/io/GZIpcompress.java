package com.shlg.chuang.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIpcompress {
    
    static final String javaFileName = PackageUtil.packageName + "GZIpcompress.java";

    public static void main(String[] args) throws IOException{
        String[] arguments = { javaFileName };
        BufferedReader in  = new BufferedReader(
                new FileReader(arguments[0]));
        BufferedOutputStream out = new BufferedOutputStream(
                new GZIPOutputStream(new FileOutputStream("test.gz")));
        System.out.println("Writing file");
        int c;
        while ((c = in.read()) != -1)
            out.write(c);
        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader(
                new InputStreamReader(
                        new GZIPInputStream(
                                new FileInputStream("test.gz"))));
        String s;
        while ((s = in2.readLine()) != null)
            System.out.println(s);
        in2.close();
    }

}
