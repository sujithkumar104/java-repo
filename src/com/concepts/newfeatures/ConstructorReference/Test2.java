package com.concepts.newfeatures.ConstructorReference;

class Employee{
	
	String name;
	int empNo;
	Employee(String name, int empno){
		this.name = name;
		this.empNo = empno;
	}
	
}

interface Inter{
	public Employee get(String name, int empno);
}

public class Test2 {
	
     public static void main(String[] args) {
    	 	Inter interf = (name, eno) -> new Employee(name, eno);
    	 	Employee e = interf.get("Sujith", 7992);
    	 	System.out.println(e.empNo);
    	 	
    	 	//Constructor Reference
    	 	Inter interf1 = Employee::new;
    	 	Employee e1 = interf1.get("Kumar", 7000);
    	 	System.out.println(e1.empNo);
     }	

}
