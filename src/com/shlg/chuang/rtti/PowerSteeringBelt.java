package com.shlg.chuang.rtti;

class PowerSteeringBelt extends Belt {
	public static class Factory implements com.shlg.chuang.rtti.Factory<PowerSteeringBelt> {
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
	}
}
