package com.concepts.newfeatures;

import java.util.function.Function;

public class TestFunction {
	
	public static void main(String[] args) {
		
		 Function<Integer,Integer> f = i -> i*i;
		 
		 Function<Integer,Integer> f0 = i -> {
			 i=i+1;
			 return i*i;
		 };

		 System.out.println(f.apply(5));
		 
		 System.out.println(f0.apply(5));
		
		 Function<String, Integer> f1 = s -> s.length();
		 
		 System.out.println(f1.apply("Sujith"));
		 
		 Function<String, String> f2 = s -> s.concat(" Kumar");

		 System.out.println(f2.apply("Sujith"));
		 
		 Function<Integer, String> f3 = i -> String.valueOf(i);
		 
		 System.out.println(f3.apply(5));
		 
	}

}
