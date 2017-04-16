package com.shlg.chuang.rtti;

import java.util.HashMap;

import com.shlg.chuang.collection_17_09.Cat;
import com.shlg.chuang.collection_17_09.Dog;
import com.shlg.chuang.collection_17_09.Hamster;
import com.shlg.chuang.collection_17_09.Manx;
import com.shlg.chuang.collection_17_09.Mouse;
import com.shlg.chuang.collection_17_09.Mutt;
import com.shlg.chuang.collection_17_09.Pet;
import com.shlg.chuang.collection_17_09.PetCreator;
import com.shlg.chuang.collection_17_09.Pug;
import com.shlg.chuang.collection_17_09.Rat;
import com.shlg.chuang.collection_17_09.Rodent;

public class PetCount {
    
    public static void countPets(PetCreator ctreator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : ctreator.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog) 
                counter.count("Dog");
            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Mutt");
            if (pet instanceof Cat)
                counter.count("Cat");
            if (pet instanceof Manx)
                counter.count("Manx");
            if (pet instanceof Manx)
                counter.count("Crymic");
            if (pet instanceof Rodent)
                counter.count("Rodent");
            if (pet instanceof Rat)
                counter.count("Rat");
            if (pet instanceof Mouse)
                counter.count("Mouse");
            if (pet instanceof Hamster)
                counter.count("Hamster");
        }
        System.out.println();
        System.out.println(counter);
    }
    
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }

    static class PetCounter extends HashMap<String, Integer> {
        
        private static final long serialVersionUID = 1L;

        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) 
                put(type, 1);
            else {
                put(type, quantity + 1);
            }
        }
        
    }
}
