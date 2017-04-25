package com.shlg.chuang.collection_17_09;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {
    
    private List<K> keys = new ArrayList<K>();
    
    private List<V> values = new ArrayList<V>();
    
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else 
            values.set(keys.indexOf(key), value);
        return oldValue;
    }
    
    public V get(Object key) {
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }
    
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext())
            set.add(new MapEntry<K,V>(ki.next(), vi.next()));
        return set;
    }
    
    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(5));
        System.out.println(m);
        System.out.println(m.get("China"));
        System.out.println(m.entrySet());
    }

}

class MapEntry<K, V> implements Map.Entry<K, V> {
    
    private K key;
    
    private V value;
    
    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V oldVaule = value;
        value = v;
        return oldVaule; // 返回旧的值
    }
    
    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^
                (value == null ? 0 : value.hashCode());
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MapEntry)) return false;
        MapEntry<?, ?> mapEntry = (MapEntry<?, ?>) o;
        return (key == null ? 
                 mapEntry.getKey() == null : key.equals(mapEntry.getKey())) &&
                (value == null ?
                 mapEntry.getValue() == null : value.equals(mapEntry.getValue()));
    }
    
    @Override
    public String toString() {
        return key + "=" + value;
    }
    
}
