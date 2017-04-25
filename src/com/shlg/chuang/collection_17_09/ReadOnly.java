package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReadOnly {

    static Collection<String> data = new ArrayList<>(Countries.names(6));
    
    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<>(data));
        System.out.println(c);
//        c.add("one"); // UnsupportedOperationException
        List<String> a = Collections.unmodifiableList(new ArrayList<>(data));
        ListIterator<String> lit = a.listIterator();
        System.out.println(lit.next());  // Reading is OK
//        lit.add("one");  // UnsupportedOperationException
        
        Set<String> s = Collections.unmodifiableSet(new HashSet<>(data));
        System.out.println(s);
//        s.add("one"); // UnsupportedOperationException
        
        Set<String> sortedSet = Collections.unmodifiableSortedSet(new TreeSet<>(data));
        System.out.println(sortedSet);
        Map<String, String> m = Collections.unmodifiableMap(new HashMap<>(Countries.capitals(6)));
        System.out.println(m);
//        m.put("Ralph", "Howdy!"); // UnsupportedOperationException
        Map<String, String> sortedMap = Collections.unmodifiableSortedMap(new TreeMap<>(Countries.capitals(6)));
        System.out.println(sortedMap);
        
    }
}
