package com.shlg.chuang.jiekou;

public class Wind extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Wind.play() "+n);
	}

	public String what() {
		return "Wind";
	}
	
	@Override
	public void adjust() {
		
	}

}
