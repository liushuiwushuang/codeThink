package com.shlg.chuang.generic;

import java.awt.Color;

class Colored2<T extends HasColor> extends HoldItem<T> {

	Colored2(T item) {
		super(item);
	}
	
	Color color() {
		return item.getColor();
	}

}
