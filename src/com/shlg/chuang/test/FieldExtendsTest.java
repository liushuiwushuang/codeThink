package com.shlg.chuang.test;

public class FieldExtendsTest extends fieldBasic{
    
    private int i;
    
    public String toString() {
        return "FiledExtend: " + i;
    }

    public static void main(String[] args) {
        FieldExtendsTest f = new FieldExtendsTest();
        System.out.println(f);
    }

}

class fieldBasic {
    
    protected int i = 1;
    
    public String toString() {
        return "basic: " + i;
    }
}
