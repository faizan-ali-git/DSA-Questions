package com.example.dsaQuestions;

public class SmallestSubarrayWithSum {

	
	public static void main(String[] args) {
		int arr[]= {2, 4, 6, 10, 2, 1};
		System.out.println(smallestSubWithSum(12,arr));
	}
	public static int smallestSubWithSum(int x, int[] arr) {

		int len = 0, pos = 0, minLen = Integer.MAX_VALUE, i = 0, sum = 0;

		while (i < arr.length) {
			 sum+=arr[i];
			if (sum < x) {
//				sum += arr[i];
				len++;
				i++;

			} else if (sum > x) {
				sum -= arr[pos];
				len--;
				pos++;
			} else {			
				minLen = Math.min(len, minLen);
//				len = 0;
//				sum = 0;
				i++;
//				pos = i;
			}
		}

		return minLen;
	}
}
