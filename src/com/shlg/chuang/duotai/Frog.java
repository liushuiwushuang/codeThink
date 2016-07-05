package com.shlg.chuang.duotai;

public class Frog extends Amphibian {

	private Characteristic p = new Characteristic("Croaks");
	
	private Description t = new Description("Eats Bugs");
	
	public Frog() {
		System.out.println("Frog()");
	}
	
	protected void dispose() {
		System.out.println("Frog dispose()");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args ){
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}
}
