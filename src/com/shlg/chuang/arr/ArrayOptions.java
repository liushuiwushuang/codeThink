package com.shlg.chuang.arr;

import java.util.Arrays;

public class ArrayOptions {

    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] b = new BerylliumSphere[5];
        System.out.println("b: " + Arrays.toString(b));
        
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++)
            if (c[i] == null) // Can test for null reference
                c[i] = new BerylliumSphere();
        // Aggregate initialization
        BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(),
                new BerylliumSphere() };
        // Dynamic aggregate initialization
        a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
        
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        System.out.println(d.length);
        a = d;
        System.out.println(a.length);
        System.out.println("----------------------");
        int[] e ;
        int[] f = new int[5]; // 数组的初始化都为 0
        // compile error: The local variable e may not have been initialized
//        System.out.println(e);
        System.out.println(Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++)
            g[i] = i * i;
        int[] h = { 11, 47, 93 };
        System.out.println(f.length);
        System.out.println(g.length);
        System.out.println(h.length);
        e = h;
        System.out.println(e.length);
        e = new int[] { 1, 2 };
        System.out.println(e.length);
        
        char[] ch = new char[3];
        for (int i = 0;  i < ch.length; i++)
            System.out.print(String.valueOf('\0'==ch[i]) + ",");
        System.out.println(Arrays.toString(ch));
        
    }

}
