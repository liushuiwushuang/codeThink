package com.shlg.chuang.generic;

import java.util.Collection;

class AddableCollectionAdapter<T> implements Addable<T> {
	
	private Collection<T> c;
	
	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		c.add(item);
	}

}
