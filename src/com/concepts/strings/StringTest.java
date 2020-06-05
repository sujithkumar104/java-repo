package com.concepts.strings;

public class StringTest {
	
	
	public static void main(String[] args) {
		
		String s1 = new String("Sujith Kumar");
		String s2 = "Sujith Kumar";
		String s3 = s1;
		
		System.out.println(s1 == s2); 
		System.out.println(s1 == s3);
		
		String a = "sujith kumar";
		
		String s4 = "Sujith";
		String s5 = s4 + " Kumar";
		
		System.out.println(s5 == s1);
		
		String b = new String("sujith kumar");

		String s6 = b.toLowerCase();
		
		System.out.println(s6 == s1);
		
		System.out.println(s6 == a);
		
		System.out.println(s6 == b);
		
		
	}

}
