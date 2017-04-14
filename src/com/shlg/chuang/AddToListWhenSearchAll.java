package com.shlg.chuang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddToListWhenSearchAll {
    
    private static void testIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
//            System.out.println(list.get(i++));
            System.out.println(iterator.next());
            if (i == 0) {
                list.add(7);
                list.remove(2);
            }
            
        }
        if (i == 0) {
            list.add(5);
            i++;
        }
    }

    private static void testForList() {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        // forEach 语句调的是Iterato.hasNext 和 Iterator.next 
        for (Integer i : list) {
            System.out.println(i);
            list.add(7);
        }
    }
    
    public static void main(String[] args) {
//        testIterator();
        testForList();
    }

}
