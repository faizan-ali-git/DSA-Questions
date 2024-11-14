package com.example.dsaQuestions;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		int[] arr= {2,55,6,78,7,30,101};
		System.out.println(binarySearch(arr,101));
	}

	public static int binarySearch(int[] arr, int val) {

		Arrays.sort(arr);

		int l = 0, r = arr.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == val) {
				return mid;
			} else if (arr[mid] > val) {
				r = mid - 1;

			} else {
				l = mid + 1;

			}
		}
		return -1;
	}

}
