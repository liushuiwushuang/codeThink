package com.shlg.chuang.generic;

class CanineHero<POWER extends SuperHearing &SuperSmell> extends SuperHero<POWER> {

	CanineHero(POWER power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
	
	void hear() {
		power.hearSubtleNoises();
	}
	
	void smell() {
		power.traceBySmell();
	}
	

}
