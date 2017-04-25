package com.shlg.chuang.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfGenerics {

    public static void main(String[] args) {
        List<String>[] ls;
        @SuppressWarnings("rawtypes")
        List[] la = new List[10];
        ls = (List<String>[]) la; // "Uvchecked" Warning
//        ls[1] = new ArrayList<Integer>();  // compile Error: Type mismatch: cannot convert from ArrayList<Integer> to List<String>
        
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();
        objects[2] = new ArrayList<Integer>(Arrays.asList(1, 2));
        objects[3] = new ArrayList<String>(Arrays.asList("aa", "bb"));
        // ArrayStoreException
//        objects[4] = new String("cc");
        System.out.println(Arrays.deepToString(objects));
        
        // Warning: Type safety: Unchecked cast from List[] to List<BerylliumSphere>[]
        List<BerylliumSphere>[] spheres = 
                (List<BerylliumSphere>[]) new List[10];
        for (int i = 0; i < spheres.length; i++)
            spheres[i] = new ArrayList<BerylliumSphere>();
    }

}
