package com.example.recursionfirstlecture;

public class StepsToMakeaNumberZero {

	public static void main(String[] args) {

		System.out.println(countSteps(41));
		System.out.println(countSteps2(41,0));
	}
	
	static int countSteps(int n) {
		
		if(n ==0)
			return 0;
		
		if(n%2 == 0)
			return countSteps(n/2)+1;
		else
			return countSteps(n-1)+1;
	}
	static int countSteps2(int n,int steps) {
		
		if(n ==0)
			return steps;//beacsue number is already zero
		
		if(n%2 == 0)
			return countSteps2(n/2,steps+1);
		else
			return countSteps2(n-1,steps+1);
	}

}
