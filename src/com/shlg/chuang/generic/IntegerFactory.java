package com.shlg.chuang.generic;

class IntegerFactory implements FactoryI<Integer> {

	@Override
	public Integer create() {
		return new Integer(0);
	}

}
