package com.shlg.chuang.generic;

public class BasicGenerator<T> implements Generator<T> {

	private Class<T> type;
	
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		try {
			return type.newInstance();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}

}
