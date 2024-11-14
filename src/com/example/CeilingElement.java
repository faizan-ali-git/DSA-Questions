package com.example;

//Smallest element greater than target or equal to element 
public class CeilingElement {

	public static void main(String[] args) {
		//System.out.println("Hello");

		
		int[] arr= {1,4,7,8,9,22,66,78,999};
		System.out.println(ceiling(arr, 15));
		
	}
	
	
	
	static int ceiling(int a[],int target) {
		
		int start=0 ,mid;
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
				return mid;
			}
			
		}
		return start;
		
		
	}
}
