package com.shlg.chuang.annotation;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class AtUnitExample2 {

    private String methodOne() {
        return "This is methodOne";
    }
    
    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }
    
    @Test
    public void assertExample() {
        assert methodOne().equals("This is methodOne");
    }
    
    @Test
    public void assertFailureExample() {
        assert 1 == 2 : "What a surprise!";
    }
    
    @SuppressWarnings("resource")
    @Test
    public void exceptionExample() throws IOException {
        new FileInputStream("nofile.txt");
    }
    
    @Test
    public void assertAndReturn() {
        assert methodTwo() == 2 : "methodTwo must equal 2";
        return;
    }
}
