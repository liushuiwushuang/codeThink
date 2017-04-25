package com.shlg.chuang.collection_17_09;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class References {
    
    private static ReferenceQueue<VeryBig> referenceQueue = new ReferenceQueue<>();
    
    public static void checkQueue() {
        Reference<? extends VeryBig> reference = referenceQueue.poll();
        if (reference != null)
            System.out.println("In queue: " + reference.get());
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int size = 10;
        if (args.length > 0)
            size = new Integer(args[0]);
        LinkedList<SoftReference<VeryBig>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            sa.add(new SoftReference<VeryBig>(new VeryBig("Soft " + i), referenceQueue));
            System.out.println("Just created: " + sa.getLast());
            checkQueue();
        }
        LinkedList<WeakReference<VeryBig>> wa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            wa.add(new WeakReference<VeryBig>(new VeryBig("Weak " + i), referenceQueue));
            System.out.println("Just created: " + wa.getLast());
            checkQueue();
        }
        SoftReference<VeryBig> s = new SoftReference<VeryBig>(new VeryBig("Soft"));
        WeakReference<VeryBig> w = new WeakReference<VeryBig>(new VeryBig("Weak"));
        System.gc();
        LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<>();
        for (int i = 0; i < size; i ++) {
            pa.add(new PhantomReference<VeryBig>(new VeryBig("Phantom " + i), referenceQueue));
            System.out.println("Just created: " + pa.getLast());
            checkQueue();
        }
    }

}

 class VeryBig {
     
     private static final int SIZE = 10000;
     
     @SuppressWarnings("unused")
    private long[] la = new long[SIZE];
     
     private String ident;
     
     public VeryBig(String id) {
         ident = id;
     }
     
     @Override
     public String toString() {
         return ident;
     }
     
     @Override
     protected void finalize() {
         System.out.println("Finalizing " + ident);
     }
     
 }
