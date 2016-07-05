package com.shlg.chuang;

public class HelloData2 {

	
	static void f(HelloData y) {
		y.c = 'z';
	}
	static void f(String str) {
		
	}
	public static void main(String[] args) {
		
		HelloData h = new HelloData();
		int i=0;
		for(; i<10; i++ ){
			if(i==5)continue;
			System.out.println(i);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		switch (i) {
			case 7 : System.out.println(7); break;
			case 8 : System.out.println(8); break;
			
			
			default :System.out.println(10);
			case 10 :System.out.println(1); break;
		}
//		System.out.println(i);
		h.c = 'a';
		f(h);
		System.out.println(h.c);
	}

}

