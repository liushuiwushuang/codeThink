package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Synchronization {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Collection<String> collection = Collections.synchronizedCollection(new ArrayList<>());
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Set<String> sortedSet = Collections.synchronizedSortedSet(new TreeSet<>());
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>()); 
        Map<String, String> sortedMap = Collections.synchronizedSortedMap(new TreeMap<>());
    }

}
