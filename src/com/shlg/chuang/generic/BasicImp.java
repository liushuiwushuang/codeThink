package com.shlg.chuang.generic;

class BasicImp implements Basic {

	private String value;
	
	@Override
	public void set(String val) {
		// TODO Auto-generated method stub
		value = val;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return value;
	}

}
