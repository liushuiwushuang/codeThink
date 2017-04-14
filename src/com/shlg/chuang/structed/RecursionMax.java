package com.shlg.chuang.structed;

public class RecursionMax {
    
    private static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    private static int maxnum(int[] a, int begin) {
        int length = a.length - begin;
        if (length == 1)
            return a[begin];
        else
            return max(a[begin], maxnum(a, begin + 1));
    }

    public static void main(String[] args) {
        int[] num = { 0, 16, 2, 3, 4, 5, 10, 7, 8, 9 };
        System.out.println(maxnum(num, 0));
        
        System.out.println(maxnumCopy(num, 0));
    }

    private static int maxnumCopy(int[] a, int i) {
        if (a.length - 1 == i)
            return a[i];
        else
            return max(a[i], maxnumCopy(a, i + 1)); 
    }

}
