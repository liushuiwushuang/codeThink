package com.shlg.chuang.generic;

public class InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe =
				new ClassAsFactory<>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded： " + fe);
		try {
			ClassAsFactory<Integer> fi = 
					new ClassAsFactory<>(Integer.class);
			System.out.println("ClassAsFactory<Integer> succeeded：" + fi);
		} catch(Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
		
	}

}
