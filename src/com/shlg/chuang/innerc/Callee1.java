package com.shlg.chuang.innerc;

class Callee1 implements Incrementable {
	
	private int i = 0;

	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}

}