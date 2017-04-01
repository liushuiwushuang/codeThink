package com.shlg.chuang.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.locks.Lock;

public class HashMapTest {
    
    String id;
    
    String name;
    
    public HashMapTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        HashMapTest hashMapTest = (HashMapTest) obj;
        if (hashMapTest.id.equals(this.id))
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {

        System.out.println("Use String as key:");
        HashMap<HashMapTest, String> hm = new HashMap<>();
        HashMapTest h1 = new HashMapTest(new String("111"), "name1");
        HashMapTest h2 = new HashMapTest(new String("111"), "name2");
        hm.put(h1, "address1");
        hm.put(h2, "address2");
        Iterator<Entry<HashMapTest, String>> iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<HashMapTest, String> entry = (Entry<HashMapTest, String>) iter.next();
            HashMapTest key = (HashMapTest) entry.getKey();
            String val  = (String) entry.getValue();
            System.out.println("key = " + key + "; value = " + val);
        }
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }).start();
        Lock lock;
    }
    
    class MyClassThread extends Thread implements Runnable{
        
    }

}
