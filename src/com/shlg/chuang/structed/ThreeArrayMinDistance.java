package com.shlg.chuang.structed;

public class ThreeArrayMinDistance {
    
    private static int max(int a, int b, int c) {
        int max = a < b ? b : a;
        max = max < c ? c : max;
        return max;
    }
    
    /*
     * O(L * M * N)
     */
    private static int solvingViolence(int[] a, int[] b, int[] c) {
        int aLen = a.length;
        int bLen = b.length;
        int cLen = c.length;
        int minDist = max(Math.abs(a[0] - b[0]), 
                Math.abs(a[0] - c[0]), Math.abs(b[0] - c[0]));
        int dist = 0;
        for (int i = 0; i < aLen; i++)
            for (int j = 0; j < bLen; j++)
                for (int k = 0; k < cLen; k++) {
                    dist = max(Math.abs(a[i] - b[j]), 
                            Math.abs(a[i] - c[k]), Math.abs(b[j] - c[k]));
                    if (minDist > dist)
                        minDist = dist;
                }
        return minDist;
    }
    
    private static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        return min;
    }
    
    /*
     * O(L + M + N)
     */
    private static int minDistance(int[] a, int[] b, int[] c) {
        int aLen = a.length;
        int bLen = b.length;
        int cLen = c.length;
        int curDist = 0;
        int min = 0;
        int minDist = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = 0;
        while (true) {
            curDist = max(Math.abs(a[i] - b[j]), 
                    Math.abs(a[i] - c[k]), Math.abs(b[j] - c[k]));
            if (minDist > curDist)
                minDist = curDist;
            min = min(a[i], b[j], c[k]);
            if (min == a[i]) {
                if (++i >= aLen)
                    break;
            } else if (min == b[j]) {
                if (++j >= bLen)
                    break;
            } else {
                if (++k >= cLen)
                    break;
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 7 };
        int[] b = { 10, 12, 14, 16, 17 };
        int[] c = { 20, 21, 23, 24, 37, 30 };
        System.out.println(solvingViolence(a, b, c));
        
        System.out.println(minDistance(a, b, c));
    }

}
