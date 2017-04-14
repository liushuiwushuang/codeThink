package com.shlg.chuang.structed;

public class FindNotDouble {
    
    private static int findNotDouble(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++)
            result ^= a[i];
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 3, 5, 4, 1 };
        int num = findNotDouble(array);
        System.out.println(num);
    }

}
