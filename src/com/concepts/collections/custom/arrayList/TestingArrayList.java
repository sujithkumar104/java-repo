package com.concepts.collections.custom.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestingArrayList {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sujith");
		list.add("Kumar");
		list.add("ABC");
		list.add("XYZ");
		
		list.remove(2);
		
		System.out.println(list);
	}
}
