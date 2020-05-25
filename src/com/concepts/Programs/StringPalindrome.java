package com.concepts.Programs;

public class StringPalindrome {

	
	public static boolean isPalindrome(String s) {
		StringBuffer rev = new StringBuffer(s);
		return rev.reverse().toString().equals(s);
	}
	
	public static boolean isPalindrome2(String s) {
       	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< s.length();i++) {
			sb.append(s.substring(s.length()-i-1, s.length()-i));
		}
		return sb.toString().equals(s);
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABC";
		
		System.out.println(isPalindrome2(s));
		
	}
}
