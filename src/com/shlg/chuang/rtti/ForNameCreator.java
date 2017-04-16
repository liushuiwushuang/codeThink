package com.shlg.chuang.rtti;

import java.util.ArrayList;
import java.util.List;

import com.shlg.chuang.collection_17_09.Pet;
import com.shlg.chuang.collection_17_09.PetCreator;

public class ForNameCreator extends PetCreator {
    
    private static List<Class<? extends Pet>> types = 
            new ArrayList<Class<? extends Pet>>();
    
    private static String[] typeNames = {
            "com.shlg.chuang.think_17_09.Mutt",
            "com.shlg.chuang.think_17_09.Pug",
            "com.shlg.chuang.think_17_09.EgyptianMau",
            "com.shlg.chuang.think_17_09.Manx",
            "com.shlg.chuang.think_17_09.Cymric",
            "com.shlg.chuang.think_17_09.Rat",
            "com.shlg.chuang.think_17_09.Mouse",
            "com.shlg.chuang.think_17_09.Hamster" 
            };
    
    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String className : typeNames)
            try {
                types.add((Class<? extends Pet>) Class.forName(className));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }
    
    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

}
