package com.shlg.chuang.generic;

class Decorator extends BasicClass {
	
	protected BasicClass basicClass;
	
	public Decorator(BasicClass basicCLass) {
		this.basicClass = basicCLass;
	}
	
	public void set(String val) {
		basicClass.set(val);
	}
	
	public String get() {
		return basicClass.get();
	}
}
