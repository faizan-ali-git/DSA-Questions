package com.example.recursionfirstlecture;

public class PrintInReverse {

	public static void main(String[] args) {
		reverse(5);
		System.out.println("-------------------");
		printInStraightOrder(5);
	}

	static void reverse(int n) {

		if (n == 0)
			return;
		System.out.println(n);

		reverse(n - 1);
	}
	static void printInStraightOrder(int n) {
		
		if (n == 0)
			return;
		
		
		printInStraightOrder(n - 1);
		
		System.out.println(n);
	}
	
}
