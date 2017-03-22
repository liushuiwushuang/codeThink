package com.shlg.chuang.think5_7_3;

public class Chess extends BoardGame {
    
    static {
        System.out.println("Chess Static");
    }
    
    {
        System.out.println("Chess Normal");
    }

	Integer k = 2;
	
	Chess(int i) {
		super(i);
	}
	
	int getK() {
		return this.k;
	}

	int getSuperK() {
		return super.k;
	}
	
	void check() {
		System.out.println("++ check Chess");
	}
	
	public static void main(String[] args) {
		Chess c = new Chess(0);
		System.out.println("***************");
		System.out.println(c.getK());
		System.out.println("***************");
		System.out.println(c.getSuperK());
		System.out.println("-------------------");
		BoardGame b = new Chess(0);
		b.check();
	}

}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
    
    static {
        System.out.println("BreadGame Static");
    }
    
    {
        System.out.println("BreadGame Normal");
    }
    
	protected Integer k = 1;
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
	
	void check() {
		System.out.println("-- check BoardGame");
	}
}
