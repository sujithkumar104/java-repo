package com.concepts.newfeatures.preDefFI;

public class Student {

	private String name;
	
	private int marks;
	
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}
	
	
	public String toString() {
		return "Name: " +name +" Marks: "+ marks;
	}
	
	
}
