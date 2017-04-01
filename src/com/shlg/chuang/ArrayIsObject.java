package com.shlg.chuang;

public class ArrayIsObject {

    public static void main(String[] args) {
        
        int[][] b = new int[2][3];
        System.out.println(b instanceof int[][]);
        int[] a = { 1, 2, 3};  // 或
        a = new int[]{ 1, 2, 3, 4};
        
        // 二维数组第一行俩列，第二行三列
        int[][] array = new int[2][];
        array[0] = new int[]{ 4, 7 };
        array[1] = new int[]{ 3, 8, 9 };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        
        char[] ca = "aaa".toCharArray();
        
    }

}
