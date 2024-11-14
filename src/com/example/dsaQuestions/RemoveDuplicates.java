package com.example.dsaQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

		int[] arr = {  3, 2, 4, 4, 5, 5 ,1, 2, 2};
		System.out.println(Arrays.toString(removeDuplicatesUsingSorting(arr, 101)));
		System.out.println(Arrays.toString(removeDuplicatesUsingSet(arr, 101)));
	}

	public static int[] removeDuplicatesUsingSorting(int[] arr, int val) {

		 Arrays.sort(arr);

		// Iterate through the array starting from the second element
		int pos = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[pos] != arr[i]) {
				pos++;
				arr[pos] = arr[i];
			}
		}

		int[] res = new int[pos + 1];
		for (int i = 0; i < pos + 1; i++) {
			res[i] = arr[i];
		}
		return res;
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
	//	Integer[] arr2 =set.toArray(new Integer[0]);
		return set.toArray(new Integer[0]);
	}
	

}
