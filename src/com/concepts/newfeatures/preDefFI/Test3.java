package com.concepts.newfeatures.preDefFI;

import java.util.function.Predicate;

public class Test3 {
	
	public static void main(String[] args) {
		String[] names = {"Sujith", "Kumar", "Bhavya", "Keerthi"};
		
		Predicate<String> p = s -> s.length() > 5;
		
		for(String s : names) {
			if(p.test(s)) {
			  System.out.println(s + " having length morethan 5");
			}
		}
		
	}

}
