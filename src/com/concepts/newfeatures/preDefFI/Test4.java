package com.concepts.newfeatures.preDefFI;

import java.util.function.Function;

public class Test4 {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		System.out.println(f.apply(5));
		
		Function<String, Integer> f1 = s -> s.length();
		
		System.out.println(f1.apply("Sujith"));
	}

}
