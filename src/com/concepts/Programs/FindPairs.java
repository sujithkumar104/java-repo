package com.concepts.Programs;

public class FindPairs {

	public static StringBuilder findPairs(int[] arr, int number) {
		
		StringBuilder  sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i];
			for(int j=0; j < arr.length; j++) {
				int second = arr[j];
				if(number  == (first + second)) {
					 sb.append(" " +first +" and " + second);
				}
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 10, 5, 6, 4, 7, 9, 3 };
		
	}
}
