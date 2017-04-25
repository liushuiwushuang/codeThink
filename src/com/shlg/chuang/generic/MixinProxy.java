package com.shlg.chuang.generic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

class MixinProxy implements InvocationHandler {
	
	Map<String, Object> delegateByMethod;
	
	public MixinProxy(TwoTuple<?, ?>... pairs) {
		delegateByMethod = new HashMap<String, Object>();
		String methodName = "";
		for(TwoTuple<?, ?> pair: pairs) {
			for(Method method: ((Class<?>) pair.second).getMethods())
				methodName = method.getName();
				if(!delegateByMethod.containsKey(methodName))
					delegateByMethod.put(methodName, pair.first);
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		Object delegate = delegateByMethod.get(methodName);
		return method.invoke(delegate, args);
	}
	
    public static Object newInstance(TwoTuple<?, ?>... pairs) {
		Class<?>[] interfaces = new Class[pairs.length];
		for(int i=0; i < pairs.length; i++) {
			interfaces[i] = (Class<?>)pairs[i].second;
		}
		ClassLoader cl = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
	}

}
