package com.concepts.exception.Custom;

public class Test {
	
	public static void main(String[] args) throws TooOldException, TooYoungException {
		
	    int age = Integer.parseInt("15");
		
		AgeCheck ageC = new AgeCheck();
	    ageC.ageCheck(age);
	}

}
