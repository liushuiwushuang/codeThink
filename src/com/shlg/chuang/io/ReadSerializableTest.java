package com.shlg.chuang.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerializableTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        People pl;
        try {
            FileInputStream fileInputStream = new FileInputStream("E:/Users/study_workspace/codeThink/people.out");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object pl= objectInputStream.readObject();
            System.out.println(pl.getClass());
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
