package com.shlg.chuang.rtti;

class CabinAirFilter extends Filter {
	
	public static class Factory implements com.shlg.chuang.rtti.Factory<CabinAirFilter> {
		public CabinAirFilter create() {
			return new CabinAirFilter();
		}
	}
}
