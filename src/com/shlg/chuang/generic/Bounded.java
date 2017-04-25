package com.shlg.chuang.generic;

import java.awt.Color;

class Bounded extends Dimension implements HasColor, Weight {

	@Override
	public int weight() {
		return 0;
	}

	@Override
	public Color getColor() {
		return null;
	}

}
