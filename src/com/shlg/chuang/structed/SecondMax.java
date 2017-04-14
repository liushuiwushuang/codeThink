package com.shlg.chuang.structed;

public class SecondMax {
    
    private static int findSecondMax(int[] array) {
        if (array.length < 2) return 0;
        int max1 = 0;
        int max2 = 1;
        if (array[0] < array[1]) {
            max1 = 1;
            max2 = 0;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] >= array[max1]) {
                max2 = max1;
                max1 = i;
            } else if (array[i] > array[max2]) {
                max2 = i;
            }
        }
        return array[max2];
    }

    public static void main(String[] args) {

        int[] array = { 20, 20, 19, 19, 40, 4, 7, 1 };
        System.out.println(findSecondMax(array));
    }

}
