package com.concepts.callby;

import java.util.ArrayList;
import java.util.List;


public class ListTest {

	public static void addEntries(List l) {
		l.add("3");
		l.add("4");
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		addEntries(list);
		list.forEach(System.out::println);
		
		//int to integer
		int ab = 10;
		Integer iw = Integer.valueOf(ab);
		Integer iw1 = new Integer(ab);
		
		// integer to int
		Integer ib = new Integer(10);
		int abc = ib.intValue();
		
		
		// String to int
		String s = "10";
		int as = Integer.parseInt(s);
		
		// int to String
		String is = String.valueOf(ab);
		
		// String to warpper class
		String s1 ="10";
		Integer i1 = new Integer(s1);
		Integer i2 = Integer.valueOf(s1);
		
		
		
	}
}
