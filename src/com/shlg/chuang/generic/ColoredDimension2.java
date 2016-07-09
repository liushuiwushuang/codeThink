package com.shlg.chuang.generic;

public class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {

	ColoredDimension2(T item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	int getX() {return item.x; }
	int getY() {return item.y; }
	int getZ() {return item.z; }

}
