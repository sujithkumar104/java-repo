package com.concepts.sortalgo;

import java.util.Arrays;

public class BubbleSort {
	
	private static int[] sort(int[] arr) {
		int count= 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int value = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = value;
					count++;
				}
				count++;
			}
			count++;
		}
		System.out.println(count);
		return arr;
	}
	
	private static int[] optimizedSort(int[]  arr) {
		int count1= 0;
		boolean swapped;
		for(int i=0;i<arr.length;i++) {
			swapped = false;
			for(int j=0;j< arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
					count1++;
				}
				count1++;
			}
			count1++;
			if(!swapped) {
				break;
			}
		}
		// if swap did not happen, then break it...no need to run for next value.
		System.out.println(count1);
		return arr;
	}
	
	private static void print(int[] arr) { 	
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,1,4,2,8};
		print(arr);
		//int[] newarr = sort(arr);
		//print(newarr);
		print(optimizedSort(arr));
	}

}
