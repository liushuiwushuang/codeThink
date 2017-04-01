package com.shlg.chuang.package_4_4_12;

public class InsertSort {
    
    //这里是方法，不是构造函数
    public static void insertSort(int[] a, IntCompare compare) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i], j = i;
                if (compare.cmp(a[j - 1], temp) == 1) {
                    while (j >= 1 && compare.cmp(a[j - 1], temp) == 1) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array1 = {7, 3, 19, 40, 4, 7, 1};
        insertSort(array1, new Compare1());
        System.out.println("升序排列：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = { 7, 3, 19, 40, 7, 1 };
        insertSort(array2, new Compare2());
        System.out.println("降序排列：");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

}

interface IntCompare {
    public int cmp(int a, int b);
}

class Compare1 implements IntCompare {

    @Override
    public int cmp(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
    
}

class Compare2 implements IntCompare {

    @Override
    public int cmp(int a, int b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
