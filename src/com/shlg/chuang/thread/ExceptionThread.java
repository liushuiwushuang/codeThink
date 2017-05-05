package com.shlg.chuang.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable {
    
    public void run() {
        throw new RuntimeException();
    }
    
    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (RuntimeException ue) {
            // 未能捕获
            ue.printStackTrace();
        }
        
    }

}
