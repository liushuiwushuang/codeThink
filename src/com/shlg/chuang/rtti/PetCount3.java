package com.shlg.chuang.rtti;

import java.util.LinkedHashMap;
import java.util.Map;

import com.shlg.chuang.collection_17_09.LiteralPetCreator;
import com.shlg.chuang.collection_17_09.MapData;
import com.shlg.chuang.collection_17_09.Pet;
import com.shlg.chuang.collection_17_09.Pets;

public class PetCount3 {

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        System.out.println();
        System.out.println(petCount);
    }

    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        
        private static final long serialVersionUID = 1L;
        
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
        }
        
        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }
    
}
