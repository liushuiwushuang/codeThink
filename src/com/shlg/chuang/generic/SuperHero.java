package com.shlg.chuang.generic;

class SuperHero<POWER extends SuperPower> {

	POWER power;
	SuperHero(POWER power) {
		this.power = power;
	}
	
	POWER getPower() {
		return power;
	}
}
