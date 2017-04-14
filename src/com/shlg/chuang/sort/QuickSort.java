package com.shlg.chuang.sort;

public class QuickSort {
    
    public static void quickSorts(int[] array, int low, int high) {
        if (low >= high) {  // 递归出口
            return;
        }
        int i = low, j = high;
        int index = array[i];
        while (i < j) {
            while (i < j && array[j] >= index)
                j--;
            if (i < j)
                array[i++] = array[j];
            while (i < j && array[i] < index)
                i++;
            if (i < j)
                array[j--] = array[i];
        }
        array[i] = index;
        quickSorts(array, low, i - 1);
        quickSorts(array, i + 1, high);
    }
    
    public static void main(String[] args) {
        int[] a= { 38, 65, 97, 76, 9, 9, 9, 9,13, 10, 10,27, 49 };
//        int[] a= { 5, 4, 9, 8, 7, 6, 0, 1, 3, 2 };
        quickSorts(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
}
