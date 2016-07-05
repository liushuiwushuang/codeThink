package com.shlg.chuang.jiekou;

public class Music4 {
	
	static void tune(Instrument i) {
		i.play(Note.C);
	}

	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(), new Percussion(),
				new Stringed(), new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}

}
