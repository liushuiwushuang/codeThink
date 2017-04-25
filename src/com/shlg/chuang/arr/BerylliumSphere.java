package com.shlg.chuang.arr;

class BerylliumSphere {

	private static long counter;
	
	private final long id = counter++;
	
	@Override
	public String toString() {
		return "Sphere " + id;
	}
}
