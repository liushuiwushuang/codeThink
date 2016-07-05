package com.shlg.chuang.collect;

import java.util.ArrayList;

public class AppleAndGene {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i=0; i<3; i++) {
			apples.add(new Apple());
		}
		((Apple)apples.get(0)).id();
	}
}
