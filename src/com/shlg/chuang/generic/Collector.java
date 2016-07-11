package com.shlg.chuang.generic;

interface Collector<T> extends UnaryFunction<T, T> {
	T result();
}
