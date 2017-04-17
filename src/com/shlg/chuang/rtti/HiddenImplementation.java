package com.shlg.chuang.rtti;

import java.lang.reflect.Method;

public class HiddenImplementation {
    
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}
