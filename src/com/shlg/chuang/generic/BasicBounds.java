package com.shlg.chuang.generic;

public class BasicBounds {

	public static void main(String[] args) {
		Solid<Bounded> solid = new Solid<>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}

}
