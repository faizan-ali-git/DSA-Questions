package com.example.inheritance;

public class C extends B{
	@Override
	public void fun() {
		System.out.println("In C");
		super.fun();
		//super.fun();
		
	}
	public int add(int a, int b) {
		return a+b;
	}
	public void  add(int a, int b, int c) {
		//return a+b+c;
		Object obj;
	}
}
