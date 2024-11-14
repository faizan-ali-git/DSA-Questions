package com.example.test;

public class MainClass {

	public static void main(String[] args) {
		Practice parent= new Practice();
//		parent.fun2();
//		Practice.fun();
		
	}
	public static void main(String[] args, int j) {
		Practice parent= new Practice();
		parent.main(new String[2]);
		ChildClass c= new ChildClass();
		c.main(new String[2]);
		Practice pc= new ChildClass();
		pc.main(new String[2]);
	}
	public static int  main(String[] args, String j) {
		Practice parent= new Practice();
		parent.main(new String[2]);
		ChildClass c= new ChildClass();
		c.main(new String[2]);
		Practice pc= new ChildClass();
		pc.main(new String[2]);
		return 0;
	}

}
