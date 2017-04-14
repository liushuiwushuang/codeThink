package com.shlg.chuang.sort;

public class BubbleSort {
    
    public static void bubbleSorts(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a= { 38, 65, 97, 76, 13, 27, 49 };
        bubbleSorts(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
