package com.shlg.chuang.thread;

public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;
    
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
    
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(new EvenGenerator().next());
//        }
        EvenChecker.test(new EvenGenerator());
    }
}
