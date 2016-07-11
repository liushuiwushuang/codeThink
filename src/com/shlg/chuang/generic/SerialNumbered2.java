package com.shlg.chuang.generic;

class SerialNumbered2 extends Decorator {
	
	private static long counter = 1;
	
	private final long serialNumber = counter++;

	public SerialNumbered2(BasicClass basicCLass) {
		super(basicCLass);
		// TODO Auto-generated constructor stub
	}
	
	public long getSerivalNumber() {
		return serialNumber;
	}

}
