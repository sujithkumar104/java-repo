package com.concepts.test;

public class FindPairs {
	
	
	private static void test(int[] arr, int num) {
		// 11 -> 9  
		for(int i=0;i< arr.length;i++) {
			int first = arr[i];
			for(int j=i;j<arr.length;j++) {
				int second = arr[j];
				if(num == (first+second)) {
					System.out.println("Combination of "+first +" & " + second +" is equal to " + num);
				}
			}
		}
	}
	
	/*
	 * private static void test1(int[] arr, int num) { // int j=0; for(int i=0;i<
	 * arr.length-1;i++) { if(num == arr[j]+arr[i]) {
	 * System.out.println("Combination of is equal to " + num); j++; }
	 * if(i==arr.length-1) { i=0; j++; }
	 * 
	 * } }
	 */
	
	
	public static void main(String[] args) {
		int inputArr[] = { 9, 8, 7, 4, 5, 3, 1, 6 };
		int sum = 11;
		test(inputArr, sum);
		
	}

}
