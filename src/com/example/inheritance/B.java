package com.example.inheritance;

public class B extends A{
	@Override
	public void fun() {
		System.out.println("In B");
		super.fun();
	}
}
