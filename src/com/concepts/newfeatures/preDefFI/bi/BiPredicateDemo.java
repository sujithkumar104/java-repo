package com.concepts.newfeatures.preDefFI.bi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		// Single argument
		Predicate<Integer> p = a -> a%2 == 0;
		System.out.println(p.test(5));
		
		// Two Arguments Predicate
		BiPredicate<Integer, Integer> p1 = (a,b) -> (a+b)%2 == 0;
		System.out.println(p1.test(5, 11));
	}
}
