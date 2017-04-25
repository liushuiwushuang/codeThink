package com.shlg.chuang.generic;

public class FactoryConstraint {

	public static void main(String[] args) {
		System.out.println(new Foo2<>(new IntegerFactory()));
		System.out.println(new Foo2<>(new Widget.Factory()));
	}

}
