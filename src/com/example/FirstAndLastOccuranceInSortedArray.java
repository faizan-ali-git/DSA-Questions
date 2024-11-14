package com.example;

public class FirstAndLastOccuranceInSortedArray {
	
	
	public static void main(String[] args) {

		
		int[] arr= {1,4,7,8,9,9,9,9,66,78,999};
		System.out.println(firstAndLastOccuranceInSortedArray(arr, 8,true));
		System.out.println(firstAndLastOccuranceInSortedArray(arr, 88,false));
		
	}
	
	
	
	static int firstAndLastOccuranceInSortedArray(int a[],int target,boolean flag) {
		
		int start=0 ,mid,ans=-1;
		int end=a.length -1;
		while(start<=end) {
			//target=a[mid];
			mid=(start+end)/2;
			if(a[mid]>target) {
				
				end=mid-1;
			}
			else if(a[mid]< target) {
				
				start=mid+1;
			}
			else {
				ans=mid;
				if(flag)
				end=mid-1;
				else
					start=mid+1;
			}
			
		}
		return ans;
		
		
	}

}
