package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Utilities {

    static List<String> list = Arrays.asList(
            "one Two three Four five six one".split(" "));
    
    public static void main(String[] args) {
        System.out.println(list);
        // disjoint 俩个集合没有任何相同元素，返回 true
        System.out.println(Collections.disjoint(list, Collections.singletonList("Four")));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list, String.CASE_INSENSITIVE_ORDER));
        System.out.println(Collections.min(list, String.CASE_INSENSITIVE_ORDER));
        
        List<String> subList = Arrays.asList("Four five six".split(" "));
        System.out.println(Collections.indexOfSubList(list, subList));
        Collections.replaceAll(list, "one", "Yo");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.rotate(list, 3); // 末尾后3个移到前面，其他所有元素后移3个位置
        System.out.println(list);
        
        List<String> source = Arrays.asList("in the matrix".split(" "));
        Collections.copy(list, source);
        System.out.println(list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);
        Collections.shuffle(list, new Random(47));
        System.out.println(list);
        Collections.fill(list, "pop");
        System.out.println(list);
        System.out.println(Collections.frequency(list, "pop"));
        
        List<String> dups = Collections.nCopies(3, "snap");
        System.out.println(dups);
        System.out.println(Collections.disjoint(list, dups));
        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v = new Vector<String>();
        while (e.hasMoreElements())
            v.addElement(e.nextElement());
        ArrayList<String> arrayList = Collections.list(v.elements());
        System.out.println(arrayList);
        
    }
}
