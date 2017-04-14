package com.shlg.chuang.structed;

public class MinDist {
    
    private static int minDistance(int[] a, int n1, int n2) {
        Integer n1_index = null, n2_index = null;
        int minDist = a.length;
        for (int i = 0; i < a.length; i++) {
            if (n1 == a[i])
                n1_index = i;
            if (n2 == a[i])
                n2_index = i;
            if (n1_index != null && n2_index != null)
                if (minDist > Math.abs(n1_index - n2_index))
                    minDist = Math.abs(n1_index - n2_index);
        }
        if (n1_index != null && n2_index != null) {
            return minDist;
        } else {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 6, 4, 7, 4, 6, 4, 7, 8, 5, 6, 4, 3, 10, 8 };
        System.out.println(minDistance(a, 4, 8));
    }

}
