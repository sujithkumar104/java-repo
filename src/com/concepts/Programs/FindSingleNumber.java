package com.concepts.Programs;

import java.util.List;

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
				System.out.println(b);
			}
		}
	}
	
	
	static int findSingle(int ar[], int ar_size) 
    { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) {
            res = res ^ ar[i]; 
        }
      
        return res; 
    } 
	
	static int MyfindSingle(int ar[], int ar_size) 
    { 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) {
            res = res ^ ar[i]; 
        }
      
        return res; 
    } 
	
	static int MyfindSingle(int[] arr) 
    { 
          int res = arr[0];
          for(int i=1;i<arr.length;i++) {
        	  res = res ^ arr[i];
          }
		return res;
    } 


	public static void main(String[] args) {
		int[] arr = new int[] { 2,2,3,2,2,2,2 };
		System.out.println(findSingle(arr, arr.length));
	}

}
