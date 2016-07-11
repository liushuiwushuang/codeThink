package com.shlg.chuang.generic;

class Decoration {

	public static void main(String[] args) {
		TimeStamped2 t = new TimeStamped2(new BasicClass());
		TimeStamped2 t2 = new TimeStamped2(new SerialNumbered2(new BasicClass()));
		
		SerialNumbered2 s = new SerialNumbered2(new BasicClass());
		SerialNumbered2 s2 = new SerialNumbered2(new TimeStamped2(new BasicClass()));
	}

}
