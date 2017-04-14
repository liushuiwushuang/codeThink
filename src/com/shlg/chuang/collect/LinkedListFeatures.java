package com.shlg.chuang.collect;

import java.util.LinkedList;

import com.shlg.chuang.think_17_09.Hamster;
import com.shlg.chuang.think_17_09.Pet;
import com.shlg.chuang.think_17_09.Pets;
import com.shlg.chuang.think_17_09.Rat;

public class LinkedListFeatures {

    public static void main(String[] args) {

        LinkedList<Pet> petLinkedList = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(petLinkedList);
        
        // getFirst
        System.out.println("pets.getFirst: " + petLinkedList.getFirst());
        System.out.println("pets.element: " + petLinkedList.element());
        System.out.println("pets.peek: " + petLinkedList.peek());
        
        // remove
        System.out.println("pets.remove: " + petLinkedList.remove());
        System.out.println("pets.rmoveFirst " + petLinkedList.removeFirst());
        System.out.println("pets.poll: " + petLinkedList.poll());
        System.out.println(petLinkedList);
        System.out.println("--------------");
        petLinkedList.addFirst(new Rat());
        System.out.println("After addFirst: " + petLinkedList);
        petLinkedList.offer(Pets.randomPet());
        System.out.println("After offer: " + petLinkedList);
        petLinkedList.add(Pets.randomPet());
        System.out.println("After add: " + petLinkedList);
        petLinkedList.addLast(new Hamster());
        System.out.println("After addLast: " + petLinkedList);
        System.out.println("pets.removeLast: " + petLinkedList.removeLast());
        
    }

}
