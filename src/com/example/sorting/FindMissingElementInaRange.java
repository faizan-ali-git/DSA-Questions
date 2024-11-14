package com.example.sorting;

import java.util.Arrays;

public class FindMissingElementInaRange {
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 0 }; //ans =1
		
		
		System.out.println(findMissingElement(arr));
	}
	

	public static int findMissingElement(int[] arr) {
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
	
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=i)
					return i;
			}
			
		 
			return arr.length ;
		
		
	}

	// some modification is required for 0 based array
	public static void cyclicsort(int[] arr) {
		int i=0;
		while (i < arr.length) {

			int correct = arr[i] ;//arr[i]-1 for 1 based array

			if (arr[i] < arr.length &&arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}
			else
				i++;
		}


	}

	private static void swap(int[] arr, int i, int j) {

		int swap = arr[i];
		arr[i] = arr[j];
		arr[j] = swap;

	}
}
