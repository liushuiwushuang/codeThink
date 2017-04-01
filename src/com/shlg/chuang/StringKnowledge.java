package com.shlg.chuang;

import java.util.HashMap;
import java.util.Hashtable;

import com.shlg.chuang.other.OtherPackageHello;

/*
 * 内存分配，以及 == equals 关系
 */
public class StringKnowledge {
    
    private String c = new String("abc");
   
    private String d = new String("abc");
    
    private void apartEqualsOrCharEqual() {
        String a = "abc";
        String b = "abc";
        
        String d = new String("abc");
        String e = new String("abc");
        
        Integer ai = 7;
        Integer bi = 7;
        
//        Object
        char[] cha = {'a', 'b', 'c'};
        d.equals(cha); // false
        
//        StringTokenizer
//        StringBuffer
//        String
        
//        Throwable
//        Exception
//        RuntimeException
//        Error
        
//        InputStream
//        FilterInputStream
//        BufferedInputStream
        
//        Reader
        int op = 100;
        Integer up = 100;
        Integer upk = new Integer(100);
        System.out.println(op == up);
        System.out.println(up == op);
        System.out.println(up == upk);
        System.out.println(op == upk);
        
        Integer ci = new Integer(7);
        Integer di = new Integer(7);
        
        StringKnowledge s = new StringKnowledge();
        
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        System.out.println("-----------------------");
        System.out.println(s.c == s.d);
        System.out.println(s.c.equals(s.d));

        System.out.println("++++++++++++++++++++++++");
        System.out.println(d == e);
        System.out.println(d.equals(e));

        System.out.println("iiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println(ai == bi);
        System.out.println(ai.equals(bi));
        
        System.out.println("newinewinewinewinewinewi");
        System.out.println(ci == di);
        System.out.println(ci.equals(di));
        
        ai = 8;
        System.out.println(ai == bi);
    }

    /*
     * 结果分析：
     * 1.i和i0均是普通类型(int)的变量，所以数据直接存储在栈中，而栈有一个很重要的特性：栈中的数据可以共享。
     *      当我们定义了int i = 40;，再定义int i0 = 40;这时候会自动检查栈中是否有40这个数据，
     *      如果有，i0会直接指向i的40，不会再添加一个新的40。
     * 2.i1和i2均是引用类型，在栈中存储指针，因为Integer是包装类。由于Integer包装类实现了常量池技术，
     *      因此i1、i2的40均是从常量池中获取的，均指向同一个地址，因此i1=12。
     * 3.很明显这是一个加法运算，Java的数学运算都是在栈中进行的，Java会自动对i1、i2进行拆箱操作转化成整型，因此i1在数值上等于i2+i3。
     * 4.i4和i5均是引用类型，在栈中存储指针，因为Integer是包装类。但是由于他们各自都是new出来的，因此不再从常量池寻找数据，而是从堆中各自new一个对象，
     *      然后各自保存指向对象的指针，所以i4和i5不相等，因为他们所存指针不同，所指向对象不同。   
     * 5.这也是一个加法运算，和3同理。
     * 6.d1和d2均是引用类型，在栈中存储指针，因为Double是包装类。但Double包装类没有实现常量池技术，因此Doubled1=1.0;
     *      相当于Double d1=new Double(1.0);，是从堆new一个对象，d2同理。因此d1和d2存放的指针不同，指向的对象不同，所以不相等
     */
    private void objPoolTest() {
        int i = 40;
        int i0 = 40;
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        Double d1=1.0;
        Double d2=1.0;
        
        Integer i7 = 400;
        Integer i8 = 400;
        System.out.println(i7 == i8);
        
        System.out.println("i=i0\t" + (i == i0));
        System.out.println("i1=i2\t" + (i1 == i2));
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
        System.out.println("i4=i5\t" + (i4 == i5));
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));    
        System.out.println("d1=d2\t" + (d1==d2)); 
        
        System.out.println();        
    }
    
    static String pl = "Hello";
    private void addString() {
        String hello = "Hello", lo = "lo";
        
        System.out.println(pl == hello);
        System.out.print((hello == "Hello") + " ");
        
        // 在同包不同类下,引用自同一String对象.
        System.out.print((Other.hello == hello) + " ");
        
        // 在不同包不同类下,依然引用自同一String对象
        System.out.print((OtherPackageHello.hello == hello) + " ");
        
        // 编译时在编译成.class时能够识别为同一字符串的,自动优化成常量,所以也引用自同
        System.out.print((hello == ("Hel"+"lo")) + " ");
        System.out.print((hello == ("Hel"+lo)) + " ");
        
        /*
         * String的intern()方法会查找在常量池中是否存在一份equal相等的字符串,
         * 如果有则返回一个引用,没有则添加自己的字符串进进入常量池,
                                    注意,只是字符串部分,
                                    所以这时会存在2份拷贝,常量池的部分被String类私有持有并管理,自己的那份按对象生命周期继续使用.
         */
        System.out.println(hello == ("Hel"+lo).intern());
        // 输出结果
//        true
        // true true true true false true
    }
    
    class Other { static final String hello = "Hello"; }
    
    public static void main(String[] args) {
        
        StringKnowledge sk= new StringKnowledge();
        sk.apartEqualsOrCharEqual();
        
        sk.objPoolTest();
        
        sk.addString();
        
        new HashMap<>();
        new Hashtable<>();
    }
    
    

}
