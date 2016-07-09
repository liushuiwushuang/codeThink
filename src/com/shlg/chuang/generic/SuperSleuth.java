package com.shlg.chuang.generic;

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {

	SuperSleuth(POWER power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
	
	void see() {
		power.seeThroughWalls();
	}

}
