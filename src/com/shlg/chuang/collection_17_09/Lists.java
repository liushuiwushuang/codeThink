package com.shlg.chuang.collection_17_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    
    private static boolean b;
    
    private static String s;
    
    private static int i;
    
    private static Iterator<String> it;
    
    private static ListIterator<String> lit;
    
    public static void basicTest(List<String> a) {
        a.add(1, "x");
        a.add("x");
        a.addAll(Countries.names(5));
        a.addAll(3, Countries.names(5));
        
        b = a.contains("1");
        b = a.containsAll(Countries.names(5));
        
        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();
        
        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);  // start at loc 3
        
        i = a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1, "y");
        
        a.retainAll(Countries.names(5));
        a.removeAll(Countries.names(5));
        
        i = a.size();
        a.clear();
    }
    
    public static void iterMotion(List<String> a) {
        ListIterator<String> listIterator = a.listIterator();
        b = listIterator.hasNext();
        b = listIterator.hasPrevious();
        s = listIterator.next();
        i = listIterator.nextIndex();
        s = listIterator.previous();
        i = listIterator.previousIndex();
    }
    
    public static void iterManipulation(List<String> a) {
        ListIterator<String> listIterator = a.listIterator();
        listIterator.add("47");
        listIterator.next();
        listIterator.remove();
        listIterator.next();
        listIterator.set("47");
    }
    
    public static void testVisual(List<String> a) {
        System.out.println(a);
        List<String> b = Countries.names(5);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);
        ListIterator<String> listIterator = a.listIterator(a.size() / 2);
        listIterator.add("one");
        System.out.println(a);
        System.out.println(listIterator.next());
        listIterator.remove();
        
        System.out.println(listIterator.next());
        listIterator.set("47");
        System.out.println(a);
        
        listIterator = a.listIterator(a.size());
        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous() + " ");
        System.out.println();
        System.out.println("testVisual finished");
    }
    
    public static void testLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Countries.names(5));
        System.out.println(linkedList);
        
        linkedList.addFirst("one");
        linkedList.addLast("two");
        System.out.println(linkedList);
        
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
        
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }

    public static void main(String[] args) {
        basicTest(new LinkedList<>(Countries.names(5)));
        basicTest(new ArrayList<>(Countries.names(5)));
        
        iterMotion(new LinkedList<>(Countries.names(5)));
        iterMotion(new ArrayList<>(Countries.names(5)));
        
        iterManipulation(new LinkedList<>(Countries.names(5)));
        iterManipulation(new ArrayList<>(Countries.names(5)));
        
        testVisual(new LinkedList<>(Countries.names(5)));
        testLinkedList();
    }

}
