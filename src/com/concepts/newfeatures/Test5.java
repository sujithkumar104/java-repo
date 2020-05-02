package com.concepts.newfeatures;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test5 {
	
	public static void main(String[] args) {
				
		Function<Integer,Integer> f = n-> n*n;
		
		System.out.println(f.apply(5));
		
		Function<Integer, Integer> f1 = n -> {
			int a = n * n;
			return a = a+5;
		};
		
		System.out.println(f1.apply(5));
		
		Consumer<Integer> c = n -> {
			 System.out.println(n);
		};
		
		Consumer<Integer> c1 = n -> System.out.println(n);
		
		c.accept(5);
		c1.accept(100);
		
		
	}

}
