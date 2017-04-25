package com.shlg.chuang.generic;

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
	
	private TimeStamped timeStamp = new TimeStampedImp();
	
	private SerialNumbered serialNumber = new SerialNumberedImp();

	@Override
	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}

	@Override
	public long getStamp() {
		return timeStamp.getStamp();
	}

}
