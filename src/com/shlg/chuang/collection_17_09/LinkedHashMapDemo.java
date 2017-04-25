package com.shlg.chuang.collection_17_09;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(new CountingMapData(25));
        System.out.println(linkedHashMap);
        linkedHashMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
        linkedHashMap.putAll(new CountingMapData(9));
        System.out.println(linkedHashMap);
        for (int i = 0; i < 6 ; i++)
            linkedHashMap.get(i);
        System.out.println(linkedHashMap);
        linkedHashMap.get(0);
        System.out.println(linkedHashMap);
        
        Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");
        map.put(1, "66");
        System.out.println(map.get(2));
        System.out.println(map);
        
    }

}
