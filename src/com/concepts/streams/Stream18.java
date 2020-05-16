package com.concepts.streams;

import java.util.stream.Stream;

public class Stream18 {
	
	public static void main(String[] args) {
		
		
		String str = "Hello World";
		
		Stream<String> strm = Stream.generate(str::toString).limit(5);
		strm.forEach(System.out::println);
		
		

	}

}
