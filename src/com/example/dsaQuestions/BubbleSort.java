package com.example.dsaQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = { 64};
		removeDuplicatesUsingSorting(arr);
		System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(removeDuplicatesUsingSet(arr, 101)));
	}

	public static void removeDuplicatesUsingSorting(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}

			}

		}
	}
	
	public static void swap(int[] arr,int i, int j) {
		int temp= arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static Integer[] removeDuplicatesUsingSet(int[] arr, int val) {

		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		int[] res = new int[set.size()];
//		for(int i=0 ;i<set.size() ;i++) {
//			res[i] = set; //not possible because set don't have get method
//		}
		return set.toArray(new Integer[0]);
	}

}
