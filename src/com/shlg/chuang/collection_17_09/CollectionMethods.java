package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names);
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
        
        String L;
        int i = 0;
        Object[] array = c.toArray();
        for (Object o : array) {
            if (i == 0) {
                i++;
                System.out.println(o + " ");
                array[0] = new String("Noth");
            } else if (o instanceof String) {
                L = (String) o;
                System.out.print(L + " ");
            }
        }
        
        String[] str = c.toArray(new String[0]);
        System.out.println(Arrays.toString(str));
        
        System.out.println(Collections.max(c));
        System.out.println(Collections.min(c));
        
        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(3));
        System.out.println(c2);
        c.addAll(c2);
        System.out.println(c);
        
        String s = Countries.DATA[0][0];
        c.remove(s);
        System.out.println(c);
        s = Countries.DATA[1][0];
        c.remove(s);
        System.out.println(c);
        
        c.removeAll(c2);
        System.out.println(c);
        c.addAll(c2);
        System.out.println(c);
        
        String val = Countries.DATA[3][0];
        System.out.println(c.contains(val));
        System.out.println(c.containsAll(c2));
        
        Collection<String> c3 = ((List<String>) c).subList(3, 5);
        c2.retainAll(c3);
        System.out.println(c2);
        c2.removeAll(c3);
        System.out.println(c2.isEmpty());
        
        c = new ArrayList<>();
        c.addAll(Countries.names(6));
        System.out.println(c);
        c.clear();
        System.out.println(c);
    }

}
