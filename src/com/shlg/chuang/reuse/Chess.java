package com.shlg.chuang.reuse;

public class Chess extends BoardGame {

	Chess() {
		super(11);
		System.out.println("Chess contructor");
	}
	
	public static void main(String[] args) {
		Chess x  = new Chess();
		System.out.println(x);
	}

}
