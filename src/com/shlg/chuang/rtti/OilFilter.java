package com.shlg.chuang.rtti;

class OilFilter extends Filter {

	public static class Factory implements com.shlg.chuang.rtti.Factory<OilFilter> {
		public OilFilter create() {
			return new OilFilter();
		}
	}
}
