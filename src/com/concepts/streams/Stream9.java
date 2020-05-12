package com.concepts.streams;

import java.util.stream.Stream;

public class Stream9 {

	public static void main(String[] args) {
		
		// Stream.iterate(1, e->e+1).forEach(System.out::println);
		 
		 Stream.iterate(1, e->e+1).filter(i-> i%2 ==0).forEach(System.out::println);
		
	}
}
