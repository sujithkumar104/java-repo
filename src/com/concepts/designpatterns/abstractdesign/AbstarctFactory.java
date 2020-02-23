package com.concepts.designpatterns.abstractdesign;

public interface AbstarctFactory {
	
	public Bank getBank(String bank);
	
	public Loan getLoan(String loan);

}
