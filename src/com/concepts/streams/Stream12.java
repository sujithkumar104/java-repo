package com.concepts.streams;

import java.util.Arrays;

public class Stream12 {

	public static void main(String[] args) {
		
		String[] array = new String[] {"Sujith", "Kumar","Abc"};
		
		//Stream<String> s = Arrays.stream(array);
					
	    //s.map(x->x.toUpperCase()).forEach(System.out::println);
	    
	    String a = Arrays.stream(array).reduce("", (x, y) -> x + y);
	    System.out.println(a);
		
	}
	
}
