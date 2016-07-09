package com.shlg.chuang.rtti;

import java.lang.reflect.Method;

public class HiddenImplementation {

	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}
