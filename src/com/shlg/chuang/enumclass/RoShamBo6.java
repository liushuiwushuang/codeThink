package com.shlg.chuang.enumclass;

public enum RoShamBo6 implements Competitor<RoShamBo6>{
    
    PAPER, SCISSORS, ROCK;
    
    private static Outcome[][] table = {
                { Outcome.DRAW, Outcome.LOSE, Outcome.WIN },
                { Outcome.WIN, Outcome.DRAW, Outcome.LOSE },
                { Outcome.LOSE, Outcome.WIN, Outcome.DRAW },
            };
    
    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }
    
    public static void main(String[] args) {
        RoShaBo.play(RoShamBo6.class, 5);
    }
}
