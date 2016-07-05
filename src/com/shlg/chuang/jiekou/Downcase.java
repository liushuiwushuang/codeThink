package com.shlg.chuang.jiekou;

class Downcase extends Processor {

	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
