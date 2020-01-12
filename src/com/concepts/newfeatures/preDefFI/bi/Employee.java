package com.concepts.newfeatures.preDefFI.bi;

public class Employee {

	int eno;
	String name;
	
	public Employee(String name, int eno) {
		this.name=name;
		this.eno=eno;
	}
	
	public String toString() {
		return "Name:" +name +" Emp No:" +eno;
	}
	
}
