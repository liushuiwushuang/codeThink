package com.shlg.chuang.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.shlg.chuang.think_17_09.Cymric;
import com.shlg.chuang.think_17_09.Hamster;
import com.shlg.chuang.think_17_09.Mouse;
import com.shlg.chuang.think_17_09.Pet;
import com.shlg.chuang.think_17_09.Pets;

public class ListFeatures {

    public static void main(String[] args) {

        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric)); // List.remove return false
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse());
        System.out.println("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        Collections.shuffle(sub);
        
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        System.out.println(copy.retainAll(sub));
        System.out.println("13: " + copy);
        System.out.println("pets: " + pets);
        
        copy = new ArrayList<>(pets);
        copy.remove(2);
        Object[] ob = pets.toArray();
        // java.lang.ClassCastException
//        Pets[] op = (Pets[]) pets.toArray();
        System.out.println("22: " + ob[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].id());
    }

}
