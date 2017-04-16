package com.shlg.chuang.collect;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.shlg.chuang.collection_17_09.Individual;
import com.shlg.chuang.collection_17_09.Pet;

public class IndividualTest {

    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        for (List<? extends Pet> lp : MapOfList.petPeopleMap.values())
            for (Pet p : lp)
                pets.add(p);
        System.out.println(pets);
    }

}
