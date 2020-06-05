package com.concepts.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	
	private static void printCountOfChars(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toCharArray();
		
		for(char ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
				
		for(char ch: map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println(ch + " count is :" + map.get(ch));
			}
		}
		
	}
	
	public static void main(String[] args) {
		printCountOfChars("Sujith Kumar");
	}

}
