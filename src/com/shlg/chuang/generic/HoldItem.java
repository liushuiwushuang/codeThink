package com.shlg.chuang.generic;

class HoldItem<T> {

	T item;
	
	HoldItem(T item) { this.item = item; }
	
	T getItem() {
		return item;
	}
}
