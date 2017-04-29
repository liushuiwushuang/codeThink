package com.shlg.chuang.annotation;

import org.junit.Test;

public class Testable {

    public void execute() {
        System.out.println("Excecuting..");
    }
    
    @Test
    public void testExecute() {
        execute();
    }
}
