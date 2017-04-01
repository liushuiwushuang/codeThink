package com.shlg.chuang.mutil_thread_4_10_3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
    
    public static class CallableTest implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            return "Hello World!";
        }
        
    }

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // 启动线程
        Future<String> future = threadPool.submit(new CallableTest());
        try {
            System.out.println("waiting thread to finish");
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
