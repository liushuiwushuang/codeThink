package com.shlg.chuang.generic;

import java.util.ArrayList;

class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}
