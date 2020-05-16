package com.concepts.streams;

import java.util.Arrays;

public class Stream17 {
	
	public static void main(String[] args) {
		
		
		 
		 Integer[][] integerArray = { {1,2},{3,4},{5,6} };
		 
		 Arrays.stream(integerArray).flatMap(x -> Arrays.stream(x))
		 							.filter(num -> num%2==0)
		 							.forEach(System.out::println);
		
	}
	

}
