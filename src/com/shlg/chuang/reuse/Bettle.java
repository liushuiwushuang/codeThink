package com.shlg.chuang.reuse;

public class Bettle extends Insect {
	
	private int k = printInit("Beetle.k initialized");
	
	public Bettle() {
		System.out.println("k= "+k);
		System.out.println("j= "+j);
	}
	
	private static int x2 = printInit("static Beettle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Bettle b = new Bettle();
	}

}
