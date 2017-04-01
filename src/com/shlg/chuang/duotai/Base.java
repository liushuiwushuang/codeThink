package com.shlg.chuang.duotai;

public class Base {

    static {
        System.out.println("Base static code block");
    }
    
    {
        System.out.println("Base normal code block");
    }
    
//    private Base base = new Base("member param");
    
    public Base() {
        System.out.println("Base contructor");
    }
    
    public Base(String string) {
        System.out.println(string);
    }
}
