package com.shlg.chuang.structed;

public class VoidMerge {
    
    private static void sortMerge(int[] a, int mid) {
        int tmp;
        for (int i = 0; i < mid - 1; i++) {
            if (a[mid] < a[i]) {
                tmp = a[i];
                a[i] = a[mid];
                a[mid] = tmp;
                findRightPlaceForMid(a, mid);
            }
        }
    }

    private static void findRightPlaceForMid(int[] a, int mid) {
        int len = a.length;
        int tmp;
        for (int i = mid; i < len - 1; i++) {
            if (a[i + 1] < a[i]) {
                tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
            }
        }
    }



    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 7, 9, 2, 4, 8, 10, 13, 14 };
        sortMerge(a, 5);
        for (int i = 0 ; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
