package com.example.dsamaths;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=40;
		Boolean[] ans= new Boolean[n+1];
		for(int i=0 ;i<=n ;i++) {
			ans[i]=isPrime(i);
			System.out.println(i +" = " + ans[i]);
		}
	}

	public static Boolean isPrime(int n) {
		
		if(n==0 || n==1)
			return false;
		for(int i=2 ;i*i<=n;i++ ) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
}
