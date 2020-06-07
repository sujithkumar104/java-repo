package com.concepts.HackerRank;

import java.util.stream.IntStream;

public class BubbleSort {
	
	
	public static void sort(int[] arr) {
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j =0; j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}
		System.out.println(count);
		//IntStream.of(arr).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		sort(new int[] {4,3,1,2});
	
	}

}
