package com.shlg.chuang.rtti;

public class AnonymousImplementation {

    public static void main(String[] args) throws Exception {
        A a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a, "g");
    }

}
