package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.HashSet;

import com.shlg.chuang.arr.RandomGenerator;

public class CollectionDataGeneration {

    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list(new RandomGenerator.String(3), 10)));
        System.out.println(new HashSet<Integer>(
                new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
    }

}
