package com.shlg.chuang.jiekou;

class Upcase extends Processor {

	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
