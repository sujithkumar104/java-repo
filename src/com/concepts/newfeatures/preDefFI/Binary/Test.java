package com.concepts.newfeatures.preDefFI.Binary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test {
	
   public static void main(String[] args) {
	   	BiFunction<String,String,String> f = (s1,s2) -> s1+s2;
	   	System.out.println(f.apply("Sujith", "Kumar"));
	   	
	   	// Convert to BinaryOpertor
	   	BinaryOperator<String> f1 = (s1,s2) -> s1+s2;
	   	System.out.println(f1.apply("Sujith", "Kumar"));

	   	//BinaryOpertor<Integer>
	   	//IntBinaryOpertor
	   	//
   }
}
