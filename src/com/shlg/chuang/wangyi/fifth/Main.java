package com.shlg.chuang.wangyi.fifth;

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
        int res;

        int _inputX = 0;
        int _inputY = 0;
        try {
            _inputX = in.nextInt();
            _inputY = in.nextInt();
        } catch (Exception e) {
            in.close();
        } 

        res = rev(rev(_inputX) + rev(_inputY));
        System.out.println(res);

    }

}
