package com.subsetproblems;

import java.util.ArrayList;
import java.util.List;



public class ReturnAllSubsetOfAnInteger {
	public static void main(String[] args) {
		int n=123,val=0,ans = Integer.MIN_VALUE;
		 for(String a:subset("", "123")) {
			//
			 System.out.println(Integer.valueOf(a));
			 if(Integer.valueOf(a)>n) {
				 val=Integer.valueOf(a);
			 ans=Math.max(val, ans);
			 }
		 }
		 System.out.println(ans);
	}
	
	public static List<String> subset(String sub, String n) {
		List<String> temp=new ArrayList<>();
		if(n.isEmpty()) {
			if(!sub.isEmpty() )
			//System.out.println(sub);
				temp.add(sub);
			return  temp; //note Forgot
		}
		
		char ch=n.charAt(0);
		List<String> l1= subset(sub, n.substring(1));
		List<String> l2=subset(sub+ch, n.substring(1));
		l1.addAll(l2);
		l1.addAll(temp);
		return l1;
		
	}

}
