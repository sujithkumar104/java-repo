package com.concepts.newfeatures.preDefFI;

public class Employee {
	
	private String name;
	
	private int empNo;
	
	private double salary;
	
	private boolean isHavingCar;

	public Employee(String name, int empNo, double salary, boolean isHavingCar) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.salary = salary;
		this.isHavingCar = isHavingCar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isHavingCar() {
		return isHavingCar;
	}

	public void setHavingCar(boolean isHavingCar) {
		this.isHavingCar = isHavingCar;
	}
	
	
	public String toString() {
		return name + " "+ empNo;
	}
	
	

}
