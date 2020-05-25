package com.concepts.Programs;

public class QuickSortTest {

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}
		}

		int temp = arr[high];
		arr[high] = arr[i + 1];
		arr[i + 1] = temp;
		return i + 1;
	}

	private void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 7, 8, 9, 1, 10 };
		QuickSortTest sort = new QuickSortTest();
		sort.sort(arr, 0, arr.length-1);
		printArray(arr); 

	}

	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
