package com.shlg.chuang.rtti;

class AnonymousA {
	
	public static A makeA() {
		return new A() {
			public void f() {
				System.out.println("public C.f()");
			}
			public void g() {
				System.out.println("public C.g()");
			}
			protected void u() {
				System.out.println("package C.u()");
			}
			private void w() {
				System.out.println("private C.w()");
			}
		};
	}
}
