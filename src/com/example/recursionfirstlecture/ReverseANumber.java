package com.example.recursionfirstlecture;

public class ReverseANumber {

	public static void main(String[] args) {

		int n=100600010;
		int count=   (int)Math.log10(n)+1;
		System.out.println(reverse(n, count));
		System.out.println(countZeroes(n));
		//System.out.println(count);
	}
	
	static int reverse(int n,int count) {
		
		if(n%10==n)
			return n;
		int rem=n%10;
		
		
		return rem*(int)Math.pow(10, count-1) +reverse(n/10,count-1);
		
		
		
	}
	static int countZeroes(int n) {
		
		if(n%10==n)
			return 0;
		
		int rem=n%10;
		
		
		return  (rem==0 ? 1:0) +countZeroes(n/10);
		//return rem*(int)Math.pow(10, count-1) +countZeroes(n/10,count-1);
		
		
		
	}

}
