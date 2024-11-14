package com.example.test;

import java.lang.ClassLoader;
public class Test2 {

	public static void main(String[] args)  {
		int i;
		System.out.println("Main Method called");
Test2 t= new Test2();

		Human hum =new Human();
		Human hum1 =new Human();
		System.out.println(hum.equals(hum1));
		//System.out.println(Human.arrogant);
	}
	static {
		System.out.println("static block Test2");
	}
	
	
}
class Mamals{
	int noOfLegs;
	boolean canFly;
	@Override
	public String toString() {
		return "Mamals [noOfLegs=" + noOfLegs + ", canFly=" + canFly + "]";
	}
	static {
		System.out.println("static block mamals");
	}
}
class Human extends Mamals{
	
	public Human() {
		System.out.println("Default constructor");
		System.out.println(this.height);
	}
	{
		this.noOfLegs=2;
		this.canFly=false;
		System.out.println("Intialization Block");
		System.out.println("Intialization Block"+this.height);
	}
	
	static{
		arrogant="High";
		System.out.println("Satic Initialization Block Human");
	}
	int faces;
	float height;
	String name;
	String address;
	static String arrogant;
	@Override
	public String toString() {
		return "Human [faces=" + faces + ", height=" + height + ", name=" + name + ", address=" + address + "]";
	}
	
}