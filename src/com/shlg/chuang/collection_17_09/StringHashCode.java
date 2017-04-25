package com.shlg.chuang.collection_17_09;

public class StringHashCode {

    public static void main(String[] args) {
        String[] s = "AB AB".split(" ");
        String c = new String("AB");
        Integer i = 65;
        String a = "A";
        System.out.println(i.hashCode());
        System.out.println(a.hashCode());
        System.out.println(s[0].hashCode());
        System.out.println(s[1].hashCode());
        System.out.println(c.hashCode());
        System.out.println(s.hashCode());
    }

}
