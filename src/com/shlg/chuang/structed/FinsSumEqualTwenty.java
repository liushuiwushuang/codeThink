package com.shlg.chuang.structed;

public class FinsSumEqualTwenty {
    
    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) 
            return;
        int i = low;
        int j = high;
        int index = a[i];
        while (i < j) {
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] < index)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        a[i] = index;
        quickSort(a, low, i - 1);
        quickSort(a, i + 1, high);
    }
    
    private static void findSum(int[] a, int sum) {
        int len = a.length;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++) {
                if (a[i] + a[j] == sum) 
                    System.out.println(a[i] + "," + a[j]);
            }
    }

    public static void main(String[] args) {
        int[] array = { 1, 7, 17, 2, 6, 3, 14, 10 };
//        findSum(array, 20);
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
