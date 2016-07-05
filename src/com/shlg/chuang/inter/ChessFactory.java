package com.shlg.chuang.inter;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}

}
