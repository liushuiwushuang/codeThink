package com.shlg.chuang.sort;

public class MergeSort {

    /*
     * merge L, R 俩个数组
     */
    public static void merge(int array[], int left, int mid, int right) {
        int i, j, k, leftLength, rightLength;
        leftLength = mid - left + 1;
        rightLength = right - mid;
        int[] L = new int[leftLength];
        int[] R = new int[rightLength];
        for (i = 0, k = left; i < leftLength; i++, k++)
            L[i] = array[k];
        for (i = 0, k = mid + 1; i < rightLength; i++, k++)
            R[i] = array[k];
        for (k = left, i = 0, j = 0; i < leftLength && j < rightLength; k++) {
            // 左右Array 谁小就放入 array 中
            if (L[i] < R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
        // 当L, R还有剩余长度，将剩余长度拼接到 array 后面
        if (i < leftLength) {
            for (j = i; j < leftLength; j++, k++) {
                array[k] = L[j];
            }
        }
        if (j < rightLength) {
            for (i = j; i < rightLength; i++, k++) {
                array[k] = R[i];
            }
        }
    }
    
    public static void mergeSorts(int array[], int left, int right) {
        if (left < right) {  // left >= right 为递归出口
            int mid = (left + right) / 2;
            mergeSorts(array, left, mid);
            mergeSorts(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    
    public static void main(String[] args) {
//        int[] a= { 38, 65, 97, 76, 13, 27, 49 };
        int[] a= { 5, 4, 9, 8, 7, 6, 0, 1, 3, 2 };
        mergeSorts(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
