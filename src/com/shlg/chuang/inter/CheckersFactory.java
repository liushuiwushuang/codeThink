package com.shlg.chuang.inter;

public class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Checkers();
	}

}
