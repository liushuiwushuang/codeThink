package com.shlg.chuang.rtti;

class GeneratorBelt extends Belt {
	public static class Factory implements com.shlg.chuang.rtti.Factory<GeneratorBelt> {
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}
