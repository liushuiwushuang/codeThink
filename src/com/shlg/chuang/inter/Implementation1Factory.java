package com.shlg.chuang.inter;

class Implementation1Factory implements ServiceFactory {

	@Override
	public Service getService() {
		return new Implemenation1();
	}

}
