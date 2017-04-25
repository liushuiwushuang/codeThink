package com.shlg.chuang.generic;

public class PrimitiveGenericTest {

	public static void main(String[] args) {
	    String[] strings = FArray.fill(new String[7], new Generator<String>() {

            @Override
            public String next() {
                return "10";
            }
        });
	    for (String s : strings)
	        System.out.print(s + " ");
	    System.out.println();
	    Integer[] integers = FArray.fill(new Integer[7], new Generator<Integer>() {

            @Override
            public Integer next() {
                return 0;
            }
	        
	    });
	    for (Integer i : integers)
            System.out.print(i + " ");
        System.out.println();
	    String[] b = FArray.fill(new String[7], new RandomGenerator.String(10));
	    for (String s : b)
            System.out.print(s + " ");
        System.out.println();
	}

}
