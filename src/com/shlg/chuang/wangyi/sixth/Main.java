package com.shlg.chuang.wangyi.sixth;

import java.util.Scanner;

public class Main {
    
    private static int rev(int i) {
        if (i % 10 == 0) {
            i = i / 10;
        }
        String iString = String.valueOf(i);
        StringBuilder sb = new StringBuilder(iString);
        sb.reverse();
        return Integer.valueOf(sb.toString());
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int res = 0;

        int _inputN = 0;
        try {
            _inputN = in.nextInt();
        } catch (Exception e) {
            in.close();
        } 

        res = rev(_inputN);
        System.out.println(res);

    }

}
