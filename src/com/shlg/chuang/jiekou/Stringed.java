package com.shlg.chuang.jiekou;

public class Stringed extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Stringed.play() "+n);
	}
	
	public String what() {
		return "Stringed";
	}

	@Override
	public void adjust() {
		
	}

}
