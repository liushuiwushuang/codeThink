package com.shlg.chuang.generic;

import java.util.ArrayList;

public class Store extends ArrayList<Aisle> {

    private static final long serialVersionUID = 1L;

//    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
//	
//	private Office office = new Office();
	
	public Store(int nAisles, int nShelves, int nProducts) {
		for(int i=0; i < nAisles; i++)
			add(new Aisle(nShelves, nProducts));
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Aisle a: this)
			for(Shelf s: a)
				for(Product p : s) {
					result.append(p);
					result.append("\n");
				}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}
