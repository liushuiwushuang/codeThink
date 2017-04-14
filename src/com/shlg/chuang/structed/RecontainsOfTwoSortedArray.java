package com.shlg.chuang.structed;

import java.util.ArrayList;

public class RecontainsOfTwoSortedArray {
    
    private static ArrayList<Integer> mixed(int[] a, int[] b) {
        ArrayList<Integer> mixArrayList = new ArrayList<>();
        int i = 0, j = 0;
        int n1Len = a.length;
        int n2Len = b.length;
        while (i < n1Len && j < n2Len) {
            if (a[i] == b[j]) {
                mixArrayList.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
        }
        return mixArrayList;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4 };
        int[] b = { 1, 3, 5, 7, 9 };
        ArrayList<Integer> mix = mixed(a, b);
        for (int i = 0; i < mix.size(); i++) {
            System.out.print(mix.get(i) + " ");
        }
        System.out.println();
    }

}
