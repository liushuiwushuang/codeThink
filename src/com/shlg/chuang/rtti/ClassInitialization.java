package com.shlg.chuang.rtti;

import java.util.Random;

public class ClassInitialization {
	
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		
		Class<Initable> initable = Initable.class;
		System.out.println("After creating Initable ref");
		
		System.out.println(Initable.staticFinal);  //staticFinal 是编译期常量，所以不会触发类的初始化
		
		System.out.println(Initable.staticFianl2); // staticFinal2的访问将强制进行类的初始化，因为它不是个编译期常量
		
		// 类的初始化在非常数静态域进行首次引用时 才执行
		System.out.println(Initable2.staticNonFinal);
		
		Class<?> initable3 = Class.forName("com.shlg.chuang.rtti.Initable3");
		
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticFinal);
	}

}
