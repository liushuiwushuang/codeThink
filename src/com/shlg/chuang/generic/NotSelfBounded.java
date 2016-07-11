package com.shlg.chuang.generic;

public class NotSelfBounded<T> {

	T element;
	
	NotSelfBounded<T> set(T arg) {
		element = arg;
		return this;
	}
	
	T get() {
		return element;
	}
}
