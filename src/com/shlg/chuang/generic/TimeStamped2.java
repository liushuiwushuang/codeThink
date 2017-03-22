package com.shlg.chuang.generic;

import java.util.Date;

class TimeStamped2 extends Decorator {
	
	private final long timeStamp;

	public TimeStamped2(BasicClass basicCLass) {
		super(basicCLass);
		// TODO Auto-generated constructor stub
		timeStamp = new Date().getTime();
	}
	
	public long getStamp() {
		return timeStamp;
	}

}