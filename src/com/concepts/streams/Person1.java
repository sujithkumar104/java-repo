package com.concepts.streams;

public class Person1 {
	
	private String name;
	private int id;
	private int age;
	
	public Person1(String name, int id, int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	
}
