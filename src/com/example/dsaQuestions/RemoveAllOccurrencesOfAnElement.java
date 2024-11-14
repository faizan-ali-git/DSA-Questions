package com.example.dsaQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveAllOccurrencesOfAnElement {
	public static void main(String[] args) {

		int[] arr = {  3, 9, 2, 3, 1, 7, 2, 3, 5};
		System.out.println(Arrays.toString(RemoveAllOccurrencesOfAnElement(arr, 3)));
		//System.out.println(Arrays.toString(removeDuplicatesUsingSet(arr, 101)));
	}

	public static int[] RemoveAllOccurrencesOfAnElement(int[] arr, int key) {

		
		int pos = 0;
		int n = arr.length;
		for (int i=0; i<arr.length; i++)  {
			if (arr[i] != key) {//wrong with arr[pos]
				
				arr[pos] = arr[i];
				pos++;//wrong with pos++ on line 22
			}
		}
		System.out.println(Arrays.toString(arr));
		int[] res = new int[pos];

		for (int i = 0; i < pos ; i++) {
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
		return set.toArray(new Integer[0]);
	}
	

}
