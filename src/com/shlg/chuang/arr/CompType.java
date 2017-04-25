package com.shlg.chuang.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import com.shlg.chuang.generic.Generator;

public class CompType implements Comparable<CompType>{
    
    Integer i;
    
    Integer j;
    
    private static int count = 1;
    
    public CompType(Integer n1, Integer n2) {
        i = n1;
        j = n2;
    }

    @Override
    public int compareTo(CompType rv) {
        try {
            return (i < rv.i ? -1 : (i == rv.i ? (j < rv.j ? -1 : (j == rv.j ? 0 : 1)): 1));
        } catch (NullPointerException e) {
            if (i == null && rv.i == null) 
                try {
                    return j < rv.j ? -1 : (j == rv.j ? 0 : 1);
                } catch (NullPointerException ein) {
                    if (j != null)
                        return -1;
                }
        }
        return 1;
    }
    
    @Override
    public String toString() {
        String result = "{ i = " + i + ", j = " + j + " }";
        if (count++ % 3 == 0)
            result += "\n";
        return result;
        
    }
    
    private static Random r = new Random(47);
    
    public static Generator<CompType> generator() {;
        return new Generator<CompType>() {

            @Override
            public CompType next() {
                return new CompType(r.nextInt(10), r.nextInt(10));
            }
            
        };
    }
    
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        CompType[] b = new CompType[18];
        System.arraycopy(a, 0, b, 0, a.length < b.length ? a.length : b.length);
        
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("-------------------");
        
        CompType[] k = new CompType[6];
        Arrays.fill(k, new CompType(null, null));
        System.arraycopy(k, 0, b, 12, k.length);
        b[13] = new CompType(1, null);
        b[14] = new CompType(null, 1); 
        b[15] = new CompType(2, null);
        b[16] = new CompType(null, 2);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(Arrays.toString(b));
    }

}
