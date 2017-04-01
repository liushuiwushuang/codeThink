package com.shlg.chuang.mutishap_4_2_7;

public class StaticBlock {
    
    private static final int a;
    
    static  {
        a = 4;
        System.out.println(a);
        System.out.println("static block is called");
    }

    public static void main(String[] args) {
    }

}
