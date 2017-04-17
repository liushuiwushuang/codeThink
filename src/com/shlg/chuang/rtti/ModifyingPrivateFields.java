package com.shlg.chuang.rtti;

import java.lang.reflect.Field;

public class ModifyingPrivateFields {

    public static void main(String[] args) throws 
            NoSuchFieldException, SecurityException, 
            IllegalArgumentException, IllegalAccessException {
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);
        System.out.println("----------i------------");
        Field i = pf.getClass().getDeclaredField("i");
        i.setAccessible(true);
        System.out.println(i.getInt(pf));
        i.setInt(pf, 47);
        System.out.println(pf);
        
        System.out.println("----------s------------");
        Field s = pf.getClass().getDeclaredField("s");
        s.setAccessible(true);
        System.out.println(s.get(pf));
        s.set(pf, "No, you're not!");
        System.out.println(pf);
        
        System.out.println("----------s2------------");
        Field s2 = pf.getClass().getDeclaredField("s2");
        s2.setAccessible(true);
        System.out.println(s2.get(pf));
        s2.set(pf, "No, you're not!");
        System.out.println(pf);
    }

}

class WithPrivateFinalField {
    
    private int i = 1;
    
    private final String s = "I'm totally safe";
    
    private String s2 = "Am I safe?";
    
    public String toString() {
        return "i = " + i + ", " + s + ", " + s2;
    }
}
