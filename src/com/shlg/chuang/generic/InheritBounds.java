package com.shlg.chuang.generic;

public class InheritBounds {

	public static void main(String[] args) {
		Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
		solid2.color();
		solid2.getY();
		solid2.weight();
	}

}
