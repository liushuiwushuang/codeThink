package com.shlg.chuang.sort;

public class SelectSort {
    
    public static void selectSorts(int[] a) {
        int i;
        int j;
        int temp = 0;
        int n = a.length;
        for (i = 0; i < n; i++) {
            temp = a[i];
            int flag = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    flag = j;
                }
            }
            if (flag != j) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int[] a = { 38, 65, 97, 13, 27, 49 };
        selectSorts(a);
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

}
