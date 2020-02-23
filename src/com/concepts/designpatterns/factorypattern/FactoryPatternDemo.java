package com.concepts.designpatterns.factorypattern;

public class FactoryPatternDemo {
	
	
	public static void main(String[] args) {
		PatternFactory pf = new PatternFactory();
		
		Plan plan = pf.getPlan("Domestic");
		plan.getRate();
		System.out.println(plan.calculateBill(50));
	}

}
