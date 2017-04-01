package com.shlg.chuang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToStringArray {
    
    class A implements Cloneable {  
        public String name;  
      
        public Object clone() {
            A o = null;  
            try {  
                o = (A) super.clone();  
            } catch (CloneNotSupportedException e) {  
                e.printStackTrace();  
            }  
            return o;  
        }  
      
    }  
    
    public static void changeInteger(Integer i) {
     // 测试 说明计算是在栈中运行的。最后把值给左边
        i = i * 2;
    }
    
    private void testInteger() {
        
        Integer q = new Integer(1);
        System.out.println(q);
        changeInteger(q);
        System.out.println(q);
        
        A a1=new A();  
        A a2=new A();  
        a1.name="a1";  
        a2 = (A) a1.clone();
        a2.name="a2";  
        System.out.println("a1.name="+a1.name);  
        System.out.println("a2.name="+a2.name);  
    }

    public static void main(String[] args) {
        
        new ListToStringArray().testInteger();;
        
        // Array 转 List
        String[] user = {"aa", "bb", "cc" };
        List<String> userList = new ArrayList<String>();
        Collections.addAll(userList, user);
        
        //Arrays.asList()返回一个受指定数组支持的固定大小的列表。
        //所以不能做Add、Remove等操作。
        userList = Arrays.asList(user);
        //如果想进行Add、Remove 需要
        userList = new ArrayList<>(Arrays.asList(user));
        
        
        /*
         * List 转 Array
         */
        List<String> strList = new ArrayList<String>();
        strList.add("aa");
        strList.add("bb");
        Object[] objs = strList.toArray();
        System.out.println(objs);
        
        // 如果要变成String数组，需要强转类型。
        /*
         * 当直接String[] tt =(String[]) list.toArray()时，运行报错。
         * 是因为java中的强制类型转换只是针对单个对象的，
         * 想要偷懒将整个数组转换成另外一种类型的数组是不行的，
         * 这和数组初始化时需要一个个来也是类似的。 
         */
        String[] strs = (String[]) strList.toArray(new String[0]);
        System.out.println(strs);
        //也可以指定大小：
        strs = strList.toArray(new String[strList.size()]);
        System.out.println(strs);
        
        strs = strList.toArray(strs);
        System.out.println(strs);
        
        // list to array
        Collections.addAll(userList, user);
        userList = new ArrayList<>(Arrays.asList(user));
        
        // array to list
        String[] strings = (String[]) userList.toArray(new String[0]);
        for (String s : strings) {
            System.out.println(s);
        }
        
//        String[] ai = {"1", "2"};
        System.out.println(Math.round(-1.6));
        
        /*
         * 当多线程并发访问一个 哈希表时，需要在外部进行同步操作，否则会引发数据不同步问题。
         * 你可以选择加锁，也可以考虑用 Collections.synchronizedMap 包一层，变成个线程安全的 Map
         */
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
        System.out.println(map.toString());
    }

}
