package com.shlg.chuang.think5_7_3;

public class ExplictStatic {
	
	static {
		System.out.println("*******");
	}
	
	{
		System.out.println("-----");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		System.out.println(Cups.cup1);
	}

}

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
	
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups() {
		System.out.println("Cups()");
	}
}
