package com.shlg.chuang.arr;

import java.util.Arrays;

import com.shlg.chuang.generic.Generator;

public class ArraySearching {

    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(50);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[10], gen));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int loaction = Arrays.binarySearch(a, r);
            if (loaction >= 0) {
                System.out.println(r + " 的位置为：" + loaction + 
                        "; 数值为： " + a[loaction]);
                break;
            }
        }
    }

}
