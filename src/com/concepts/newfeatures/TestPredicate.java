package com.concepts.newfeatures;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		 //Class input Argument  = boolean expression  
		 Predicate<String> p1 = s -> s.equals("Sujith");
         System.out.println(p1.test("Kumar"));
         System.out.println(p1.test("Sujith"));  
	     
		 //Class input Argument  = boolean expression  
         Predicate<Integer> p2 = i -> i%2 == 0; // to check number is even
         System.out.println(p2.test(3));  // odd 
         System.out.println(p2.test(30)); // even
         
         Predicate<Integer> p3 = i -> i%10 == 0; // didide 
         System.out.println(p3.test(30));
         System.out.println(p3.test(25));
	}

}
