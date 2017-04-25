package com.shlg.chuang.generic;

class BasicImp implements Basic {

	private String value;
	
	@Override
	public void set(String val) {
		value = val;
	}

	@Override
	public String get() {
		return value;
	}

}
