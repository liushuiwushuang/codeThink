package com.shlg.chuang.str;

public class Concatenation {

    public static void main(String[] args) {
        String mango = "mango";
        String s = mango + "abc" + mango + "def" + 47;
        char[] dst = new char[10];
        s.getChars(0, 5, dst, 0);
        String ss = "1001";
        byte[] b = ss.getBytes();
        for (byte bb : b) {
            System.out.println(bb);
        }
        for (int i = 0; i < dst.length; i++) {
            System.out.println(dst[i]);
        }
        System.out.println(s);
        System.out.println("a".compareTo("b"));
        System.out.println("abc".contains("ac"));
        System.out.println("abc".regionMatches(1, "bc", 0, 2));
        String operator = "+-*/%^()";
        System.out.println(operator.indexOf('+'));
        System.out.println(operator.lastIndexOf(')'));
        System.out.println(operator.substring(3));
        System.out.println(operator.intern());
    }

}
