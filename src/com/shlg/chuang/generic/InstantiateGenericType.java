package com.shlg.chuang.generic;

public class InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe =
				new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = 
					new ClassAsFactory<Integer>(Integer.class);
		} catch(Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}

}
