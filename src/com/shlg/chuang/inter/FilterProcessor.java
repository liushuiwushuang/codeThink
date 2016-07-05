package com.shlg.chuang.inter;

import com.shlg.chuang.jiekou.BandPass;
import com.shlg.chuang.jiekou.HighPass;
import com.shlg.chuang.jiekou.LowPass;
import com.shlg.chuang.jiekou.Waveform;

public class FilterProcessor {

	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}

}
