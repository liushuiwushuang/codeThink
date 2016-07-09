package com.shlg.chuang.collect;

public class Person {

	public String name;
	
	public int age;
	
	public int id;

	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String ret = "name:" +name+" age:" +age+" id:"+id +"\n";
		return ret;
	}
	
}
