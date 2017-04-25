package com.shlg.chuang.arr;

public class ArrayOfGenericType<T> {
    
    T[] array;
    
    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        // compile Error: Cannot create a generic array of T
//        array = new T[size];
        // unchecked Warning
        array = (T[]) new Object[size];
    }
    
//    public <U> U[] makeArray() {
//     // compile Error: Cannot create a generic array of T
//        return new U[10];
//    }
}
