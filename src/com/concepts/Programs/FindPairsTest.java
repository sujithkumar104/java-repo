package com.concepts.Programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPairsTest {

	
	@Test
	void test() {
		int[] array = new int[] { 1, 2, 10, 5, 6, 4, 7, 9, 3 };
		FindPairs pair = new FindPairs();
		StringBuilder sb = pair.findPairs(array, 5);
		System.out.println(sb.toString());
		assertEquals("1 and 4", sb.toString());
		
	}

}
