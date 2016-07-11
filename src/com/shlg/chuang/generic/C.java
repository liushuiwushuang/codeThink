package com.shlg.chuang.generic;

class C extends SelfBounded<C>{

	C setAndGet(C arg) {
		set(arg);
		return get();
	}
}
