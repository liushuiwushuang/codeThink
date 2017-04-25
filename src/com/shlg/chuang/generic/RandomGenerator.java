package com.shlg.chuang.generic;

import java.util.Random;

public class RandomGenerator {

    public static class String implements Generator<java.lang.String>{
        
        Random random = new Random(47);
        
        private int n = 0;
        
        public String(int n) {
            this.n = n;
        }

        @Override
        public java.lang.String next() {
            return java.lang.String.valueOf((char) ('a' + random.nextInt(n) ));
        }

    }
}
