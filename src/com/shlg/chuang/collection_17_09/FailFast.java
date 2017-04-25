package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Iterator<String> it = collection.iterator();
        collection.add("An object");
        try {
            String s = it.next();
            System.out.println(s);
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
        
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("aa", "a");
        Iterator<Map.Entry<String, String>> mapIt = map.entrySet().iterator();
        map.put("bb", "b");
        try {
            System.out.println(mapIt.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
