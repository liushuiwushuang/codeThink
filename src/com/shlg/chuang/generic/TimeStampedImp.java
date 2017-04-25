package com.shlg.chuang.generic;

import java.util.Date;

class TimeStampedImp implements TimeStamped {

	private final long timeStamp;
	
	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}
	
	@Override
	public long getStamp() {
		return timeStamp;
	}

}
