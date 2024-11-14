package com.example;

public class ArrayMountain {
	
	public static void main(String[] args) {

		
		int[] arr= {1,4,7,8,9,22,66,4,0};
		System.out.println(searchInMountainArray(arr));
		
	}
	
	
	
	static int searchInMountainArray(int a[]) {
		
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
