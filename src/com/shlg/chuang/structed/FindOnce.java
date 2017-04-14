package com.shlg.chuang.structed;

public class FindOnce {
    
    private static int findOnce(int[] a, int appearTimes) {
        int n = a.length;
        int[] bitCount = new int[32];
        // 计算数组中所有数对应的二进制数各个位置上出现 1 的次数
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 32; j++)
                bitCount[j] += (a[i] >> j) & 1;
        // 若某位上的结果不能被整除，则肯定目标数字在这一位上
        int appearOne = 0;
        for (int i = 0; i < 32; i++)
            if (bitCount[i] % appearTimes != 0)
                appearOne += (1 << i);
        return appearOne;
    }

    private static int findOnceCopy(int[] a, int appearTimes) {
        int[] bitCount = new int[32];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < 32; j++)
                bitCount[j] += (a[i] >> j) & 1;
        int appearOnceNum = 0;
        for (int j = 0; j < 32; j++)
            appearOnceNum += bitCount[j] % appearTimes << j;
        return appearOnceNum;
    }
    
    public static void main(String[] args) {
        int[] array = { 1, 2, 1, 2, 4, 2, 4, 4, 1, 9 };
        int num = findOnce(array, 3);
        int num1 = findOnceCopy(array, 3);
        System.out.println(num + " " + num1);
    }

}
