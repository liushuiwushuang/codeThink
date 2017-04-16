package com.shlg.chuang.str;

import java.util.Scanner;

public class ScannerDelimiter {

    public static void main(String[] args) {
        Scanner in = new Scanner("12, 42, 78, 99, 42");
        in.useDelimiter("\\s*,\\s*"); // 零个或多个空格符 逗号  零个或多个空格符
        while (in.hasNext())
            System.out.println(in.nextInt());
        in.close();
    }

}
