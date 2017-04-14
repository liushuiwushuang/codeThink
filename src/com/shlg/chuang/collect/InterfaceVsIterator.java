package com.shlg.chuang.collect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.shlg.chuang.think_17_09.Pet;
import com.shlg.chuang.think_17_09.Pets;

public class InterfaceVsIterator {
    
    public static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    
    public static void display(Collection<Pet> collection) {
        for (Pet p : collection)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        List<Pet> petList = Pets.arrayList(4);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
        String[] names = "Ralph, Eric, Robin, Lacey".split(", ");
        for (int i = 0; i < names.length; i++) 
            petMap.put(names[i], petList.get(i));
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }

}
