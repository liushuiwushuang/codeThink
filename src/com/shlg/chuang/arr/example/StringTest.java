package com.shlg.chuang.arr.example;

import java.lang.reflect.Field;

public class StringTest {
    public static void main(String[] args) throws Exception {
        String a = "chenssy";
        String b = "chenssy";
        String c = new String("chenssy");
        System.out.println("--------------修改前值-------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //修改String的值
        Field a_ = String.class.getDeclaredField("value");
        a_.setAccessible(true);
        char[] value=(char[])a_.get(a);
        value[4]='_';   //修改a所指向的值
        
        System.out.println("--------------修改后值-------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("chenssy");
        System.out.println("c = " + c);
        
        String aa = "chen";  
        String cc = aa + new String("ssy");
        cc = "ch" + new String("LL");
//        TreeMap
    }
}
