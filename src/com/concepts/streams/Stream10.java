package com.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream10 {
	
	public static void main(String[] args) {
		
		
		 List<Book> bookList = new ArrayList<>();
		 bookList.add(new Book("JAVA BASICS", new Author("Sujith", "sujith@gmail.com", 29), 500.0));
		 bookList.add(new Book("JAVA JEE", new Author("Kumar", "Kumar@gmail.com", 35), 700.0));
		 bookList.add(new Book("JAVA MULTI", new Author("ABC", "ABC@gmail.com", 40), 800.0));
		 bookList.add(new Book("SPRING", new Author("XYZ", "XYZ@gmail.com", 36), 400.0));

		
		 List<String> filtered = bookList.stream()
				 				 .map(x->x.getAuthor())
				 				 .filter(author -> author.getAge()>30)
				 				 .map(x-> x.getName().toUpperCase())
				 				 .distinct()
				 				 .limit(2)
				 				 .collect(Collectors.toList());
		 
		 System.out.println(filtered);
		
		 int totalAgeOfAutors = bookList.stream()
				 				.map(Book::getAuthor)
				 				.map(Author::getAge)
				 				.reduce(0, Integer::sum);
		 System.out.println(totalAgeOfAutors);
		 
	}

}
