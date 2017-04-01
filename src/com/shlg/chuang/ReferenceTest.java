package com.shlg.chuang;

public class ReferenceTest {
    
    private static Integer add(Integer i) {
        return i;
    }

    public static void main(String[] args) {
        Integer i = new Integer(128);
        i = add(i);
        System.out.println(i);
    }

}
