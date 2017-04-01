package com.shlg.chuang.wangyi.second;

import java.util.Scanner;

public class Main {
    
    private static int process(int num) {
        int sumSquare = 0;
        if (num == 0) {
            return 0;
        }
        int sq = (int) Math.sqrt(num);
        for (int i = 0; i <= sq; i++) {
//            for (int j = i; j <= sq ; j++) {
//                if (i * i + j * j == num) {
//                    if (i * j != 0 && i != j) {
//                        sumSquare = sumSquare + 8;
//                    } else {
//                        sumSquare = sumSquare + 4;
//                    }
//                }
//            }
            double j = Math.sqrt(num - i * i);
            if (j < i) break;
            if ((int) j == j) {
                if (i * j != 0 && i != j) {
                    sumSquare = sumSquare + 8;
                } else {
                    sumSquare = sumSquare + 4;
                }
            }
        }
        return sumSquare;
    }
    
    public static void main(String[] args) {

//        double j = Math.sqrt(25);
//        System.out.println((int) j == j);
        Scanner in = new Scanner(System.in);
        int res;

        int _input;
        try {
            _input = in.nextInt();
        } catch (Exception e) {
            _input = 0;
            in.close();
        } 

        res = Main.process(_input);
        System.out.println(res);

    }

}
