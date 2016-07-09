package com.shlg.chuang.generic;

public class Fibeonacci implements Generator<Integer> {

	private int count = 0;
	
	@Override
	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if(n<2) return 1;
		return fib(n-2) + fib(n-1);
	}

	public static void main(String[] args) {
		Fibeonacci gen = new Fibeonacci();
		for(int i=0; i<18; i++)
			System.out.print(gen.next()+ " ");
	}

}
