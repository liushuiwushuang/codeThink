package com.shlg.chuang.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator());
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator().reversed());
        System.out.println(Arrays.toString(a));
    }

}

class CompTypeComparator implements Comparator<CompType> {

    @Override
    public int compare(CompType o1, CompType o2) {
        try {
            return (o1.i < o2.i ? -1 : (o1.i == o2.i ? (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1)): 1));
        } catch (NullPointerException e) {
            if (o1.i == null && o2.i == null) 
                try {
                    return o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1);
                } catch (NullPointerException ein) {
                    if (o1.j != null)
                        return -1;
                }
        }
        return 1;
    }
    
    @Override
    public Comparator<CompType> reversed() {
        return Collections.reverseOrder(this);
    }
    
}
