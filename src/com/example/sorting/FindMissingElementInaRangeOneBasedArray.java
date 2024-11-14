package com.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//return all elemnets that are not there in the array
//link- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindMissingElementInaRangeOneBasedArray {

	public static void main(String[] args) {

		int[] nums = { 4,3,2,7,8,2,3,1}; //ans =5,6
		
		
		System.out.println(findMissingElement(nums));
		//cyclicsort(arr);
		//System.out.println(Arrays.toString(arr));

	}
	

	public static List<Integer>  findMissingElement(int[] nums) {
		List<Integer> list= new ArrayList<Integer>(); 
		cyclicsort(nums);
	
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]!=i+1) {
					list.add(i+1);
				}
			}
			
		 
			// list.add(arr.length+1) ;
		
		return list;
	}

	// some modification is required for 0 based array
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

	private static void swap(int[] arr, int i, int j) {

		int swap = arr[i];
		arr[i] = arr[j];
		arr[j] = swap;

	}
}
