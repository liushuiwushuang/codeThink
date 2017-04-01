package com.shlg.chuang.mutishap_4_2_7;

public class Recursion {
    
    private final int f(int i) {
        switch (i) {
            case 1: 
                return 1;
            case 0 :
                return 0;
            default:
                return f(i - 1) + f(i - 2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new Recursion().f(5));
    }

}
