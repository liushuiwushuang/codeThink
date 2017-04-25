package com.shlg.chuang.generic;

public class Wildcards {

	static void rawArgs(Holder holder, Object arg) {
		Object obj = holder.get();
	}
	
	static void unboundedArg(Holder<?> holder, Object arg) {
		Object obj = holder.get();
	}
	
	static <T> T exact1(Holder<T> holder) {
		T t = holder.get();
		return t;
	}
	
	static <T> T exact2(Holder<T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	
	static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
		T t = holder.get();
		return t;
	}
	
	static <T> void wildSupertype(Holder<? super T> holder, T arg) {
		holder.set(arg);
		Object obj = holder.get();
	}
	
	public static void main(String[] args) {
		
//		raw = new Holder();
		Holder raw = new Holder<Long>();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		
		Long lng = 1L;
		
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
		// Warnings: Unchecked conversion from Holder to Holder<T>
		//            Unchecked method invocation
//		Object r1 = exact1(raw); 
		Long r2 = exact1(qualified);
		Object r3 = exact1(unbounded);
		Long r4 = exact1(bounded);
		
//		Long r5 = exact2(raw, lng);   // Warnings
		Long r6 = exact2(qualified, lng);
//		Long r7 = exact2(unbounded, lng);   // Error
//		Long r8 = exact2(bounded, lng);     // Error
		
//		Long r9 = wildSubtype(raw, lng);   // Warning
		Long r10 = wildSubtype(qualified, lng);
		Object r11 = wildSubtype(unbounded, lng);
		Long r12 = wildSubtype(bounded, lng);
		
//		wildSupertype(raw, lng);    // Warnings
		wildSupertype(qualified, lng);
//		wildSupertype(unbounded, lng);  // Error
//		wildSupertype(bounded, lng);    // Error
		
	}
}
