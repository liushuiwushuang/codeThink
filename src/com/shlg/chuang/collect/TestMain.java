package com.shlg.chuang.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 20, 1);
		Person p2 = new Person("zhangsan", 21, 3);
		Person p3 = new Person("zhangsan", 21, 2);
		Person p4 = new Person("lisi", 30, 13);
		Person p5 = new Person("wangwu", 10, 12);
		Person p6 = new Person("mazi", 50, 10);
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		Collections.sort(list,new AscendSort());
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person p = it.next();
			System.out.println(p);
		}
		System.out.println("---------------------------------");
		Collections.sort(list,new DescensSort());
		Iterator<Person> it2 = list.iterator();
		while(it2.hasNext()){
			Person p = it2.next();
			System.out.println(p);
		}
	}

}
