package com.shlg.chuang.rtti;

public class GenericClassReferencees {

	public static void main(String[] args) {
		
		Class<? extends Number> intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		intClass = Number.class;
	}

}
