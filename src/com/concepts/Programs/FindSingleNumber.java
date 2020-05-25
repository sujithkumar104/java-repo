package com.concepts.Programs;

public class FindSingleNumber {

	private static void find(int[] arr) {
		int[] dup = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					found=true;
					break;
				}
			}
			dup[i]=arr[i];
		}
		
		for(int a:arr) {
			for(int b: dup) {
				
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 2, 3, 4, 4, 5, 5 };

	}

}
