package com.example;

public class FindInMountainArray {

public static void main(String[] args) {

		
		int[] arr= {1,4,7,8,9,22,66,4,0};
		int peak=searchPeakElementInMountainArray(arr);  
		//System.out.println(searchPeakElementInMountainArray(arr));
		int ans=orderAgnousticBinarySearch(arr,66,0,peak);
		if(ans!=-1) {
			System.out.println(ans);
		}else {
			
		System.out.println(orderAgnousticBinarySearch(arr,66,peak+1,arr.length-1));
		}
		
		
	}
static int orderAgnousticBinarySearch(int a[],int target,int s,int e) {
	
	int start=s ,mid;
	int end=e;
	
	boolean isascending= a[start]<a[end];
	
	
	while(start<=end) {
		//target=a[mid];
		mid=(start+end)/2;
		if(isascending) {
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
		else {
			if(a[mid]<target) {
				end=mid-1;
			}
			else if(a[mid]> target) {
				
				start=mid+1;
			}
			else {
				return mid;
			}
			
		}
		
	}
	return -1;
	
	
}
static int searchPeakElementInMountainArray(int a[]) {
		
		int start=0 ,mid;
		int end=a.length -1;
		
		while(start<end) {
			
			mid=(start+end)/2;
			if(a[mid]>a[mid+1]) {
				
				//mid is in decreasing part of array
				//mid may be the required position
				//so not leaving mid
				end=mid;
			}
			else if(a[mid]< a[mid+1]) {
				//ascending part of array
				
				start=mid+1;
			}
			
			
		}
		//when start and end will come to same element it will be the 
		//desired max element in the array cuz its satisfying the above two condtions
		//so returning start or end
		return end;
		//return start;
		
		
	}
}
