package com.shlg.chuang.generic;

import java.util.List;

public class EpicBattle {

	static <POWER extends SuperHearing> 
			void useSuperHearing(SuperHero<POWER> hero) {
		
		hero.getPower().hearSubtleNoises();
	}
	
	static <POWER extends SuperHearing & SuperSmell> 
	void superFind(SuperHero<POWER> hero) {
		hero.getPower().hearSubtleNoises();
		hero.getPower().traceBySmell();
	}
	
	public static void mian(String[] args) {
		DogBoy dogBoy = new DogBoy();
		useSuperHearing(dogBoy);
		superFind(dogBoy);
		List<? extends SuperHearing> audioBoys; 
	}
}
