package com.example.dsaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        // for(int i=0 ;i<nums.length ; i++){
        //     for(int j=i+1 ; j<nums.length ;j++){
        //         if((nums[i] +nums[j])== target){
        //             res[0] =i;
        //             res[1] =j;
        //             break;
        //         }
        //     }
        // } O(N2)

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//         for(int i=0 ;i<nums.length ; i++){
//                map.put(nums[i],i);
//         } wrong because if we fill the map before itetation
        //then the {3,2,4} , 6 will because it will return {0,0}
         for(int i=0 ;i<nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                    res[0] =i;
                    res[1] =map.get(target-nums[i]);//used wrong getValue()
                    break;
            } else {
            	map.put(nums[i], i);//correct
            }

         } 
        
//        int left = 0,right= nums.length-1; 
//        Arrays.sort(nums);
//        while(left<right) {
//        	int sum=nums[left]+nums[right] ;
//        	if(sum ==target) {
//        		res[0] =left;
//        		res[1] =right;
//        		break;
//        	} else if(sum<target) {
//        		left++;
//        	}else {
//        		right--;
//        	}
//        } failed due to index will change after sorting 
    return res;
    }
    
    public static void main(String[] args) {
		int arr[]= {3,2,4};
		System.out.println(Arrays.toString(twoSum(arr,6)));
	}
}