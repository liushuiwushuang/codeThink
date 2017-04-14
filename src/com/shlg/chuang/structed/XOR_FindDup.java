package com.shlg.chuang.structed;

public class XOR_FindDup {
    
    private static int xor_findDup(int[] a) {
        int n = a.length;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < n - 1; i++) {
            temp1 += i + 1;
            temp2 += a[i];
        }
        temp2 += a[n - 1];
        int result = temp2 - temp1;
        return result;
    }
    
    private static int xor_findDup1(int[] a) {
        int n = a.length;
        int i;
        int result = 0;
        for (i = 0; i < n; i++)
            result ^= a[i];
        for (i = 1; i < n; i++)
            result ^= i;
        return result;
    }

    /*
     * 用一个布尔型数组来表示元素是否出现过(false 表示未出现，true表示出现过)
     * 也可以用位示图 1bit 来表示，因此需要申请数组的长度为 N / 32 取上整的空间
     */
    private static int findRepeatInteger(int[] a) {
        int n = a.length;
        boolean[] arrayFlag = new boolean[n];
        int i = 1;
        int result = Integer.MAX_VALUE;
        while (i < n) {
            arrayFlag[i] = false;
            i++;
        }
        for (i = 0; i < n; i++)
            if(!arrayFlag[a[i]])
                arrayFlag[a[i]] = true;
            else
                result = a[i];
        return result;
    }
    
    private static int xor_findDup3(int[] a) {
        int n = a.length;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            if (a[i] > 0)
                a[a[i]] = -a[a[i]];
            else 
                a[-a[i]] = -a[-a[i]];
        // 将数组还原
        for (int i = 1; i < n; i++)
            if (a[i] > 0)
                result = i;
            else
                a[i] = -a[i];
        return result;
    }
    
    private static int xor_findDup4(int[] a) {
        int x = 0, y = 0;
        do {
            x = a[a[x]];
            y = a[y];
        } while (x != y);
        x = 0;
        do {
            x = a[x];
            y = a[y];
        } while (x != y);
        return x;
    }
    
    public static void main(String[] args) {
        // System.out.println(~1);
        // System.out.println(1 << 31);
        int[] a = { 2, 1, 3, 4, 1 };
        int missingNum = xor_findDup(a);
        System.out.println(missingNum);
        
        int missingNum1 = xor_findDup1(a);
        System.out.println(missingNum1);
        
        int missingNum2 = findRepeatInteger(a);
        System.out.println(missingNum2);
        
        int missingNum3 = xor_findDup3(a);
        System.out.println(missingNum3);
        
        int missingNum4 = xor_findDup4(a);
        System.out.println(missingNum4);
    }

}
