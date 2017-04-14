package com.shlg.chuang.collect;

import java.util.ArrayList;

public class AppleAndGene {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		for(int i=0; i<3; i++) {
			apples.add(new Apple());
		}
		((Apple) apples.get(0)).id();
	}
}
