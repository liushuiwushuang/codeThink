package com.shlg.chuang.generic;

import java.util.ArrayList;

class FilledList<T> extends ArrayList<T> {

	public FilledList(Class<? extends T> type, int size) {
		try {
			for(int i=0; i<size; i++)
				add(type.newInstance());
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
