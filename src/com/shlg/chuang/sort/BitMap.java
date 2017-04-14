package com.shlg.chuang.sort;

import java.util.Random;

public class BitMap {
    
    int ARRNUM = 100;
    
    int mmin = 10000000;
    
    int mmax = 99999999;
    
    int N = mmax - mmin + 1;
    
    int BITS_PER_WORD = 32;
    
    int WORD_OFFSET(int b) {
        return b / BITS_PER_WORD;
    }
    
    int BIT_OFFSET(int b) {
        return b % BITS_PER_WORD;
    }
    
    void setBit(int[] words, int n) {
        n -= mmin;
        words[WORD_OFFSET(n)] |= (1 << BIT_OFFSET(n));
    }
    
    void clearBit(int[] words, int n) {
        words[WORD_OFFSET(n)] &= ~ (1 << BIT_OFFSET(n));
    }
    
    /*
     * 精妙
     */
    boolean getBit(int[] words, int n) {
        int bit = words[WORD_OFFSET(n)] & (1 << BIT_OFFSET(n));
        return bit != 0;
    }
    
    public void sort() {
        int i;
        int j;
        int arr[] = new int[ARRNUM];
        System.out.println("数组大小：" + ARRNUM);
        // 用来存放位图， 每一位对应 mmin 到 mmax 范围内的一个数
        int[] words = new int[1 + N / BITS_PER_WORD];
        int count = 0;
        Random r = new Random();
        // 生成 100 个随机数存放到数组 arr 中 
        for (j = 0; j < ARRNUM; j++) {
            arr[j] = r.nextInt(N);
            arr[j] += mmin;
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        for (j = 0; j < ARRNUM; j++) {
            setBit(words, arr[j]);
        }
        System.out.println("排序后 a 为：");
        for (i = 0; i < N; i++) {
            if (getBit(words, i)) {
                System.out.print(i + mmin + " ");
                count ++ ;
            }
        }
        System.out.println();
        System.out.println("总个数为： " + count);
    }

    public static void main(String[] args) {
        new BitMap().sort();
    }

}
