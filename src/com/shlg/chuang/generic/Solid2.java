package com.shlg.chuang.generic;

public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {

	Solid2(T item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	int weight() {
		return item.weight();
	}

}
