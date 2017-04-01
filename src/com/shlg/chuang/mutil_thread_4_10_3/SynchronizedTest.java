package com.shlg.chuang.mutil_thread_4_10_3;

public class SynchronizedTest {
    
    public synchronized void synchronizedMethod() {
        System.out.println("begin");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("finish");
    }
    
    public synchronized void generalMethod() {
        System.out.println("general");
    }

    static final SynchronizedTest t = new SynchronizedTest();
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread() {
            public void run() {
                t.synchronizedMethod();
            }
        };
        
        Thread t2 = new Thread() {
            public void run(){
                t.generalMethod();
            }
        };
        t1.start();
        t2.start();
    }

}
