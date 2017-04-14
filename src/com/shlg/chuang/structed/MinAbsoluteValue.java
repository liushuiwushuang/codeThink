package com.shlg.chuang.structed;

public class MinAbsoluteValue {
    
    private static int absoluteTwo(int n, int m) {
        if (Math.abs(n) < Math.abs(m))
            return n;
        else
            return m;
    }
    
    private static int getMinAbsoluteValue(int[] a) {
        if (a == null || a.length == 0)
            throw new RuntimeException();
        if (a[0] > 0)
            return a[0];
        if (a[a.length - 1] < 0)
            return a[a.length - 1];
        int low = 0;
        int high = a.length - 1;
        int middle = (low + high) / 2;
        while (a[middle] * a[middle + 1] > 0) {
            if (a[middle] < 0)
                low = middle + 1;
            if (a[middle] > 0)
                high = middle - 1;
            middle = (low + high) / 2;
        }
        return absoluteTwo(a[middle], a[middle + 1]);
    }

    public static void main(String[] args) {
        int[] a1 = { -10, -5, -2, 7, 15, 50 };
        int[] a2 = { 2, 4, 6, 8, 27 };
        int[] a3 = { -13, -9, -7, -3 };
        System.out.println(getMinAbsoluteValue(a1));
        System.out.println(getMinAbsoluteValue(a2));
        System.out.println(getMinAbsoluteValue(a3));
    }

}
