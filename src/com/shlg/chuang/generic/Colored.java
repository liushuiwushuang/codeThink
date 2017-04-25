package com.shlg.chuang.generic;

import java.awt.Color;

class Colored<T extends HasColor> {

	T item;
	
	Colored(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
	
	Color color() {
		return item.getColor();
	}
}
