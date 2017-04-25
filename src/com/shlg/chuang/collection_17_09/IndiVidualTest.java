package com.shlg.chuang.collection_17_09;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.shlg.chuang.collect.MapOfList;

public class IndiVidualTest {

    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<>();
        for (List<? extends Pet> lp : MapOfList.petPeopleMap.values()) {
            for (Pet p : lp)
                pets.add(p);
        }
        System.out.println(pets);
    }

}
