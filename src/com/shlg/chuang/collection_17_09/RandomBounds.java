package com.shlg.chuang.collection_17_09;

public class RandomBounds {
    
    static void usage() {
        System.out.println("Usage:");
        System.out.println("\tRamdomBounds lower");
        System.out.println("\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        String[] s = { "lower" };
        if (s.length != 1) usage();
        double d = 0;
        if (s[0].equals("lower")) {
            while ((d = Math.random()) != 0.0)
                System.out.println(d);
                ; // keep trying
            System.out.println("Produced 0.0!");
        } else if (s[0].equals("upper")) {
            while (Math.random() != 1.0)
                ; // keep trying
            System.out.println("Produced 1.0!");
        } else
            usage();
    }

}
