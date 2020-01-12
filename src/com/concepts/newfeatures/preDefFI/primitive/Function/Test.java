package com.concepts.newfeatures.preDefFI.primitive.Function;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Test {
     
	public static void main(String[] args) {
		
    	Function<Integer, Integer> f = i -> i*i;
    	System.out.println(f.apply(5));
    	
    	//below are recommended to use...performance will be better with below.
    	IntFunction<Integer> f2 = i -> i*i;
    	System.out.println(f2.apply(6));
    	
    	IntFunction<Double> f3 = i -> i*i*3.0;
    	System.out.println(f3.apply(6));
    	
    	// Explanation
    	
    	//IntFunction<Integer> f2 = i -> i*i;
    	// IntFunction<R> -> inputtype int and return type can be any type.
    	// DoubleFunction<R> -> inputtype Double and return type can be any type.

    	
    	 
	}
}
