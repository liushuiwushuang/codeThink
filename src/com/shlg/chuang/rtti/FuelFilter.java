package com.shlg.chuang.rtti;

class FuelFilter  extends Filter {
	
	public static class Factory implements com.shlg.chuang.rtti.Factory<FuelFilter> {
		public FuelFilter create() {
			return new FuelFilter() ;
		}
	}
}
