package com.shlg.chuang.rtti;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		try {
		    Class c = Gum.class;
		    c.newInstance();
		    new Gum();
		    Class.forName("com.shlg.chuang.rtti.Gum");
			Class.forName("com.shlg.chuang.rtti.Gum").newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			System.out.println("Couldn't find Gum");
		}
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
