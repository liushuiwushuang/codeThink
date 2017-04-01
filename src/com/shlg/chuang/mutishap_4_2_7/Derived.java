package com.shlg.chuang.mutishap_4_2_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Derived extends Base{

    public void f() {
        System.out.println("Derived.f()");
    }
    
    @Override
    public void g() {
//        System.out.println(this.getClass());
//        System.out.println(super.getClass());
//        System.out.println(this.getClass().getSuperclass().getName()); // 子类获得父类的名字
//        System.out.println(this.getClass().getSimpleName());
        System.out.println("Derived.g()");
    }
    
    static Integer p;
    static String g;
    public static void main(String[] args) {
        Base b = new Derived();
//        System.out.println(b instanceof Derived);
//        System.out.println(b instanceof Base);
        b.f();
        b.g();
        System.out.println(p);
        System.out.println(g);
        //输出 
        //null
        //null
        
//        System.out.println(p.toString());
//        System.out.println(g.toString());
        // 俩个都出现 NullPointerException
        
        // 出现 ArithmeticException
        int c = 0;
//        System.out.println(1 / c);
        
        // 出现  IndexOutOfBoundsException
        List<Integer> list = new ArrayList<>();
//        System.out.println(list.get(0));
        
        // 出现 ClassCastException
//        @SuppressWarnings("unchecked")
//        List<Integer> li= (List<Integer>) new HashMap<String, Object>();
//        System.out.println(li);
        
        // 移位
//        int i = -4;
//        System.out.println("------int--->: " + i);
//        System.out.println("移位前: " + Integer.toBinaryString(i));
//        i >>>= 1;
//        System.out.println("移位后： " + Integer.toBinaryString(i));
//        System.out.println("------int--->: " + i);
    }
}

class Base {
    
    public Base() {
        g();
    }
    
    public void f() {
        System.out.println("Base.f()");
    }
    
    void g() {
        System.out.println("Base.g()");
    }
    
}
