package com.concepts.strings;

public class StringTest1 {

	public static void main(String[] args) {
		
		
		String s1 = new String ("ABC");
		String s2 = "ABC";
		String s3 = "ABC";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		s1=s1.intern();
		System.out.println(s1==s2);
		
	}
}
