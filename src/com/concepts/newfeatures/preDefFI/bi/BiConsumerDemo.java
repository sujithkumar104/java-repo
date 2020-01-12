package com.concepts.newfeatures.preDefFI.bi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Sujith");
		
		BiConsumer<String, String> c1 =(a,b) -> System.out.println(a+b);
		c1.accept("Sujith", "Kumar");
		
		BiConsumer<Integer, Integer> c2 = (a, b) -> System.out.println(a+b);
		c2.accept(2, 5);
 		
	}

}
