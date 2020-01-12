package com.concepts.newfeatures.preDefFI;

import java.util.Date;
import java.util.function.Supplier;

public class Test8 {
	
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		Supplier<String> s1 = () -> "Sujith";
		System.out.println(s1.get());
		
		Supplier<String> s2 = () -> {
			String otp = "";
			for(int i=0; i<6; i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s2.get());
		System.out.println((int)(Math.random()*10));
		
	}

}
