package com.shlg.chuang.generic;

import java.util.ArrayList;

class Shelf extends ArrayList<Product> {
    private static final long serialVersionUID = 1L;

    public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}
