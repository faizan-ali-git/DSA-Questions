package com.example.dsaQuestions;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/valid-expression1025/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class ValidExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{()}}[]";
		System.out.println(validate(str));
	}

	public static boolean validate(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (!stack.isEmpty()) {
					if (s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == '}' && stack.peek() == '{'
							|| s.charAt(i) == ']' && stack.peek() == '[')
						stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
