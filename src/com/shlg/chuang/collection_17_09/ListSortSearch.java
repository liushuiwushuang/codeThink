package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListSortSearch {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Utilities.list);
        list.addAll(Utilities.list);
        System.out.println(list);
        Collections.shuffle(list, new Random(47));
        System.out.println(list);
        ListIterator<String> it = list.listIterator(10);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        String key = list.get(6);
        int index = Collections.binarySearch(list, key);
        System.out.println(key + " " + index + " " + list.get(index));
        
                
    }

}
