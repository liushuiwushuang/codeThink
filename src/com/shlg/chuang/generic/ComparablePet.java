package com.shlg.chuang.generic;

public class ComparablePet implements Comparable<ComparablePet>{
    
    @Override
    public int compareTo(ComparablePet arg) {
        return 0;
    }

}

// Error: COomparable cannot be inherited with
//        different arguments: <Cat> and <ComparablePet>
//class Cat extends ComparablePet implements Comparable<Cat> {
//    
//}

class Hamster extends ComparablePet implements Comparable<ComparablePet> {
    
    @Override
    public int compareTo(ComparablePet arg) {
        return 0;
    }
    
}

class Gecko extends ComparablePet {
    
    @Override
    public int compareTo(ComparablePet arg) {
        return 0;
    }
}
