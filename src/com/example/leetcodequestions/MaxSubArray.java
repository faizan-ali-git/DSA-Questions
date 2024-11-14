package com.example.leetcodequestions;

import java.util.Arrays;

class MaxSubArray {

	public static void main(String[] args) {

		int[] nums = {2,3,-2,4};
		System.out.println(Arrays.toString(nums));
	//	System.out.println(maxSubArray(nums));
		//System.out.println(Arrays.toString(maxSubArrayIndexes(nums)));
		System.out.println(maxProduct(nums));
		//printSubArray(maxSubArrayIndexes(nums),nums);
	}

	public static int maxSubArray(int[] nums) {

		// kadane's algorithm O(N)'
		int cmax = 0;
		int omax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (cmax < 0) {
				cmax = nums[i];
			} else {
				cmax += nums[i];
			}

			omax = Math.max(omax, cmax);
		}
		return omax;
	}

	public static int[] maxSubArrayIndexes(int[] nums) {

		// kadane's algorithm O(N)'
		int cmax = 0;
		int omax = Integer.MIN_VALUE;
		int low = -1, high = -1;
		for (int i = 0; i < nums.length; i++) {
			if (cmax < 0) {
				cmax = nums[i];
				low = i;
			} else {
				if (low == -1) {
					low = i;
				}
				
				cmax += nums[i];
				if(cmax>omax) {
					high=i;
				}

			}

			omax = Math.max(omax, cmax);
		}
		int[] ans = { low, high };
		return ans;

	}
	private static void printSubArray(int[] indx ,int[] nums) {
		for(int i=indx[0] ;i<=indx[1] ;i++ ) {
			System.out.print(nums[i] +"	");
			
		}
		
		
	}
	public static int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE,prod=0;

        for(int i=0 ;i<nums.length-1 ;i++){
            
            for(int j=i+1 ;j <nums.length  ;j++){
                    prod=nums[i]*nums[j];
                    maxProd=Math.max(maxProd,prod);
            }
        }
        return maxProd;
    }
}
