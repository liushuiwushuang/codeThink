package com.shlg.chuang.innerc;

class Implementation1 implements Service {

	private Implementation1() {

	}
	
	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}
	
	public static ServiceFactory factory = 
			new ServiceFactory() {

				@Override
				public Service getService() {
					return new Implementation1();
				}
				
			};

}
