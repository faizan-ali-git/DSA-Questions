package com.example.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		MyLinkedList ls = new MyLinkedList();
		ls.insertStart(1);
		ls.insertStart(6);
		ls.insertStart(51);
		ls.insertStart(1);
		ls.insertStart(7);

		 ls.display();
		Integer[] arr = new Integer[] { 5, 8, 9 };

//		List<Integer> l = Arrays.asList(new Integer[] { 5, 8 });
//		System.out.println(l);

		MyStack stack = new MyStack();
		stack.push(12);
		stack.push(15);
		stack.push(19);
		stack.push(17);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(21);
		stack.push(44);
		
//		stack.display();
//		stack.pop();
//		
//		stack.display();
		
	}

}
