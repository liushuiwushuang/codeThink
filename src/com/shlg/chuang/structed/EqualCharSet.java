package com.shlg.chuang.structed;

import java.util.Arrays;

public class EqualCharSet {
    
    private static void compare(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        System.out.println(s1.equals(s2));
    }
    
    private static void compareWithChar(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1 = new String(c1);
        s2 = new String(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        // 数组的equals调用的是 Object的equals 这里返回 false
        System.out.println(c1.equals(c2));
        System.out.println(s1.equals(s2));
    }

    private static void compare2(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        int[] bCount = new int[256];
        for (int i = 0; i < b1.length; i++) {
            bCount[b1[i] - '0'] += 1;
        }
        for (int i = 0; i < b2.length; i++) {
            bCount[b2[i] - '0'] -= 1;
        }
        for (int i = 0; i < 256; i ++) {
            if (bCount[i] != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
    public static void main(String[] args) {
        String s1 = "aaaabbc";
        String s2 = "abcbaaa";
        compareWithChar(s1, s2);
        compare(s1, s2);
        System.out.println("222222222222222222222222222222");
        compare2(s1, s2);
        s1 = "aaaabbc";
        s2 = "abcbaab";
        compare(s1, s2);
        System.out.println("222222222222222222222222222222");
        compare2(s1, s2);
    }

}
