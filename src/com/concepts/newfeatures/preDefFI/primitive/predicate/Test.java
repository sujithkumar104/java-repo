package com.concepts.newfeatures.preDefFI.primitive.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Test {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i%2 == 0;
		System.out.println(p.test(5));
		System.out.println(p.test(10));
		
		
		// This is better, bcoz of Auto-Boxing and Un-Boxing will not happen here.
		IntPredicate p1 = i -> i%2 == 0;
		System.out.println(p1.test(5));
		System.out.println(p1.test(10));
		
		DoublePredicate p2 = i -> i%3==0;
		System.out.println(p2.test(250.0));
		
		// LongPredicate
	}

}
