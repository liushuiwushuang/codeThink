package com.shlg.chuang.collect;

import java.util.Iterator;

import com.shlg.chuang.think_17_09.Pet;
import com.shlg.chuang.think_17_09.Pets;

public class NonCollectionSequence extends PetSequence {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
          
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
        
    }
}

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}
