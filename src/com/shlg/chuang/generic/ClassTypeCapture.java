package com.shlg.chuang.generic;

public class ClassTypeCapture<T> {

	Class<T> kind;
	
	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	
	public boolean f(Object arg) {
		return kind.isInstance(arg); // 子类.isInstance父类  返回false
	}
	
	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = 
		        new ClassTypeCapture<>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		
		ClassTypeCapture<House> ctt2 = 
				new ClassTypeCapture<>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
	}
}
