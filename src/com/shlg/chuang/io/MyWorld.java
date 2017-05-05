package com.shlg.chuang.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyWorld {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        House house = new House();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Bosco the dog", house));
        animals.add(new Animal("Ralph the hamster", house));
        animals.add(new Animal("Molly the cat", house));
        System.out.println("animals:" + animals);
        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutputStream o1 = new ObjectOutputStream(buf1); 
        o1.writeObject(animals);
        o1.writeObject(animals); // write a 2nd set
        // Write to a different stream:
        ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
        ObjectOutputStream o2 = new ObjectOutputStream(buf2);
        o2.writeObject(animals);
        
        // Now get them back:
        ObjectInputStream in1 = new ObjectInputStream(
                new ByteArrayInputStream(buf1.toByteArray()));
        ObjectInputStream in2 = new ObjectInputStream(
                new ByteArrayInputStream(buf2.toByteArray()));
        List<?> animal1 = (List<?>) in1.readObject();
        List<?> animal2 = (List<?>) in1.readObject();
        List<?> animal3 = (List<?>) in2.readObject();
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }

}

class House implements Serializable {}

class Animal implements Serializable {
    
    private String name;
    
    private House preferredHouse;
    
    Animal(String nm, House h) {
        name = nm;
        preferredHouse = h;
    }
    
    public String toString() {
        return name + "[" + super.toString() + "], " + preferredHouse + "\n";
    }
    
}
