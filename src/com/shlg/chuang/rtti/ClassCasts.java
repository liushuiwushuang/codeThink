package com.shlg.chuang.rtti;

public class ClassCasts {

	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b;
	}

}
