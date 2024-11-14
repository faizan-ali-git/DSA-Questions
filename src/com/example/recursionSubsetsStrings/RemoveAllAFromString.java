package com.example.recursionSubsetsStrings;

import java.util.ArrayList;

public class RemoveAllAFromString {

	public static void main(String[] args) {

		// System.out.println(removeA("abacaadhasd"));
		// System.out.println(removeA2("abacaadhasd", ""));
	//	subsetOfString("abc", "");
		//System.out.println(subsetOfStringReturnList("abc", ""));
		System.out.println(removeAppNotApple("abcapplefrgappp", ""));
		//System.out.println(removeApple("abcapplefrgappp", ""));
	}

	static String removeA(String s) {

		if (s.isEmpty())
			return "";

		char ch = s.charAt(0);
		if (ch == 'a')
			return removeA(s.substring(1));
		else
			return ch + removeA(s.substring(1));
	}

	static String removeA2(String up, String p) {

		if (up.isEmpty())
			return p;

		char ch = up.charAt(0);
		if (ch == 'a')
			return removeA2(up.substring(1), p);
		else
			return removeA2(up.substring(1), p + ch);
	}

	static void subsetOfString(String up, String p) {

		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subsetOfString(up.substring(1), p + ch);

		subsetOfString(up.substring(1), p);
	}

	static ArrayList<String> subsetOfStringReturnList(String up, String p) {

		if (up.isEmpty()) {
			ArrayList<String> l = new ArrayList<>();
			l.add(p);
			return l;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subsetOfStringReturnList(up.substring(1), p + ch);

		ArrayList<String> right = subsetOfStringReturnList(up.substring(1), p);
//		ArrayList<String> ans= new ArrayList<String>();
//		ans.addAll(left);
//		ans.addAll(right);
//		
//		return ans;
		left.addAll(right);
		return left;
	}
	static String removeApple(String up, String p) {

		if (up.isEmpty())
			return p;

		
		if (up.startsWith("apple"))
			return removeApple(up.substring(5), p);
		else
			return removeApple(up.substring(1), p + up.charAt(0));
	}
	static String removeAppNotApple(String up, String p) {
		
		if (up.isEmpty())
			return p;
		
		
		if (up.startsWith("app") && !up.startsWith("apple"))
			return removeAppNotApple(up.substring(3), p);
		else
			
			return removeAppNotApple(up.substring(1), p + up.charAt(0));
	}


}
