package com.concepts.designpatterns.adapterpattern;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails(long accountNumber) {
		
		setAccountHoldername("Sujith");
		setAccountNo(accountNumber);
		setBankName("HDFC");
		setValid(false);
		
		
	}

	@Override
	public String getCreditCard() {
		if(isValid()) {
			return "Hello " + getAccountHoldername() + " you're elgible for credit card";
		}else {
			return "Invalid Account Number";
		}
	}
	
	

}
