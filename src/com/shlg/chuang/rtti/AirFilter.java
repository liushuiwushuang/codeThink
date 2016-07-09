package com.shlg.chuang.rtti;

class AirFilter extends Filter {
	
	public static class Factory implements com.shlg.chuang.rtti.Factory<AirFilter> {
		public AirFilter create() {
			return new AirFilter();
		}
	}
}
