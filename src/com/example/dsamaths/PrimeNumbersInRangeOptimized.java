package com.example.dsamaths;

public class PrimeNumbersInRangeOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=40;
		boolean[] ans= new boolean[n+1];
		for(int i=0 ;i<n ;i++) {
			System.out.println(i +" = " + ans[i]);
			}
			isPrime(n,ans);
			for(int i=0 ;i<n ;i++) {
			System.out.println(i +" = " + ans[i]);
			}
		
	}
//ans is false if no. is prime
	public static void isPrime(int n,boolean[] ans) {
		
		for(int i=2 ;i*i<n ;i++) {
			if(!ans[i]) {
				for(int j= i*2;j<= n ;j+=i) {
					ans[j]=true;
				}
			}
		}
		
		
	}
}
