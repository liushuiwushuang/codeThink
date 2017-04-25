package com.shlg.chuang.collection_17_09;

import java.util.WeakHashMap;

public class CanonicalMapping {

    public static void main(String[] args) {
        int size = 20;
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0)
                keys[i] = k;
            map.put(k, v);
        }
        System.gc();
        System.out.println(map);
    }

}

class Element {
    
    private String ident;
    
    public Element(String id) {
        ident = id;
    }
    
    @Override
    public String toString() {
        return ident;
    }
    
    @Override
    public int hashCode() {
        return ident.hashCode();
    }
    
    @Override
    public boolean equals(Object o) {
        return o instanceof Element &&
                ident.equals(((Element) o).ident);
    }
    
    @Override
    protected void finalize() {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
    }
    
}

class Key extends Element {

    public Key(String id) {
        super(id);
    }
    
}

class Value extends Element {

    public Value(String id) {
        super(id);
    }
    
}
