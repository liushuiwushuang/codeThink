package com.shlg.chuang.rtti;

public class HiddenC {
    
    public static A makeA() {
        return new C();
    }
}

class C implements A {
    
    public void f() {
        System.out.println("c.f()");
    }
    
    public void g() {
        System.out.println("c.g()");
    }
    
    void u() {
        System.out.println("c.u()");
    }
    
    protected void v() {
        System.out.println("c.v()");
    }
    
    protected void w() {
        System.out.println("c.w()");
    }
    
}