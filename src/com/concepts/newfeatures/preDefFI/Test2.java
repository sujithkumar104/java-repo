package com.concepts.newfeatures.preDefFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Sujith", 7992,20000.0, false);
		Employee e2 = new Employee("Bhavya", 7000,30000.0, true);
		
		Predicate<Employee> p = e -> e.getSalary() > 25000.0 && e.isHavingCar();
		
		System.out.println(p.test(e1));
		System.out.println(p.test(e2));
		
		Predicate<Employee> p1 = e -> e.getSalary() > 25000.0; 
		Predicate<Employee> p2 = e -> e.isHavingCar();
		List<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		
		for(Employee e : l) {
			if(p1.and(p2).test(e)) {
				System.out.println("AND Condition " + e);
			}
			if(p1.or(p2).test(e)) {
				System.out.println("OR Condition " + e);
			}
			if(p1.negate().test(e)) {
				System.out.println("NEGATE " + e);
			}
		}

	}

}
