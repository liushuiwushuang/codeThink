package com.shlg.chuang.collect;

import java.util.Comparator;

public class AscendSort implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int name = o1.name.compareTo(o2.name);
		int age = o1.age - o2.age;
		int id = o1.id - o2.id;
		if(name != 0) 
			return name;
		else if(age != 0)
			return age;
		else
			return id;
	}

}
