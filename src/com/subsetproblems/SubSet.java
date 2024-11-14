package com.subsetproblems;

import java.util.ArrayList;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsetReturn("", "abc"));
		System.out.println(subsetReturnAscii("", "abc"));
	}

	public static void subset(String p, String up) {
		
		if (up.isEmpty()) {
			System.out.println(p)
			;
			return ;
		}
		
		char ch = up.charAt(0);
		subset(p + ch, up.substring(1));
		subset(p, up.substring(1));
		
		

	}
	public static ArrayList<String> subsetReturn(String p, String up) {
		
		if (up.isEmpty()) {
			ArrayList<String> l= new ArrayList<>();
			l.add(p);
			return l;
		}
		ArrayList<String> local=	new ArrayList<String>();
		char ch = up.charAt(0);
		local.addAll(subsetReturn(p + ch, up.substring(1)));
		local.addAll(subsetReturn(p, up.substring(1)));
		
		return local;
		
	}
	public static ArrayList<String> subsetReturnAscii(String p, String up) {
		
		if (up.isEmpty()) {
			ArrayList<String> l= new ArrayList<>();
			l.add(p);
			return l;
		}
		
		char ch = up.charAt(0);
		ArrayList<String> first=subsetReturnAscii(p + ch, up.substring(1));
		ArrayList<String> second=subsetReturnAscii(p, up.substring(1));
		ArrayList<String> third=subsetReturnAscii(p+ (ch+0), up.substring(1));
		
		first.addAll(second);
		first.addAll(third);
		return first;
		
	}
}
