package com.shlg.chuang.generic;

interface Combiner<T> {
	T combine(T x, T y);
}
