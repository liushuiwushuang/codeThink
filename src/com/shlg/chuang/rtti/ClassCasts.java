package com.shlg.chuang.rtti;

public class ClassCasts {

	public static void main(String[] args) {
		Building b = new House();
		Building builder = new Building();
		House ho = new House();
		System.out.println(b instanceof House);
		System.out.println(builder instanceof House);
		System.out.println(ho instanceof Building); // 子类 instanceof 父类 返回 true
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b;
	}

}
