package com.shlg.chuang.generic;

public class DynamicProxyMixin {

	public static void main(String[] args) {
		Object mixin = MixinProxy.newInstance(
				Tuple.tuple(new BasicImp(), Basic.class),
				Tuple.tuple(new TimeStampedImp(), TimeStamped.class),
				Tuple.tuple(new SerialNumberedImp(), SerialNumbered.class)
				);
		Basic b = (Basic) mixin;
		TimeStamped t = (TimeStamped) mixin;
		SerialNumbered s = (SerialNumbered) mixin;
		b.set("Hello");
		System.out.println(b.get());
		System.out.println(t.getStamp());
		System.out.println(s.getSerialNumber());
	}

}
