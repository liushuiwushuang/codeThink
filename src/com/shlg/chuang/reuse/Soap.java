package com.shlg.chuang.reuse;

public class Soap {

	private String s;
	Soap() {
		System.out.println("Soap()");
		s = "Contructed";
	}
	public String toString() { return s;}
}
