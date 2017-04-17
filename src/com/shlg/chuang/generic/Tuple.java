package com.shlg.chuang.generic;

public class Tuple {

    public static <A,B> TwoTuple<A,B> tuple(A a, B b) {  // 返回值前的 <A, B>可以略去
		return new TwoTuple<A,B>(a, b);
	}
	
    public static <A,B,C> ThreeTuple<A,B,C> tuple(A a, B b, C c) {
		return new ThreeTuple<A, B, C>(a, b, c);
	}
}
