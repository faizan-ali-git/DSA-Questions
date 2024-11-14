package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args )
	{
		System.out.println("Hello");
		Math.pow(2,5);
		int[] arr = new int[]{1,3,4,89,0,122,-9,2,4,86,4};
		ArrayList<Integer> e = new ArrayList<Integer>();
		//e.sort(null);
		e.add(4);
		e.add(5);
		e.add(-2);
		e.add(4);
		e.add(1);
		Arrays.sort(arr);
		System.out.println("sorted");
		for ( int i: arr )
			System.out.print(i +" ");
		
		System.out.println(e.get(3));
	}
	
   
}
