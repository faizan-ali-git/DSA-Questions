package com.example.recursionfirstlecture;

public class GCD {

	public static void main(String[] args) {

		System.out.println(lcm(8,2));
	}
	
	static int gcd(int a ,int b) {
		
		if(a==0)
			return b;
		
		
		return gcd(b%a,a);
		
		
	}
	static int lcm(int a ,int b) {
		
		
		
		return (a*b) /gcd(b%a,a);
		
		
	}

}
