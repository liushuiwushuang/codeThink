package com.shlg.chuang.annotation;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {

    HashSet<String> testObject = new HashSet<String>();
    
    @Test
    public void initialization() {
        assert testObject.isEmpty();
    }
    
    @Test
    public void _contains() {
        testObject.add("one");
        assert testObject.contains("one");
    }
    
    @Test
    public void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }
}
