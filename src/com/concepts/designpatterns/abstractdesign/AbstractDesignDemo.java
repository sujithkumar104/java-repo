package com.concepts.designpatterns.abstractdesign;

public class AbstractDesignDemo {
	
	public static void main(String[] args) {
		  
		
		//  AbstarctFactory af = new BankFactory();
		// Bank bank = af.getBankFactory("HDFC");
		//  System.out.println(bank.getBankName());
		  
		  AbstarctFactory af1 = FactoryCreator.getFactory("BANK");
		  Bank bank1 = af1.getBank("HDFC");
		  System.out.println(bank1.getBankName());
	}

}
