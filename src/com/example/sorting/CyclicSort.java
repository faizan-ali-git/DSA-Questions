package com.example.sorting;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		
		//sort between a range of number O(N)
		int[] a= {1,3,4,2,2};
		cyclicsort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void cyclicsort(int[] arr) {
		int i=0;
		while (i < arr.length) {

			int correct = arr[i] -1;

			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}
			else
				i++;
		}

		
	}

	private static void swap(int[] arr,int i, int j) {
		
		int swap=arr[i];
		arr[i]= arr[j];
		arr[j]=swap;
		
	}
}
