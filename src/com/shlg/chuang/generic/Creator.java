package com.shlg.chuang.generic;

class Creator extends GenericWithCreate<X> {

	@Override
	X create() {
		return new X();
	}
	
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}

}
