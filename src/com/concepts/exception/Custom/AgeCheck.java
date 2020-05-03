package com.concepts.exception.Custom;

public class AgeCheck {

	
	public void ageCheck(int age) throws TooOldException, TooYoungException{
		
		if (age > 60) {
			throw new TooOldException("Age is too high");
		}else if(age < 18 ) {
			throw new TooYoungException("Age is too less");
		}else {
			System.out.println("Age looks OKAY");  
		}
		
	}
}
