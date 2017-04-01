package com.shlg.chuang.wangyi.third;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    static int L = 0;
    
    private static int process(int N, int M) {
        int sumSquare = -1;
        
        // 求 N 的所有 约数（除去1 和本身）
        // 遍历 N 的约数
        // N + 加 N 的约数， 等于 M 则记录；> M 则退出； < M 则求 （N + N约数）的约数；
        int allSize = 0;
        do {
            List<Integer> approList = getApproSet(N);
            int sizeIndex = approList.size();
            if (N + approList.get(sizeIndex) < M) {
                
            }
        } while (allSize == 0);
        
        return sumSquare;
    }
    
    private static List<Integer> getApproSet(int N) {
        List<Integer> approximateSet = new ArrayList<Integer>();
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 2; i <= sqrtN; i++) {
            if (N % i == 0) {
                approximateSet.add(i);
            }
        }
        return approximateSet;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _inputN = 0;
        int _inputM = 0;
        try {
            _inputN = in.nextInt();
            _inputM = in.nextInt();
        } catch (Exception e) {
            res = -1;
            in.close();
        }

        res = process(_inputN, _inputM);
        System.out.println(res);

    }

}
