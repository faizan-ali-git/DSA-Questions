package com.example.dsaQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestNonRepeatingString {

	public static void main(String[] args) {
		String str="GEEKSFORGEEKS";
		System.out.println(fun(str));
	}
	
//	public  static String fun(String str) {
//		StringBuilder sb= new StringBuilder();
//		
//		Map<Character,Integer> map= new LinkedHashMap<>();
//		for(int i=0 ;i<str.length() ;i++) {
//			if(map.get(str.charAt(i))!=null) {
//				break;
//			}
//			else {
//				map.put(str.charAt(i), 1);
//				sb.append(str.charAt(i));
//			}
//			
//		}
//		return sb.toString();
//		
//	} wrong
	
	public  static int fun(String str) {
		int len=0,maxLen=0;
		
		Map<Character,Integer> map= new LinkedHashMap<>();
		for(int i=0 ;i<str.length() ;i++) {
			if(map.get(str.charAt(i))!=null) {
				len=0;
			}
			else {
				map.put(str.charAt(i), 1);
				len++;
				maxLen=Math.max(maxLen, len);
			}
			
		}
		return maxLen;
		
	}//need sliding window

}
