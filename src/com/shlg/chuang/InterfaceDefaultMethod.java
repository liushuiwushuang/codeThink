package com.shlg.chuang;

public class InterfaceDefaultMethod implements B, A{

    @Override
    public void doSth() {
        B.super.doSth();
    }
    
    public static void main(String[] args) {

        new InterfaceDefaultMethod().doSth();
        int n = (1 << 30) + 1;
        int m = 1 << 31;
        // 当 m 为 2 的整数次幂时，n%m == n & (m-1)
        System.out.println(n % m == (n & (m - 1)));
    }

}
