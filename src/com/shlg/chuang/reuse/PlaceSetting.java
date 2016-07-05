package com.shlg.chuang.reuse;

public class PlaceSetting extends Custom {
	
	private Spoon sp;
	
	private Fork fork;
	
	private Knife kn;
	
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i+1);
		sp = new Spoon(i + 2);
		fork = new Fork(i +3);
		kn = new Knife(i +4);
		pl = new DinnerPlate(i +5);
		System.out.println("PlaceSetting constructor");
	}
	
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
		System.out.println(x);
	}

}
