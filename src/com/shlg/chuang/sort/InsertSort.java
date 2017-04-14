package com.shlg.chuang.sort;

public class InsertSort {
    
    public static void insertSorts(int[] a) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i];
                int j = i;
                if (a[j - 1] >  temp) {
                    while (j >= 1 && a[j - 1] > temp) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }
    
    /*
     * 我写的插入排序
     */
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp; 
        }
    }

    public static void main(String[] args) {
        int[] a = { 38, 65, 97, 13, 27, 49 };
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

}
