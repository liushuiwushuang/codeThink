package com.shlg.chuang.structed;

public class Chapter8_4_3 {
    
    public static int countOneByUtil(int n) {
        char[] ch = Integer.toBinaryString(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                sum++;
            }
        }
        return sum;
    }
    
    /*
     * O(n) n 为数 N 的位数
     */
    public static int countOneTraverse(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n >>= 1;
        }
        return count;
    }
    
    /*
     * O(m) m 为数 N 中 1 的个数
     */
    public static int countOneByShift(int n) {
        int count = 0;
        while (n > 0) {
            if ( n != 0)
                n = n & (n - 1);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOneByShift(9));
    }
}
