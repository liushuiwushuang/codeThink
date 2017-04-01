package com.shlg.chuang.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static int process(List<Integer> numList) {
        int sumRevert = 0;
        int i = 0;
        int j = numList.size() - i - 1;
        int left = numList.get(i);
        int right = numList.get(j);
        try {
            while (i < j) {
                if (left < right) {
                    numList.remove(i);
                    numList.set(i, numList.get(i) + left);
                    left = numList.get(i);
                    j = numList.size() - i - 1;
                    sumRevert++;
                } else if (left > right) {
                    numList.remove(j);
                    j = numList.size() - i - 1;
                    numList.set(j, numList.get(j) + right);
                    right = numList.get(j);
                    sumRevert++;
                } else {
                    i++;
                    j--;
                    left = numList.get(i);
                    right = numList.get(j);
                }
            }
        } catch (Exception e) {
            return sumRevert;
        }
        
        return sumRevert;
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int res;

        int  _inputSum;
        List<Integer> numList = new ArrayList<>();
        try {
            _inputSum = in.nextInt();
            for (int i = 0; i < _inputSum; i++) {
                numList.add(in.nextInt());
            }
            
        } catch (Exception e) {
            _inputSum = 0;
            in.close();
        } 

        res = Main.process(numList);
        System.out.println(res);

    }

}
