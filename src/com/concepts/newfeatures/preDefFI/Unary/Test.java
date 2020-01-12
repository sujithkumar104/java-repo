package com.concepts.newfeatures.preDefFI.Unary;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(5));
		
		// Converting above into Unary operator
		// UnaryOpertor is child of Function
		UnaryOperator<Integer> u = i->i*i;
		System.out.println(u.apply(6));
		
		//IntUnaryOpertor
		IntUnaryOperator u1 = i->i*i;
		System.out.println(u1.applyAsInt(6));
		
		//DoubleUnaryOpertor
		//LongUnaryOpertor

	}

}
