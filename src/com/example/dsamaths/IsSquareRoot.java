package com.example.dsamaths;

public class IsSquareRoot {
	public static void main(String[] args) {
		System.out.println(isSqrt(81));
	}

	public static boolean isSqrt(int n) {
		int start = 1, end = (int) Math.sqrt(n);
		while (start <= end) {

			int mid = (start + end) / 2;
			if (mid * mid == n) {
				return true;
			} else if (mid * mid < n) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return false;

	}
}
