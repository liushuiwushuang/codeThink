package com.shlg.chuang.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {

    private static final long serialVersionUID = 1L;
    
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals(""))
            remove(0);
    }
    
    public TextFile(String fileName) {
        this(fileName, "\n");
    }
    
    public static String read(String filename) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
    
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                for (String item : this)
                    out.println(item);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        String file = read("TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile("TextFile.java", "\\W+"));
        System.out.println(words.headSet("a"));
    }
}
