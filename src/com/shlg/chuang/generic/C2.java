package com.shlg.chuang.generic;

class C2 extends NotSelfBounded<C2>{

	C2 setAndGet(C2 arg) {
		set(arg);
		return get();
	}
}
