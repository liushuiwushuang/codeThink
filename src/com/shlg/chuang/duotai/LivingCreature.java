package com.shlg.chuang.duotai;

public class LivingCreature {

	private Characteristic p = new Characteristic("is alive");
	
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	
	protected void dispose() {
		System.out.println("LivingCreate dispose");
		t.dispose();
		p.dispose();
	}
}
