package com.twodimentionarray;

import java.util.Arrays;

public class SearchInSortedMatrix {
	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 5, 7 }, { 8, 9,10, 12 }, { 13, 15, 17,20 }, { 25, 29, 35, 56 } };

		int target = 20;
		System.out.println(Arrays.toString(findIn2DSortedArray(arr, target)) );
	}

	private static int[] findIn2DSortedArray(int[][] arr, int target) {
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

	