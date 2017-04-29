package com.shlg.chuang.annotation;

import org.junit.Before;
import org.junit.Test;

public class AtUnitExample3 {
    
    private AtUnitExample3 example3 = null;

    private int n;
    
    public AtUnitExample3() {
        
    }
    
    public int getN() {
        return n;
    }
    
    private String methodOne() {
        return "This is methodOne";
    }
    
    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }
    
    @Before
    public void create() {
        example3 = new AtUnitExample3();
        n = 47;
    }
    
    @Test
    public void initialization() {
        assert n == 47;
    }
    
    public void methodOneTest() {
        assert methodOne().equals("This is methodOne");
    }
    
    @Test
    public void m2() {
        assert methodTwo() == 2;
    }
}
