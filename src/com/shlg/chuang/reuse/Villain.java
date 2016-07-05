package com.shlg.chuang.reuse;

public class Villain {

	private String name;
	protected void set(String m) { name = m;}
	public Villain(String name) { this.name = name; }
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}
