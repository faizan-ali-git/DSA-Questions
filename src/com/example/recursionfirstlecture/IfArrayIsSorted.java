package com.example.recursionfirstlecture;

public class IfArrayIsSorted {

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,6,6,9};
		System.out.println(isSorted(arr, 0));
		

	}

	static boolean isSorted(int[] arr,int index) {
		if(index==arr.length -1)
			return true;
		
		
		return arr[index]<arr[index+1] && isSorted(arr, index+1)  ; // use  <= if same digit is repeating consecutively 
		
	}
}
