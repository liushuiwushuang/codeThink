package com.shlg.chuang.generic;

class Teller {
	
	private static long counter = 1;
	
	private final long id = counter++;
	
	private Teller() {
		
	}
	
	@Override
	public String toString() {
		return "Teller " + id;
	}
	
	public static Generator<Teller> generator = 
			new Generator<Teller> () {
		public Teller next() {
			return new Teller();
		}
	};
}
