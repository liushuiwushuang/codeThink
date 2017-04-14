package com.shlg.chuang.str;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        
        System.out.println("---------char----------");
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n", u);
        // d != java.lang.Character
        // IllegalFormatConversionException
//        f.format("d: %d\n", u); 
        f.format("c: %c\n", u);
        f.format("b: %b\n", u);
        // IllegalFormatConversionException: f != java.lang.Character
//        f.format("f: %f\n", u);
        // IllegalFormatConversionException: e != java.lang.Character
//        f.format("e: %e\n", u);
        // java.util.IllegalFormatConversionException: x != java.lang.Character
//        f.format("x: %x\n", u);
        f.format("h: %h\n", u);  // 16进制值
        
        System.out.println("---------int----------");
        int v = 121;
        System.out.println("v = 121");
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);
        // IllegalFormatConversionException: f != java.lang.Integer
//        f.format("f: %f\n", v);
        // IllegalFormatConversionException: e != java.lang.Integer
//        f.format("e: %e\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n", v);
        
        System.out.println("---------BigInteger----------");
        BigInteger w = new BigInteger("50000000000000");
        System.out.println("w = new BigInteger(\"50000000000000\")");
        f.format("d: %d\n", w);
        // IllegalFormatConversionException: c != java.math.BigInteger
//        f.format("c: %c\n", w);
        f.format("b: %b\n", w);
        f.format("s: %s\n", w);
//        f.format("f: %f\n", w);
//        f.format("e: %e\n", w);
        f.format("x: %x\n", w);
        f.format("h: %h\n", w);
        
        System.out.println("---------double---------");
        double x = 179.543;
        System.out.println("x = 179.543");
//        f.format("d: %d\n", x);
//        f.format("c: %c\n", x);
        f.format("b: %b\n", x);
        f.format("s: %s\n", x);
        f.format("f: %f\n", x);
        f.format("e: %e\n", x);
//        f.format("x: %x\n", x);
        f.format("h: %h\n", x);
        
        System.out.println("---------Conversion对象---------");
        Conversion y = new Conversion();
        System.out.println("y = new Conversion()");
//        f.format("d: %d\n", y);
//        f.format("c: %c\n", y);
        f.format("b: %b\n", y);
        f.format("s: %s\n", y);
//        f.format("f: %f\n", y);
//        f.format("e: %e\n", y);
//        f.format("x: %x\n", y);
        f.format("h: %h\n", y);
        
        System.out.println("---------boolean---------");
        boolean z = false;
        System.out.println("z = false");
//        f.format("d: %d\n", z);
//        f.format("c: %c\n", z);
        f.format("b: %b\n", z);
        f.format("s: %s\n", z);
//        f.format("f: %f\n", z);
//        f.format("e: %e\n", z);
//        f.format("x: %x\n", z);
        f.format("h: %h\n", z);
        
        f.close();
    }

}

