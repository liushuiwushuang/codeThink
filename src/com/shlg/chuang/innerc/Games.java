package com.shlg.chuang.innerc;

public class Games {
	
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while(s.move())
			;
	}

	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}

}
