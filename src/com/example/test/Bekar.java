package com.example.test;

import java.util.function.Supplier;

public class Bekar {

	public static void main(String[] args) {

		StaticTest obj = new StaticTest();
		obj.fun2();

		Supplier<Integer> s =  () ->  2;
				

		System.out.println(s.get());

	}
}
