package com.shlg.chuang.manyclass;

public class PassingThis {
	
	private Apple a = null;
	
	public void wri() {
		a = new Apple();
		a.toString();
	}

	public static void main(String[] args) {
		
		new Person().eat(new Apple());
	}

}
