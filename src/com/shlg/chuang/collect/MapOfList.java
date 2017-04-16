package com.shlg.chuang.collect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shlg.chuang.collection_17_09.Cat;
import com.shlg.chuang.collection_17_09.Cymric;
import com.shlg.chuang.collection_17_09.Dog;
import com.shlg.chuang.collection_17_09.Mutt;
import com.shlg.chuang.collection_17_09.Pet;
import com.shlg.chuang.collection_17_09.Pug;

public class MapOfList {
    
    public static Map<Person, List<? extends Pet>> 
        petPeopleMap = new HashMap<Person, List<? extends Pet>>();
    
    static {
        petPeopleMap.put(new Person("Dawn", 0, 0), 
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeopleMap.put(new Person("Kate", 0, 0), 
                Arrays.asList(new Cat("Elsie May"), new Dog("Margrett")));
        petPeopleMap.put(new Person("Marilyn", 0, 0), 
                Arrays.asList(new Pug("Louie aka Louis")));
    }
    
    public static void main(String[] args) {

        System.out.println("People: " + petPeopleMap.keySet());
        System.out.println("Pets: " + petPeopleMap.values());
        for (Person person : petPeopleMap.keySet()) {
            System.out.print(person.name + " has: ");
            for (Pet pet : petPeopleMap.get(person)) {
                System.out.print(pet + ", ");
            }
            System.out.println();
        }
    }

}
