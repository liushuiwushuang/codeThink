package com.shlg.chuang.test;

import com.shlg.chuang.sigle.A;

public class StringTest {

	private String name;
	
	private String psw;
	
	public void swap(String name, String psw) {
		String sw;
		sw = name;
		name = psw;
		psw = sw;
	}
	
	StringTest(String name, String psw) {
		this.name = name;
		this.psw = psw;
		System.out.println("new");
	}
	
	A st = new A();
	
	public static void main(String[] args) {
		StringTest strO = new StringTest("shlg","111");
		strO.swap(strO.name, strO.psw);
		System.out.println(strO.name +" "+ strO.psw);
	}
}
