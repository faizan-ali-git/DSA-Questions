package com.example.recursionfirstlecture;

public class SumOfDigits {

	public static void main(String[] args) {
	//System.out.println(sumofdigits(12307));	
	System.out.println(productofdigits(12617));	
	}
	
	static int sumofdigits(int n) {
		
		if(n%10==n)
			return n;
		
		int rem=n%10;
		return rem+sumofdigits(n/10) ;
	}
	static int productofdigits(int n) {
		
		if(n%10==n)
			return n;
		
		int rem=n%10;
		return rem*productofdigits(n/10) ;
	}
}
