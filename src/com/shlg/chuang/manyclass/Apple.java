package com.shlg.chuang.manyclass;

public class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
