package com.shlg.chuang.innerc;

abstract class Base {
	public Base(int i) {
		System.out.println("Base consructor, i = " + i);
	}
	public abstract void f();
}
