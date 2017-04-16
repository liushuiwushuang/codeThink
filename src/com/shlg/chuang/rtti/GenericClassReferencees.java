package com.shlg.chuang.rtti;

public class GenericClassReferencees {

	public static void main(String[] args) throws Exception {
		
		Class<? extends Number> intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		intClass = Number.class;
//		Number num = intClass.newInstance();
//		System.out.println(num);
//		Integer i = genericIntClass.newInstance();
//		System.out.println(i);
	}

}
