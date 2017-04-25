package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;

import com.shlg.chuang.generic.Generator;

public class CollectionData<T> extends ArrayList<T> {

    private static final long serialVersionUID = 1L;

    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++)
            add(gen.next());
    }
    
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
    
}
