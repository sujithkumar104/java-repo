package com.concepts.Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void removeDup(Object[] array) {

		Set<Object> set = new HashSet<>();
		for (Object obj : array) {
			set.add(obj);
		}
		set.stream().forEach(System.out::println);
	}

	public static void removeDuplicates(Object[] array) {
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					list.add(array[i]);
				}
			}
		}
		list.forEach(System.out::println);
	}
	
	public static void removeDuplicates1(Object[] array) {
		List<Object> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean found = false;
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					found = true;
				}
			}
			if(!found) {
				list.add(array[i]);
			}
		}
		list.forEach(System.out::println);
	}

	public static void main(String[] args) {

		Object[] array = new Object[] { 20, 30, 40, 50, 20, 40, 20 };

		// Arrays.stream(array).distinct().forEach(System.out::println);

		removeDuplicates1(array);

	}

}
