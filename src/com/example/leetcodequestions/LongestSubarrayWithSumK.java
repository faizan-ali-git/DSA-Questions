package com.example.leetcodequestions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
	public static void main(String[] args) {
		int[] nums= {1, 2, 3, 1, 1, 1, 1};
		System.out.println(longestSubarrayWithSumKwithNegatives(nums, 5));
	}
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        // long sum=0;     //not optimal
        // int length=0,lengthMax=Integer.MIN_VALUE;
       
        // for(int i=0 ;i<a.length ;i++){
        //     sum=sum+(int)a[i];
        //     if(sum>k){
        //         sum=(int)a[i];
        //         length=1;
        //     }
        //     else{               
        //           length++;            
        //     }
        //     lengthMax=Math.max(length,lengthMax);
        // }
        // return lengthMax;

        int lengthMax=Integer.MIN_VALUE,left=0,right=0;//O(N)-https://youtu.be/frf7qxiN2qU?si=1OUc69vUSgeeYY31
        int n=a.length;
        long sum=a[0];
        while(right<n){
            while(left<=right && sum>k){//till there is a left element to remove
                sum-=a[left];
                left++;
            }          
            if(sum==k){
                lengthMax=Math.max(lengthMax,(right-left+1));
            }
             right++;
            if(right<n)//if this is a last element
            {
                sum+=a[right];
            }       

        }
        return lengthMax;
    }
    public static int longestSubarrayWithSumKwithNegatives(int []a, long k) {
    	long sum=0;
    	int longest=Integer.MIN_VALUE;
    	int n=a.length;
    	Map<Long,Integer> map= new HashMap<>();
    	for(int i=0 ;i<n;i++) {
    		sum=sum+a[i];
    		if(sum==k) {
    			longest=Math.max(longest,i+1);
    		}
    		else {
    			if(map.containsKey(sum-k)) {
    				longest=Math.max(longest,(i- map.get(sum-k)));
    			}
    		}
    		map.put(sum, i);
    	}
    	
		return longest;
    	
    }
}