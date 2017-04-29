package com.shlg.chuang.enumclass;

public enum RoShamBo3 implements Competitor<RoShamBo3>{

    PAPER {
        public Outcome compete(RoShamBo3 it) {
            switch (it) {
                default :
                case PAPER : return Outcome.DRAW;
                case SICSSORS : return Outcome.LOSE;
                case ROCK : return Outcome.WIN;
            }
        }
    }, 
    SICSSORS {
        public Outcome compete(RoShamBo3 it) {
            switch (it) {
                default :
                case PAPER : return Outcome.WIN;
                case SICSSORS : return Outcome.DRAW;
                case ROCK : return Outcome.LOSE;
            }
        }
    }, 
    ROCK {
        public Outcome compete(RoShamBo3 it) {
            switch (it) {
                default :
                case PAPER : return Outcome.LOSE;
                case SICSSORS : return Outcome.WIN;
                case ROCK : return Outcome.DRAW;
            }
        }
    };

    public abstract Outcome compete(RoShamBo3 it);

    public static void main(String[] args) {
        RoShaBo.play(RoShamBo3.class, 5);
    }
}
