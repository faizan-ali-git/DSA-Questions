package com.example.dsaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
	public static void main(String[] args) {

		String[] arr = {"Article", "for", "Geeks", "for", "Geeks"};
		String[] arr2 = {"Article", "Geeks", "Geeks"};
		
		System.out.println(Arrays.toString(CommonElementsBetweenTwoArrays(arr,arr2)));
		//System.out.println(Arrays.toString(removeDuplicatesUsingSet(arr, 101)));
	}

	public static String[] CommonElementsBetweenTwoArrays(String[] arr,String[] arr2) {

		
		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<String>();
		
		for(String s : arr) {
			//map.put(s, map.getOrDefault(s, 0) +1);
		
			set.add(s);
		}
		for(String s : arr2) {
			
//			if(map.containsKey(s)) {
//				map.remove(s);
				if(set.contains(s)) {
					set.remove(s);
					list.add(s);	
			}
		}
		
		
//		for(Map.Entry<String, Integer> m : map.entrySet()) {
//			if(m.getValue() >1)
//				list.add(m.getKey());
//		}
		
		return list.toArray(new String[0]);
	}

public static Integer[] removeDuplicatesUsingSet(int[] arr, int val) {

		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		int[] res = new int[set.size()];
//		for(int i=0 ;i<set.size() ;i++) {
//			res[i] = set; //not possible because set don't have get method
//		}
		return set.toArray(new Integer[0]);
	}
	

}
