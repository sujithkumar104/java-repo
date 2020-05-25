package com.concepts.strings;

public class StringTest3 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		s1 = s1.intern();
		
		String s2 = "ABC";

		System.out.println(s1==s2);
		
		String s3 = new String("ABC");
		System.out.println(s1==s3);

		
	}

}
