package com.shlg.chuang.enumclass;

import java.util.EnumSet;

public class BigEnumSet {
    
    enum Big {
        A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
        A11, A12, A13, A14, A15, A16, A17, A18, A19, A20,
        A21, A22, A23, A24, A25, A26, A27, A28, A29, A30,
        A31, A32, A33, A34, A35, A36, A37, A38, A39, A40,
    }

    public static void main(String[] args) {
        EnumSet<Big> bigEnumSet = EnumSet.allOf(Big.class);
        System.out.println(bigEnumSet);
    }

}
