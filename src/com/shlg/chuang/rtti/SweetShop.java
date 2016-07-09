package com.shlg.chuang.rtti;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		try {
			Class.forName("com.shlg.chuang.rtti.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		new Cookie();
	}

}
