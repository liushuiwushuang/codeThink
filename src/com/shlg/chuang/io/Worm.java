package com.shlg.chuang.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class Worm implements Serializable{

    private static final long serialVersionUID = 1L;

    private static Random rand = new Random(47);
    
    private Data[] d =  {
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))
        };
    
    private Worm next;
    
    private char c;
    
    // Value of i == number of segments
    public Worm(int i, char x) {
        System.out.println("Worm constructor: " + i);
        c = x;
        if (--i > 0)
            next = new Worm(i, (char) (x + 1));
    }
    
    public Worm() {
        System.out.println("Default constructor");
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data dat : d)
            result.append(dat);
        result.append(")");
        if (next != null)
            result.append(next);
        return result.toString();
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Worm w = new Worm(6, 'a');
        System.out.println("w = " + w);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("worm.out"));
        out.writeObject(w);
        out.close(); // Also flushes output
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("worm.out"));
//        String s = in.readObject().toString();
        Worm w2 = (Worm) in.readObject();  // 不能读俩次
        System.out.println(" w2 = " + w2);
        in.close();
        
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out2 = new ObjectOutputStream(bout);
        String s1 = "Worm storage\n";
        out2.writeObject(s1);
        out2.writeObject(w);
        out2.flush();
        
        ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
        String s = (String) in2.readObject();
        System.out.println(s);
        Worm w3 = (Worm) in2.readObject();
        System.out.println(s + " w3 = " + w3);
    }

}

class Data implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int n;
    
    public Data(int n) {
        this.n = n;
    }
    
    public String toString() {
        return Integer.toString(n);
    }
    
}
