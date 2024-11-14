package com.twodimentionarray;

import java.util.Arrays;

public class SearchInNotSortedArray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 5, 7 }, { 2, 6, 9, 12 }, { 4, 10, 15, 17 }, { 8, 19, 23, 56 } };

		int target = 8;
		System.out.println(Arrays.toString(findIn2DArray(arr, target)) );
	}

	private static int[] findIn2DArray(int[][] arr, int target) {

		int r = 0, c = arr.length - 1;

		while (r < arr.length && c >= 0) {
			if (target == arr[r][c]) {

				return new int[] { r, c };
			}

			else if (target < arr[r][c]) {
				c--;
			} else {
				r++;
			}

		}
		return new int[] { -1, -1 };

	}
}
