package com.shlg.chuang.structed;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMostFrequentInArray {
    
    public static int findMostFrequentInArray(int[] a) {
        int result = 0;
        int size = a.length;
        if (size == 0) 
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        int most = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int key = (Integer) entry.getKey();
            int val = (Integer) entry.getValue();
            if (val > most) {
                result = key;
                most = val;
            }
        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = (Integer) entry.getKey();
//            int val = (Integer) entry.getValue();
//            if (val > most) {
//                result = key;
//                most = val;
//            }
//        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 4, 3, 4, 4, 5, 5, 6, 6, 6, 6 };
        int maxFrequenceNum = findMostFrequentInArray(array);
        System.out.println(maxFrequenceNum);
    }

}
