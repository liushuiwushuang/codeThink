package com.shlg.chuang.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class People implements Serializable{

    private static final long serialVersionUID = 7813019194670394783L;
    
    private transient String name;
    
    private int age;
    
    public People() {
        this.name = "lili";
        this.age = 20;
    }

    public static void main(String[] args) {
        // Externalizable
        People p = new People();
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.out");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(p);
            objectOutputStream.close();
        } catch (Exception e) {
            
        }
        People pl;
        try {
            FileInputStream fileInputStream = new FileInputStream("people.out");
            objectInputStream = new ObjectInputStream(fileInputStream);
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("people.out"));
            pl = (People) objectInputStream.readObject();
            p = (People) ois2.readObject();
            System.out.println("name:" + pl.name);
            System.out.println("age:" + pl.age);
         // 反序列化得到的对象与原来的不一样
            System.out.println(pl == p);
            objectInputStream.close();
            ois2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
