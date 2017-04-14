package com.shlg.chuang.structed;

public class UpUpSearch {
    
    private static int search(int[] a, int k) {
        int i = 0;
        while(i < a.length) {
            int dist = Math.abs(a[i] - k);
            if (dist == 0) {
                return i;
            } else {
                i += dist;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = { 3, 4, 5 ,6, 5, 6, 7, 8, 9, 8 };
        int[] a2 = { 9, 8, 7, 6, 5, 4, 3, 4, 3, 2 };
        System.out.println(search(a1, 9));
        System.out.println(search(a2, 2));
    }

}
