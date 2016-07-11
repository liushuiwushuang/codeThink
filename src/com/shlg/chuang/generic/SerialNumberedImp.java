package com.shlg.chuang.generic;

class SerialNumberedImp implements SerialNumbered {

	private static long counter = 1;
	
	private final long serialNumber = counter++;
	
	@Override
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}

}
