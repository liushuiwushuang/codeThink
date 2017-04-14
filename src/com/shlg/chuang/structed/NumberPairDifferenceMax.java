package com.shlg.chuang.structed;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberPairDifferenceMax {
    
    private static int getMaxDiff(int[] a) {
        if (a.length < 2)
            throw new RuntimeException();
        int diffMax = a[0] - a[1];
        for (int i = 0; i < a.length - 1; i ++)
            for (int j = i + 1; j < a.length; j++)
                if (diffMax < a[i] - a[j])
                    diffMax = a[i] - a[j];
        return diffMax;
    }

    private static int getMax2(int[] a) {
        if (a == null)
            throw new NullPointerException();
        if (a.length < 2) 
            throw new RuntimeException();
        AtomicInteger max = new AtomicInteger(0);
        AtomicInteger min = new AtomicInteger(0);
        return getMaxDiff2(a, 0, a.length - 1, max, min);
    }
    
    /*
     * 二分法
     */
    private static int getMaxDiff2(int[] a, int begin, int end, AtomicInteger max, AtomicInteger min) {
        if (begin == end) {
            max.set(a[begin]);
            min.set(a[begin]);
            return Integer.MIN_VALUE;
        }
        int middle = begin + (end - begin) / 2;
        // 数组前半部分的最小值与最大值
        AtomicInteger leftMax = new AtomicInteger(0);
        AtomicInteger leftMin = new AtomicInteger(0);
        // 数组前半部分的最大差值(第一种情况)
        int leftMaxDiff = getMaxDiff2(a, begin, middle, leftMax, leftMin);
        
        // 数组后半部分的最小值与最大值
        AtomicInteger rightMax = new AtomicInteger(0);
        AtomicInteger rightMin = new AtomicInteger(0);
        // 数组后半部分的最大差值(第二种情况)
        int rightMaxDiff = getMaxDiff2(a, middle + 1, end, rightMax, rightMin);
        
        //对应第三种情况
        int mixMax = leftMax.get() - rightMin.get();
        // 求数组的最大值与最小值
        if (leftMax.get() > rightMax.get())
            max.set(leftMax.get());
        else
            max.set(rightMax.get());
        
        if (leftMin.get() < rightMin.get())
            min.set(leftMin.get());
        else
            min.set(rightMin.get());
        // 求最大的差值
        int allMax = (leftMaxDiff > rightMaxDiff) ? leftMaxDiff : rightMaxDiff;
        allMax = (allMax > mixMax) ? allMax : mixMax;
        return allMax;
    }
    
    private static int max(int n, int m) {
        return n > m ? n : m;
    }
    
    /*
     * 动态规划
     */
    private static int getMax3(int[] a) {
        if (a == null || a.length < 2)
            throw new RuntimeException();
        int[] diff = new int[a.length];
        int[] max = new int[a.length];
        diff[0] = Integer.MIN_VALUE;
        max[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            diff[i] = max(diff[i - 1], max[i - 1] - a[i]);
            max[i] = max(max[i - 1], a[i]);
        }
        return diff[a.length - 1];
    }
    
    /*
     * 优化的动态规划
     */
    public static int getMax4(int[] a) {
        if (a == null || a.length < 2)
            throw new RuntimeException();
        int diff = 0;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            diff = max(diff, max - a[i]);
            max = max(max, a[i]);
        }
        return diff;
    }
    
    public static void main(String[] args) {
        int[] a = { 1, 4, 17, 3, 2, 9 };
        System.out.println(getMaxDiff(a));
        
        System.out.println(getMax2(a));
        
        System.out.println(getMax3(a));
        
        System.out.println(getMax4(a));
    }

}
