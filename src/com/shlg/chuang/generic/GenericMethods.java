package com.shlg.chuang.generic;

public class GenericMethods {
    
    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
        gm.f("");
        gm.f("cc");
    }

}
