package com.shlg.chuang.collection_17_09;

import java.util.BitSet;
import java.util.Random;

public class Bits implements Cloneable {
    
    public static void printBitSet(BitSet b) {
        System.out.println("bits: " + b);
        StringBuilder bbits = new StringBuilder();
        for (int j = 0; j < b.size(); j++)
            bbits.append(b.get(j) ? "1" : "0");
        System.out.println("bit pattern: " + bbits);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        byte bt = (byte) rand.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--)
            if (((1 << i) & bt) != 0)
                bb.set(i);
            else
                bb.clear(i);
        System.out.println("byte value: " + bt);
        printBitSet(bb);
        
        short st = (short) rand.nextInt();
        BitSet bs = new BitSet();
        for (int i = 15; i >= 0; i--)
            if (((i << i) & st) != 0)
                bs.set(i);
            else
                bs.clear(i);
        System.out.println("short value: " + st);
        printBitSet(bs);
        
        int it = rand.nextInt();
        BitSet bi = new BitSet();
        for (int i = 31; i >= 0; i--)
            if (((1 << i) & it) != 0)
                bi.set(i);
            else 
                bi.clear(i);
        System.out.println("int value: " + it);
        printBitSet(bi);
        
        // Test bitsets >= 64 bits;
        BitSet b127 = new BitSet();
        b127.set(127);
        System.out.println("set bit 127: " + b127);
        BitSet b255 = new BitSet();
        b255.set(255);
        System.out.println("set bit 255: " + b255) ;
        BitSet b1023 = new BitSet(512);
        b1023.set(1023);
        b1023.set(1024);
        System.out.println("set bit 1023: " + b1023);
//        Bits bits = new Bits();
//        try {
        //      没有实现 Cloneable的话会抛出 CloneNotSupportedException
//            Bits bits2 = (Bits) bits.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }

}