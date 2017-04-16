package com.shlg.chuang.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.shlg.chuang.collection_17_09.Pet;
import com.shlg.chuang.collection_17_09.Pets;

public class CollectionSequence extends AbstractCollection<Pet>{
    
    private Pet[] pets = Pets.createArray(8);
    
    @Override
    public int size() {
        return pets.length;
    }
    
    @Override
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
                // not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {

        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }

}
