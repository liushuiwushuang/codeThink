package com.shlg.chuang.generic;

import java.util.List;
import java.util.Map;

import com.shlg.chuang.collect.Person;
import com.shlg.chuang.collection_17_09.Pet;

public class LimitsOfInference {
    
    static void f(Map<Person, List<? extends Pet>> petPeople) {
        
    }

    public static void main(String[] args) {
        f(New.map());
        f(New.<Person, List<? extends Pet>>map()); // 显示类型说明
    }

}
