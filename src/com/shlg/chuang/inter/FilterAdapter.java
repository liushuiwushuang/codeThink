package com.shlg.chuang.inter;

import com.shlg.chuang.jiekou.Filter;
import com.shlg.chuang.jiekou.Waveform;

public class FilterAdapter implements Processor {

	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}

}
