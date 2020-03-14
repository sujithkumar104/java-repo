package com.concepts.newfeatures.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		messages.forEach(s -> System.out.println(s));
		messages.forEach(System.out::println);
		

	}

}
