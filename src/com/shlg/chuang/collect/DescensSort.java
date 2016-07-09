package com.shlg.chuang.collect;

import java.util.Comparator;

public class DescensSort implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int name = o2.name.compareTo(o1.name);
		int age = o2.age - o1.age;
		int id = o2.id - o1.id;
		if( name != 0)
			return name;
		else if(age!=0)
			return age;
		else 
			return id;
	}

}
