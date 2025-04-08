package com.example.streamApiQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllNumbers {
	
	

	public static void main(String[] args) {
		List<Integer> l =  Arrays.asList(64, 34, 25, 12, 11, 11, 90);
		List<String> ls =  Arrays.asList("apple", "car", "hello", "sun", "tree");
		
		Optional<Integer> sum = l.stream().reduce((a,b) -> a+b);
		Optional<Integer> sum2 = l.stream().reduce(Integer::sum);
		 int sum3 = l.stream()
	                .mapToInt(Integer::intValue)
	                .sum();
	        
	        System.out.println("Sum: " + sum3);
		Optional<Integer> max = l.stream().
				reduce(Integer::max);
		Optional<Integer> max2 = l.stream().
				max((a,b) -> a - b);
		Optional<Integer> max3 = l.stream().
				max(Integer::compare);
		Optional<Integer> max4 = l.stream().
				max(Integer::compareTo);
		
//		System.out.println(sum.get());
//		System.out.println(sum2.get());
//		System.out.println(max.get());
//		System.out.println(max2.get());
//		System.out.println(max3.get());
//		System.out.println(max4.get());
		
		//even numbers
		
		List<Integer> evenNumbers = l.stream()
							.filter( el -> el%2==0)
								.collect(Collectors.toList());
		//even numbers sum
		
		Integer evenNumbersSum = l.stream()
				.filter( el -> el%2==0)
				.mapToInt(Integer::intValue)
				.sum();
		
		
		//even numbers sum
		
		long evenNumbersCount = l.stream()
				.filter( el -> el%2==0)
				.mapToInt(Integer::intValue)
				.count();
//		System.out.println(evenNumbers);
//		System.out.println(evenNumbersSum);
//		System.out.println(evenNumbersCount);
		
		Optional<Integer> min = l.stream().
				min((a,b) -> a - b);
		Optional<Integer> min2 = l.stream().
				min(Integer::compare);
		
		List<String> sortedList = ls.stream().
				sorted(String::compareTo)
				//sorted()     "or"
				.collect(Collectors.toList());
		
		List<Integer> res = l.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		List<String> evenToUpperString = ls.stream().
										//or 	map(s-> s.toUpperCase())
											map(String::toUpperCase) 
										.collect(Collectors.toList());  
	//	System.out.println(evenToUpperString);
		//evenToUpperDistinct
		
		List<Integer> evenToUpperDistinct = l.stream().
													distinct()
													.collect(Collectors.toList());  
		
	//	System.out.println(evenToUpperDistinct);
		
		List<Integer> sortedNumbers = l.stream()
                .sorted()
                .collect(Collectors.toList());

            //    System.out.println(sortedNumbers);
		Map<Integer, List<String>> groupByLength = ls.stream()
				
				.collect(Collectors.groupingBy(String::length));
		
		  // System.out.println(groupByLength);
		
		//Concatenate All Strings in a List
		String result = ls.stream()
                .collect(Collectors.joining(", "));

	//***********************************************************
		// Two unsorted lists
        List<Integer> list1 = Arrays.asList(5, 1, 9, 3);
        List<Integer> list2 = Arrays.asList(8, 2, 6, 4);

        // Merging and sorting the lists using Stream
        List<Integer> sortedListCon = Stream.concat(list1.stream(), list2.stream()) // Merge the lists
                                         .sorted()                              // Sort the elements
                                         .collect(Collectors.toList());         // Collect into a list

        // Print the sorted list
        System.out.println("Sorted Merged List: " + sortedListCon);
		
		
		
        System.out.println("Concatenated string: " + res);
		
        

	}

}
