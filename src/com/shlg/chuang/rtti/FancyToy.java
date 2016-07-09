package com.shlg.chuang.rtti;

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy() {
		super(1);
	}

	public String yo() {
		System.out.println("ooo");
		return "真爱";
	}
}
