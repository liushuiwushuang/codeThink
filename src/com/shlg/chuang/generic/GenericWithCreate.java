package com.shlg.chuang.generic;

abstract class GenericWithCreate<T> {

	final T element;
	public GenericWithCreate() {
		element = create();
	}

	abstract T create(); 
}
