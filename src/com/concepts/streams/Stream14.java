	package com.concepts.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream14 {
	
	public static void main(String[] args) {
		
		String[] array = new String[] {"Sujith", "Kumar", "Abc"};
		
		 
		Stream<String> s = Arrays.stream(array);
		boolean status = s.anyMatch(x->x.startsWith("K"));
		System.out.println(status);
		System.out.println(s.allMatch(x->x.startsWith("S")));	
		
		
	}

}
