package com.shlg.chuang.annotation;

import org.junit.Assert;
import org.junit.Test;

public class AtUnitExample1 {

    public String methodOne() {
        return "This is methodOne";
    }
    
    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }
    
    @Test
    public void methodOneTest() {
        Assert.assertTrue(methodOne().equals("This is methodOne"));
    }
    
    @Test
    public void m2() {
        return;
    }
    
    @Test
    public void m3() {
        return;
    }
    
    @Test
    public void failureTest() {
        return;
    }
    
    @Test
    public void anotherDisappointment() {
        return;
    }
    
    public static void main(String[] args) throws Exception {
        
    }
}
