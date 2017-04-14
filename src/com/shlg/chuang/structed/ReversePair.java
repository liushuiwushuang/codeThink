package com.shlg.chuang.structed;

public class ReversePair {
    
    private static int reverseCount = 0;
    
    private static void merge(int a[], int left, int mid, int right) {
        int i, j, k, n1, n2;
        n1 = mid - left + 1;
        n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0, k = left; i < n1; i++, k++)
            L[i] = a[k];
        for (i = 0, k = mid + 1; i < n2; i++, k++)
            R[i] = a[k];
        for (k = left, i = 0, j = 0; i < n1 && j < n2; k++) {
            if (L[i] < R[j]) {
                a[k] = L[i++];
            } else {
                // Left 比 Right数组当前元素大的个数
                reverseCount += mid - i + 1;
                a[k] = R[j++];
            }
        }
        if (i < n1) {
            for (j = i; j < n1; j++, k++)
                a[k] = L[j];
        }
        if (j < n2) {
            for (i = j; i < n2; i++, k++)
                a[k] = R[i];
        }
    }
    
    private static void merge_sort(int a[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(a, left, mid);
            merge_sort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 2, 6 };
        merge_sort(array, 0, array.length - 1);
        System.out.println(reverseCount);
    }

}
