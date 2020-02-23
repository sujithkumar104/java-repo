package com.concepts.designpatterns.adapterpattern;

public class AdapterPatternDemo {

	
	public static void main(String[] args) {
		CreditCard target = new BankCustomer();
		target.giveBankDetails(123456);
		System.out.println(target.getCreditCard());
	}
}
