package com.concepts.newfeatures.preDefFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sujith", 50);
		Student s2 = new Student("Bhavya", 85);
		Student s3 = new Student("Keerthi", 70);
		Student s4 = new Student("Kumar", 30);
		
		List<Student> l = new ArrayList<>();
		l.add(s1);l.add(s2);l.add(s3);l.add(s4);
		
		Function<Student, String> f = s ->{
			int marks = s.getMarks();
			String grade="";
			if(marks > 80) {
				grade="Distinction";
			}else if(marks >= 70) {
				grade="First Class";
			}else if(marks >= 50) {
				grade="Second Class";
			}else if(marks >= 35) {
				grade="Third Class";
			}else if(marks < 35){
				grade="Fail";
			}
			return grade;
		};
		
		for(Student s : l) {
			System.out.println("Name: "+ s.getName());
			System.out.println("Marks: "+ s.getMarks());
			System.out.println("Grade: "+ f.apply(s));
		}
		
		// List all students above 60 marks
		Predicate<Student> p = s -> s.getMarks() > 60;
		
		for(Student s : l) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
		
	}
	
}
