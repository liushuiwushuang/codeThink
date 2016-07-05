package com.shlg.chuang.manyclass;

public class WaterSource {

	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Contructed";
	}
	
	public String toString() {return s; }
}
