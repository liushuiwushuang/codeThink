package com.shlg.chuang.arr;

public class ParameterizedArrayType {

    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.3, 3.3, 4.4, 5.0 }; // 输入5会出现 compile Error
        // compile Error: Cannot create a generic array of ClassParameter<Integer>
//        ClassParameter<Integer>[] cp = new ClassParameter<Integer>[3];
        // Warning: Type safety: The expression of type 
        // ClassParameter[] needs unchecked conversion to conform to ClassParameter<Integer>[]
//        ClassParameter<Integer>[] cp = new ClassParameter [3];
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
        System.out.println(ints2 + " " + doubles2);
    }

}

class ClassParameter<T> {
    
    public T[] f(T[] arg) {
        return arg;
    }
    
}

class MethodParameter {
    
    public static <T> T[] f(T[] arg) {
        return arg;
    }
    
}
