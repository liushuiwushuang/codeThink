package com.shlg.chuang.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4939328964786114816L;

	public ReversibleArrayList(Collection<T> c) { 
		super(c); 
	}
	
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
			
		};
	}
	
}
