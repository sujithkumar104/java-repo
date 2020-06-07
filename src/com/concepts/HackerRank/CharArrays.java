package com.concepts.HackerRank;

public class CharArrays {

	static int alternatingCharacters(String s) {
		char[] charArray = s.toCharArray();
		int i = 0;
		int delete = 0;
		for(i =0; i< charArray.length-1;i++)  {
			if (charArray[i] == charArray[i + 1]) {
				delete++;
			}
			//i++;
		}
		return delete;

	}
	
	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAAA"));
		System.out.println(alternatingCharacters("BBBBB"));
		System.out.println(alternatingCharacters("ABABABAB"));
		System.out.println(alternatingCharacters("BABABA"));
		System.out.println(alternatingCharacters("AAABBB"));

		
	}

}
