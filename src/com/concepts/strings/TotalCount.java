package com.concepts.strings;

public class TotalCount {
	
	public static void totalCount(String s) {
		System.out.println(s.length());
	}
	
	public static void specificChar(String s, char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(c == s.charAt(i)) {
				count++;
			}
		}
				
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		totalCount("Sujith Kumar");
		specificChar("Sujith Kumaru", 'u');

		
	}

}
