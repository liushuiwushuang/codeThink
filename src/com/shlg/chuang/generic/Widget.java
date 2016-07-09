package com.shlg.chuang.generic;

class Widget {

	public static class Factory implements FactoryI<Widget> {

		@Override
		public Widget create() {
			return new Widget();
		}
		
	}
}
