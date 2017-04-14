package com.shlg.chuang.structed;

public class MaxSumOfChildArray8_5_3 {
    
    /*
     * 算法时间复杂度 O(n^3)
     */
    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        if (n <= 0) return Integer.MIN_VALUE;
        int thisSum = 0;
        int maxSum = arr[0];
        int i, j, k;
        for (i = 0; i < n; i++)
            for (j = i + 1; j < n; j++) {
                thisSum = 0;
                for (k = i; k < j; k++)
                    thisSum = thisSum + arr[k];
                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        return maxSum;
    }

    /*
     * 算法的时间复杂度为 O(n^2)
     */
    public static int maxSubArray2(int[] arr) {
        int size = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    
    /*
     * 动态规划求。 时间复杂度为 O(n) 空间复杂度 O(n)
     */
    public static int maxSubArray3(int[] arr) {
        int n = arr.length;
        int End[] = new int[n];
        int All[] = new int[n];
        End[n - 1] = arr[n - 1];
        All[n - 1] = arr[n - 1];
        End[0] = All[0] = arr[0];
        for (int i = 1; i < n; i++) {
            End[i] = max(End[i - 1] + arr[i], arr[i]);
            All[i] = max(End[i], All[i - 1]);
        }
        return All[n - 1];
    }
    
    public static int max(int m, int n) {
        return m > n ? m : n;
    }
    
    /*
     * 优化动态规划的空间复杂度
     */
    public static int maxSubArray4(int[] arr) {
        int n = arr.length;
        int nAll = arr[0]; // 有n个数字数组的最大子数组和
        int nEnd = arr[0]; // 有 n 个数字数组包含最后一个元素的子数组的最大和
        for (int i = 1; i < n; i++) {
            nEnd = max(nEnd + arr[i], arr[i]);
            nAll = max(nEnd, nAll);
        }
        return nAll;
    }
    
    private static int begin = 0;
    
    private static int end = 0;
    
    public static int maxSubArrayAndBeginEndValue(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int nSum = 0;
        int nStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nSum < 0) {
                nSum = arr[i];
                nStart = i;
            } else {
                nSum += arr[i];
            }
            if (nSum > maxSum) {
                maxSum = nSum;
                begin = nStart;
                end = i;
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) {

        int[] array = { 1, -2, 4, 8, -4, 7, -1, -5 };
        System.out.println(maxSubArrayAndBeginEndValue(array));
        System.out.println(begin + " " + end);
    }

}
