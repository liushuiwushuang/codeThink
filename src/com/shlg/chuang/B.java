package com.shlg.chuang;

public interface B {

    default void doSth() {
        System.out.println("inside B");
    }
    
}
