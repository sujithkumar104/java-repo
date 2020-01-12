package com.concepts.newfeatures.preDefFI.bi;

import java.util.function.BiFunction;

public class BiFunctionTest {
	
	public static void main(String[] args) {
		BiFunction<String,Integer,Employee> bi = (a,b) -> new Employee(a, b);
		
		System.out.println(bi.apply("Sujith", 7992));
	}

}
