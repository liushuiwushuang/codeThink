package com.shlg.chuang.jiekou;

import java.util.Arrays;

class Splitter extends Processor {

	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
