package com.shlg.chuang.jiekou;

abstract class Instrument {

	private int i;
	
	public abstract void play(Note n);
	
	public String what() {
		return "Instrument";
	}
	
	public abstract void adjust();
	
}
