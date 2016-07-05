package com.shlg.chuang.reuse;

public class Insect {

	private int i = 9;
	
	protected int j;
	Insect() {
		System.out.println("i = "+i+", j= "+j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);;
		return 47;
	}
	private int k = printInit("Insect.k initialized");
}
