package com.shlg.chuang.rtti;

class FanBelt extends Belt {
	
	public static class Factory implements com.shlg.chuang.rtti.Factory<FanBelt> {
		public FanBelt create() {
			return new FanBelt();
		}
	}
}
