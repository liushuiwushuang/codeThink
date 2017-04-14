package com.shlg.chuang.structed;

public class SerialsContinuous {
    
    private static boolean isContinuous(int[] a) {
        int n = a.length;
        int min = -1, max = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (min > a[i] || -1 == min)
                    min = a[i];
                if (max < a[i] || -1 == max)
                    max = a[i];
            }
        }
        if (max - min > n - 1)
            return false;
        else 
            return true;
    }

    public static void main(String[] args) {
        int[] array = { 8, 7, 5, 0, 6 };
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                System.out.print("{ ");
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i] + " }");
            }
            
        }
        if (isContinuous(array)) {
            System.out.print(" is continuous");
        }
        System.out.println();
    }

}
