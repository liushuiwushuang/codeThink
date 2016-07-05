package com.shlg.chuang.jiekou;

class Processor {

	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) {
		return input;
	}
}
