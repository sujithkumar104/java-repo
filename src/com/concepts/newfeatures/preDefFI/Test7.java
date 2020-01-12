package com.concepts.newfeatures.preDefFI;

import java.util.function.Consumer;

public class Test7 {
	
	public static void main(String[] args) {
		
		Consumer<String> c = s -> {
			System.out.println(s);
			System.out.println(s + " KUMAR");
		};
		c.accept("Sujith");
		
		Consumer<Student> c1 = s -> {
			System.out.print(s.getName() + " ");
			System.out.print(s.getMarks());
		};
		
		Student s1 = new Student("Sujith", 50);
		c1.accept(s1);
		
	}

}
