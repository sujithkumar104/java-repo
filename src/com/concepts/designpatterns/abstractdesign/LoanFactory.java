package com.concepts.designpatterns.abstractdesign;

public class LoanFactory implements AbstarctFactory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if (loan.equalsIgnoreCase("Home")) {
			return new BusinessLoan();
		}
		return null;
	}

}
