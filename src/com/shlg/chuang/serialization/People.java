package com.shlg.chuang.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class People implements Serializable{

    private static final long serialVersionUID = 7813019194670394783L;
    
    private String name;
    
    private int age;
    
    public People() {
        this.name = "lili";
        this.age = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
//        Externalizable
//        HashMap
//        Hashtable
//        Vector
//        SortedSet
//        AbstractList
//        ArrayList
//        TreeMap
//        LinkedHashMap
//        Iterator
        Map map = new HashMap();
//        System.out.println(map.get("1"));
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
            pl = (People) objectInputStream.readObject();
//            p = (People) objectInputStream.readObject();
            System.out.println("name:" + pl.getName());
            System.out.println("age:" + pl.getAge());
         // 反序列化得到的对象与原来的不一样
            System.out.println(pl == p);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
