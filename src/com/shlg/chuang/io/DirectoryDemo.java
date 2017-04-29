package com.shlg.chuang.io;

import java.io.File;

public class DirectoryDemo {

    public static void main(String[] args) {
        PPrint.pprint(Directory.walk("src/com/shlg/chuang/io").dirs);
        for (File file : Directory.local("src/com/shlg/chuang/io", "T.*"))
            System.out.println(file);
        System.out.println("--------------");
        for (File file : Directory.walk("src/com/shlg/chuang/io", "T.*\\.java"))
            System.out.println(file);
        System.out.println("================");
        for (File file : Directory.walk("src/com/shlg/chuang/io", ".*[Zz].*\\.class"))
            System.out.println(file);
    }
}
