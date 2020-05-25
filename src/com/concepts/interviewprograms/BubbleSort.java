package com.concepts.interviewprograms;

import java.util.Arrays;

public class BubbleSort {

	
	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	// 100 > 98
	
	private static void bubbleSortEasy(int[] arr) {
		Arrays.stream(arr).sorted();
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {100,98,66,205,0,1,59};
		bubbleSort(arr);
		
	}
}
