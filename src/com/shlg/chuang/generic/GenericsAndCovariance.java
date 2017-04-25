package com.shlg.chuang.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {

	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Apple>();
		flist.add(null);
		Fruit f = flist.get(0);
		System.out.println(f);
	}

}
