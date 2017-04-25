package com.shlg.chuang.generic;

class Contract {

	private static long counter = 0;
	
	private final long id = counter++;
	
	@Override
	public String toString() {
		return getClass().getName() + " " +id;
	}
	
}
