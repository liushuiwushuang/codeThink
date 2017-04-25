package generic.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.shlg.chuang.collection_17_09.Cat;
import com.shlg.chuang.collection_17_09.Dog;
import com.shlg.chuang.collection_17_09.Pet;

public class CheckedList {
    
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1);
        System.out.println(dogs1);
        
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
        try {
            oldStyleMethod(dogs2);
        } catch(Exception e) {
            System.out.println(e);
        }
        
        List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
        System.out.println(pets);
    }

}
