package com.shlg.chuang.structed;

public class Shift_K {
    
    private static void reverse(int[] a, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
    
    private static void shift_k(int[] a, int k) {
        int n = a.length;
        k = k % n; // 防止 K 比 N 大，右移 k 位跟又移 k % n位的结果是一样的
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        shift_k(array, 2);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
