package com.concepts.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11 {
	
	public static void main(String[] args) {
		
	  Integer[] numarray = 	new Integer[] {1,5,7,9,10};
	  
	     Stream.of(numarray).forEach(System.out::println);
	     
	     Stream<Integer> s = Arrays.stream(numarray);
	     s.forEach(System.out::println);
	     
	     
		  int[] intarray = 	new int[] {1,5,7,9,10};

	     Arrays.stream(intarray).sum();
	     Arrays.stream(intarray).average();
	     
	     
	     
	     IntStream.of(intarray).sum();
	     
	}

}
