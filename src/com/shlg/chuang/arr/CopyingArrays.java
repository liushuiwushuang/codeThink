package com.shlg.chuang.arr;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 49);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        System.out.println(Arrays.toString(k));
        Arrays.fill(k, 103);
        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println(Arrays.toString(i));
        System.out.println("------------------");
        
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, 99);
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
        System.arraycopy(v, 0, u, u.length / 2, v.length);
        System.out.println(Arrays.toString(u));
        
        System.out.println("+++++++++++++++++");
        Arrays.fill(i, 41);// 7
        Arrays.fill(j, 49);// 10
        Arrays.fill(k, 51); // 5
        // 原数组与目标数组类型必须一致，不会执行自动包装 和自动拆包,
        // ArrayStoreException
//        System.arraycopy(u, 0, i, 0, i.length);
        
        // ArrayIndexOutOfBoundsException
        // 越了 j 队尾到复制点的长度
//        System.arraycopy(i, 0, j, 7, i.length);
        // 越了i 的长度
//        System.arraycopy(i, 0, j, 0, j.length);
        // 越了i 队尾打到复制点的长度
//        System.arraycopy(i, 3, j, 0, i.length);
    }

}
