package com.shlg.chuang.generic;

class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T> {
	public void add(T item) {
		super.add(item);
	}
}
