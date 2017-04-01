package com.shlg.chuang;

public class StringBufferTest {
    
    public static void changeStringBuffer(StringBuffer b1, StringBuffer b2) {
        b1.append(" World");
        b2 = b1;
        String s;
        StringBuilder sb;
        
    }

    public static void main(String[] args) {

        Integer a = new Integer(1);
        Integer b = a;
        b++;
        System.out.println(a);
        System.out.println(b);
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        changeStringBuffer(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
    }

}
