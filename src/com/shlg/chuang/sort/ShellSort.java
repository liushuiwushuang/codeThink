package com.shlg.chuang.sort;

public class ShellSort {

    public static void shellSorts(int[] array) {
        int length = array.length;
        int i, j;
        int h;
        int temp;
        for (h = length / 2; h > 0; h = h / 2) {
            for (i = h; i < length; i++) {
                temp = array[i];
                for (j = i - h; j >= 0; j -= h) {
                    if (temp < array[j]) {
                        array[j + h] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + h] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = { 38, 65, 97, 76, 9, 9, 9, 9, 13, 10, 10, 27, 49 };
        // int[] a= { 5, 4, 9, 8, 7, 6, 0, 1, 3, 2 };
        shellSorts(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
