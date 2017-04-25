package com.shlg.chuang.arr;

import java.util.Arrays;

public class ComparingArrays {

    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 47);
        Arrays.fill(a2, 47);
        System.out.println(Arrays.equals(a1, a2));
        a2[3] = 11;
        System.out.println(Arrays.equals(a1, a2));
        
        String[] s1 = new String[2];
        Arrays.fill(s1, "Hi");
        String[] s2 = { new String("Hi"), new String("Hi") };
        System.out.println(Arrays.equals(s1, s2));
        int[] i3 = { 1 };
        Integer[] i4 = new Integer[] { 1 }; 
        // 必须是同类型数组
//        System.out.println(Arrays.equals(i4, i3));
    }

}
