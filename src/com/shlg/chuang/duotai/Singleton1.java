package com.shlg.chuang.duotai;

public class Singleton1 {

    private static Singleton1 singleton = new  Singleton1();
    
    private Singleton1() {
        System.out.println("空空如也");
    }
    
    public Singleton1 getInstance() {
        return singleton;
    }
    
    public static void main(String[] args) {
        new Singleton1().getInstance();
    }
}
