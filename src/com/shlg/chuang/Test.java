package com.shlg.chuang;

public class Test {
    
    public static void hello() {
        System.out.println("say hello");
    }

    public static void main(String[] args) {
        Test t = null;
        t.hello();
        ((Test) null).hello();
        
        String x="fmn";
        x.toUpperCase();
        String y=x.replace('f','F');
        y=y+"wxy";
        System.out.println(y);
    }

}
