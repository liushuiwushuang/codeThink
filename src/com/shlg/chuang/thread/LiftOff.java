package com.shlg.chuang.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
    
    protected int countDown = 10;
    
    private static int taskCount = 0;
    
    private final int id = taskCount++;
    
    public LiftOff() {
        
    }
    
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
    
    private static void mainThread() {
        LiftOff launch = new LiftOff();
        launch.run();
    }
    
    private static void basicThreads() {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
    
    private static void moreBasicThreads() {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
    
    private static void cachedThreadPool() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
    
    private static void fixedThreadPool() {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
    
    private static void singleThreadPool() {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
    
    public static void main(String[] args) {
//        mainThread();
//        basicThreads();
//        moreBasicThreads();
        cachedThreadPool();
    }

}
