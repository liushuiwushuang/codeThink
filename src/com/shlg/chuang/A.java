package com.shlg.chuang;

public interface A {

    default void doSth() {
        System.out.println("inside A");
    }
    
}
