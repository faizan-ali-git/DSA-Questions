// Java program to demonstrate Multiple Inheritance
// through default methods

// Interface 1
package com.example.test;

//Java program to demonstrate How Diamond Problem
//Is Handled in case of Default Methods

//Interface 1
interface GPI {

	// Default method
	default void show() {

		// Print statement
		System.out.println("Default GPI");
	}
}

//Interface 2
//Extending the above interface
interface PI1 extends GPI {
//	@Override
//	default void show() {
//
//		// Print statement
//		System.out.println("Default PI1");
//	}
}

//Interface 3
//Extending the above interface
interface PI2 extends GPI {
	@Override
	default void show() {

		// Print statement
		System.out.println("Default PI2");
	}
}

//Main class
//Implementation class code
class TestClass implements GPI {

	// Main driver method
	public static void main(String args[]) {

		// Creating object of this class
		// in main() method
		TestClass d = new TestClass();

		// Now calling the function defined in interface 1
		// from whom Interface 2and 3 are deriving
		d.show();
	}

	@Override
	public void show() {
	//	System.out.println("Default TestClass");
		 GPI.super.show();
	}}
