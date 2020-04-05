package com.concepts.interviewprograms;

public class ReverseString {
	
	private static String reverse(String str) {
		 String rev = "";
		 for(char c : str.toCharArray()) {
			 rev = c+rev;
		 }
	     return rev;
	}
	
	private static String reverseB(String str) {
		 StringBuilder rev = new StringBuilder();
		 for(int i=str.length()-1; i >=0;i--) {
			 rev.append(str.charAt(i));
		 }
	     return rev.toString();
	}
	
	private static String reverseBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		String s = "Sujith";
		System.out.println(reverse(s));
		System.out.println(reverseB(s));
		System.out.println(reverseBuilder(s));
	}

}
