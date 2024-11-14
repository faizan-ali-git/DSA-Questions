package com.example.dataStructures;

public class MyStack {

	int[] arr ;
	int top;
	private final static int SIZE= 10;
	public MyStack() {
		this.arr= new int[SIZE];
		this.top=-1;
		
	}
	public void push(int el) {
		if(top>=SIZE-1) {
			System.out.println("Stack Overflow");
		} else {
			arr[++top] =el;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		} else {
			top--;
		}
	}
	
	public void display() {
		System.out.println("**********");
		for(int i= top ;i>=0 ;i--) {
			System.out.println(arr[i]);
		}
		System.out.println("**********");
	}
}
