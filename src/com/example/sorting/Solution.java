package com.example.sorting;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] arr= {1};
		
		System.out.println(firstMissingPositive(arr));
		System.out.println(Arrays.toString(arr));
	}
    public static int firstMissingPositive(int[] nums) {
        
        int i=0,n=nums.length;
        while(i<n){
            int correct=nums[i] -1;
            if(nums[i]>0 && nums[correct] !=nums[i]){
                swap(nums,i,correct);
            }
            else {
            	i++;
            }
        }
        
        for(int j=0 ;j<n ;j++){
            if(nums[j]!= j+1){
                return j+1;
            }
        }
        return n;
    }
    
    
    public static void swap(int[] arr,int i,int j){
        int swap=arr[i];
        arr[i]=arr[j];
        arr[j]= swap;
    }
}