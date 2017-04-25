package com.shlg.chuang.generic;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {

	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try {
		    // ArrayStoreException
			fruit[0] = new Fruit();
		} catch(Exception e) {
			System.out.println(e);
		}
		try {
		    // ArrayStoreException
			fruit[0] = new Orange();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		//incompatable
//		List<Fruit> flist = new ArrayList<Apple>();
	}

}
