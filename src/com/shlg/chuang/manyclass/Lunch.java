package com.shlg.chuang.manyclass;

public class Lunch {

	void testPrivate() {
		
	}

	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	
	void testSingleton() {
		Soup2.access().f();
	}
}
