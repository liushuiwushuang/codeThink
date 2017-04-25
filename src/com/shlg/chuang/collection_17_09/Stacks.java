package com.shlg.chuang.collection_17_09;

import java.util.LinkedList;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month m : Month.values())
            stack.push(m.toString());
        System.out.println(stack);
        stack.addElement("The last line");
        System.out.println(stack.elementAt(5));
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        
        LinkedList<String> lstack = new LinkedList<>();
        for (Month m : Month.values())
            lstack.addFirst(m.toString());
        System.out.println(lstack);
        while (!lstack.isEmpty())
            System.out.print(lstack.removeFirst() + " ");
    }

}

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER
    // DECEMBER
}
