package com.concepts.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {

	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> finalGrades = new ArrayList<>();
		for (Integer i : grades) {
			if (i < 38) {
				finalGrades.add(i);
			} else {
				if (i % 5 != 0) {
					int value = i / 5;
					int newValue = (value + 1) * 5;
					int diff = newValue - i;
					if (diff < 3) {
						finalGrades.add(newValue);
					} else {
						finalGrades.add(i);
					}
				}else {
					finalGrades.add(i);
				}
			}
		}
		return finalGrades;
	}
	
	
	public static List<Integer> gradingStudentsOpti(List<Integer> grades) {
		List<Integer> finalGrades = new ArrayList<>();
		for (Integer i : grades) {
				if(i < 38 || i%5 == 0 || i%5 < 3) {
					finalGrades.add(i);
				}else {
					finalGrades.add((i%5==3)?i+2:i+1);
				}
		}
		return finalGrades;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,80,96,18);
				
		System.out.println(gradingStudentsOpti(list));
		
		
	}
}
