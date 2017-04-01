package com.shlg.chuang.duotai;

public class Singleton2 {

    private static Singleton2 singleton = null;
    
    private Singleton2(){
        
    }
    
    public static synchronized Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
    
    public static void main(String[] args) {
        getInstance();
    }
}
