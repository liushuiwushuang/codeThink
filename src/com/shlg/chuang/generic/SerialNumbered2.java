package com.shlg.chuang.generic;

class SerialNumbered2 extends Decorator {
	
	private static long counter = 1;
	
	private final long serialNumber = counter++;

	public SerialNumbered2(BasicClass basicCLass) {
		super(basicCLass);
	}
	
	public long getSerivalNumber() {
		return serialNumber;
	}

}
