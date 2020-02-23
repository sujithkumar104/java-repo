package com.concepts.designpatterns.abstractdesign;

public class FactoryCreator{
	
	public static AbstarctFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("BANK")) {
			return new BankFactory();
		}else if(choice.equalsIgnoreCase("LOAN")) {
			return new LoanFactory();
		}
		return null;
	}

}
