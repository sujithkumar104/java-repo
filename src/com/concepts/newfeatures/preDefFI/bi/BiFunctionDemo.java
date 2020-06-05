package com.concepts.newfeatures.preDefFI.bi;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class BiFunctionDemo {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		System.out.println(f.apply(5));
		
		BiFunction<Integer, Integer, Integer> f1 = (i,j) -> i*j;
		System.out.println(f1.apply(5, 2));
		
		IntBinaryOperator f2 = (i,j) -> i*j;
		System.out.println(f2.applyAsInt(5, 2));
		
	}

}
