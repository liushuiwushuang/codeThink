package com.shlg.chuang.generic;

class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
	
	private TimeStamped timeStamp = new TimeStampedImp();
	
	private SerialNumbered serialNumber = new SerialNumberedImp();

	@Override
	public long getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber.getSerialNumber();
	}

	@Override
	public long getStamp() {
		// TODO Auto-generated method stub
		return timeStamp.getStamp();
	}

}
