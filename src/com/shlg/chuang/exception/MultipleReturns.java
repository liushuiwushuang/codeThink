package com.shlg.chuang.exception;

public class MultipleReturns {

	public static int  f(int i) {
		System.out.println("Initialization that requires cleanup");
		try {
			System.out.println("Point 1");
			if(i == 1){
				System.out.println("内置的 7");
				return 7;
			}	
			return 9;
		} finally {
			
			System.out.println("fianlly");
			
		}
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=2; i++)
			System.out.println(f(i));
	}
}
