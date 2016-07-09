package com.shlg.chuang.generic;

import com.shlg.chuang.generic.Tuple;
public class TupleTest2 {

	static TwoTuple<String, Integer> f() {
		return Tuple.tuple("hi", 47);
	}
	
	static TwoTuple f2() {
		return Tuple.tuple("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g() {
		return Tuple.tuple(new Amphibian(), "hi", 47);
	}
	
	public static void main(String[] args) {
		TwoTuple<String,Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(g());
	}
}
