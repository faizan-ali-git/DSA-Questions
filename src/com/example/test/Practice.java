package com.example.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

//	public static int i;
//	
//	public static void  fun() {
//		System.out.println("In static method");
//	}
//	public  void  fun2() {
//		System.out.println("In instance method");
//	}
//	public Practice(){
//		System.out.println("In constructor");
//	}
//	static {
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In static block2");
//		}
//	}
//	
//	static {
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In static block");
//		}
//	}
//	
//	{
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In instance block");
//		}
//	}
//	{
//		i = 9;
//		try {
//			System.out.println(i / 0);
//		} catch (Exception e) {
//			System.out.println("In instance block2");
//		}
//	}

	// Method 1
	public static void main(String[] args) {

		String s1 = "i am Geeks for Geeks and a Geek";
		String s2 = "kseegd";
		int[] arr = new int[] {2,2,2,2,2 };
		List<Integer> l = Arrays.asList(2,2,2,2,2);
		User u1 = new User(1, "u1", 1000);
		User u2 = new User(0, "u2", 2000);
		User u3 = new User(0, "u2", 5000);
		User u4 = new User(0, "u2", 200);
		User u5 = new User(0, "u2", 120000);
		User u6 = new User(0, "u2", 2500);
		MyComparator comp = new MyComparator();
		List<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		list.add(u6);
		Comparator<User> c = (o1, o2) -> o2.getSlaray() - o1.getSlaray();

		// Optinal
		String nullableString = null;
		Optional<String> optionalFromNullable = Optional.ofNullable(nullableString);
		if (optionalFromNullable.isPresent()) {
			System.out.println("Value is present: " + optionalFromNullable.get());
		} else {
			System.out.println("Value is absent");
		}

		// System.out.println(optionalFromNullable.get());

		System.out.println((removeDuplicates(l)));
//		l.stream().close();
//		System.out.println(binarySearch(arr, 5));

//		Optional<User> u= list.stream().
//					sorted((uF,uS) -> uF.getSlaray() - uS.getSlaray()).					
//					findFirst();
//		System.out.println(u.toString());
		// System.out.println(Arrays.toString(fun(arr)));
//	//	System.out.println(Arrays.toString(fun(s1)));
		// List<List<String>> list =
		// Arrays.asList(Arrays.asList("Biology","Zology","Chemistry","Math"),
//				Arrays.asList("Java","C","Python","CSharp"),
//				Arrays.asList("Fazian","Ali","Bushra","Naz"));
		// List<String> list = Arrays.asList("Fazian","Ali","Bushra","Naz");
//		List<String> list2 =list.stream().
//		 			//filter(s -> s.stream().filter(sInner -> sInner.startsWith("C"))).
//		 			flatMap(List::stream)
//		 				.map(c -> c.toUpperCase())
//		 					.filter(c -> c.length()<4)
//							//.forEach(s -> System.out.println(s));
//		 					.collect(Collectors.toList());
//		
		// System.out.println(list2);
	}

	
	public static int[]  removeDuplicates(int[] arr) {

			
			
			int pos=0;
			
			for(int i=1 ; i<arr.length ;i++) {
				if(arr[pos] != arr[i]) {
					pos++;
					arr[pos] = arr[i];
				}
			}
			int[] res= new int[pos+1];
			for(int i=0 ;i<pos+1 ;i++) {
			res[i]= arr[i];
			}
			
			return res;
	}
	public static int  removeDuplicates(List<Integer> list) {
		
		
		
		int pos=0;
		
		for(int i=1 ; i<list.size() ;i++) {
			if(list.get(pos) != list.get(i)) {
				pos++;
				
			}
		}
		
		
		return pos+1;
	}

//		
//		
//		
//		
//		
//	}
	public static String[] fun(String str) {

		// String[] arr= str.split(" ");
		Map<Character, Integer> map = new HashMap<>();
//		for(int i=0 ;i<str.length() ; i++) {
//			if(map.getOrDefault(str.charAt(i),0 ))
//				
//		}

		return null;

	}

	public static Integer binarySearch(int[] arr, int element) {

		int start = 0, end = arr.length;
		Arrays.sort(arr);

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;
	}
}

//************************************

//*********************************************************

//*************************************************

//**********************************************************************
//
//	Character[] arr = new Character[s.length()];
//
//	for (int i = 0; i < s.length(); i++) {
//		arr[i] = s.charAt(i);
//	}
//
//	Comparator<Character> com = new Comparator<Character>() {
//
//		@Override
//		public int compare(Character o1, Character o2) {
//			// TODO Auto-generated method stub
//			char c1=Character.toLowerCase(o1.charValue()) ;
//			char c2=Character.toLowerCase(o2.charValue()) ;
//			return c1- c2;
//		}
//	};
//
//	// l.sort(com);
//	Arrays.sort(arr, (o1,  o2) ->  Character.toLowerCase(o1.charValue()) - Character.toLowerCase(o2.charValue()));
//	
//	StringBuilder sb = new StringBuilder(arr.length);
//
//	for (Character c : arr)
//		sb.append(c.charValue());
//	
//	
//	System.out.println(sb);