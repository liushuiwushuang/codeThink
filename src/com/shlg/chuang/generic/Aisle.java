package com.shlg.chuang.generic;

import java.util.ArrayList;

public class Aisle extends ArrayList<Shelf> {

    private static final long serialVersionUID = 1L;

    public Aisle(int nShelves, int nProducts) {
		for(int i = 0; i < nShelves; i++)
			add(new Shelf(nProducts));
	}
}
