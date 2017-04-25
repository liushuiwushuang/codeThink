package com.shlg.chuang.arr;

import java.lang.reflect.Array;

import com.shlg.chuang.collection_17_09.CollectionData;
import com.shlg.chuang.generic.Generator;

public class Generated {

    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }
    
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size) {
        @SuppressWarnings("unchecked")
        T[] a = (T[]) Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
}
