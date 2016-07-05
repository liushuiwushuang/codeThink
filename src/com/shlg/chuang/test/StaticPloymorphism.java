package com.shlg.chuang.test;

public class StaticPloymorphism {

	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}

}
