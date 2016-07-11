package com.shlg.chuang.generic;

public class Unconstrained {

	public static void main(String[] args) {
		
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}

}
