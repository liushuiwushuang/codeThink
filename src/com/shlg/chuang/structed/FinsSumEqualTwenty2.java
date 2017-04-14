package com.shlg.chuang.structed;

public class FinsSumEqualTwenty2 {
    
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
        quickSort(a, 0, a.length - 1);
        int begin = 0;
        int end = a.length - 1;
        while (begin < end) {
            if (a[begin] + a[end] < sum)
                begin++;
            else if (a[begin] + a[end] > sum)
                end--;
            else {
                System.out.println(a[begin] + "," + a[end]);
                begin++;
                end--;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] array = { 1, 7, 17, 2, 6, 3, 14, 10 };
        findSum(array, 20);
        
        // quickSort test
//        quickSort(array, 0, array.length - 1);
//        for (int i = 0; i < array.length; i++)
//            System.out.print(array[i] + " ");
//        System.out.println();
    }

}
