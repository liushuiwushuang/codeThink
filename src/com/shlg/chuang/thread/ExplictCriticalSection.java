package com.shlg.chuang.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplictCriticalSection {

    public static void main(String[] args) {
        PairManager pman1 = new ExplicitPairManager1();
        PairManager pman2 = new ExplicitPairManager2();
        CirticalSection.testApproaches(pman1, pman2);
    }

}

class ExplicitPairManager1 extends PairManager {
    
    private Lock lock = new ReentrantLock();

    @Override
    public synchronized void increment() {
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            store(getPair());
        } finally {
            lock.unlock();
        }
        System.out.println("--");
    }
    
}

class ExplicitPairManager2 extends PairManager {
    
    private Lock lock = new ReentrantLock();
    
    @Override
    public void increment() {
        Pair temp;
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        } finally {
            lock.unlock();
        }
        store(temp);
        System.out.println("==");
    }
    
}
