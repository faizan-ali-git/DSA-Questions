package com.mycodes;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 ,1, 1 ,1};
		System.out.println(subarraySum(nums,7));
	}
    public static int subarraySum(int[] nums, int k) {
        int sum=0,l=-1,r=0,count=0;

        while(r< nums.length ){
            sum=sum+nums[r];
            if(sum == k){
                count++;
                r++;
            }
            else if(sum<k){
                if(l==-1) {
                	l=r;
                }
                r++;

            }
            else if(sum > k && l!=-1){
                while(sum>k){
                    sum =sum - nums[l++];
                    if(sum ==k){
                        count++;
                        break;
                    }
                }
                r++;
            }
        }
        return count;
    }
}