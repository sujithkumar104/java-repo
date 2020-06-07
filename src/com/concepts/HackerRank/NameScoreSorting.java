package com.concepts.HackerRank;

public class NameScoreSorting {

	static int makeAnagram(String a, String b) {
		int offset = (int) 'a';
		int firstArray[] = new int[26];
		int secondArray[] = new int[26];
		int numberNeeded = 0;

		for (char value : a.toCharArray()) {
			int characterValue = (int) value - offset;
			firstArray[characterValue]++;
		}

		for (char value : b.toCharArray()) {
			int characterValue = (int) value - offset;
			secondArray[characterValue]++;
		}

		for (int i = 0; i < 26; i++) {
			numberNeeded += Math.abs(firstArray[i] - secondArray[i]);
		}

		return numberNeeded;
	}
	
	public static void main(String[] args) {
		System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}

}
