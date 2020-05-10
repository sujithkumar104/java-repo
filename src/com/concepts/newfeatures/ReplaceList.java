package com.concepts.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceList {

	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("ABC_STD_ABC");
		l.add("XYZ_STD_ABC");
		l.add("ABC_STD_XYZ");
		l.add("MNO_STD_ABC");
		
		UnaryOperator<String> u = i -> i.replaceAll("STD", "STR");
		
		l.replaceAll(i -> i.replaceAll("STD", "STR"));
		
		l.replaceAll(u);
				
		l.stream().forEach(System.out::println);
	}
}
