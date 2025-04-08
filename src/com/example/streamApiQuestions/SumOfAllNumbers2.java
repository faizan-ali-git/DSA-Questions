package com.example.streamApiQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllNumbers2 {
	
	

	public static void main(String[] args) {
		List<Integer> l =  Arrays.asList(64, 34, 25, 12, 11, 11, 90);
		List<String> ls =  Arrays.asList("apple", "car", "hello", "sun", "tree");
		
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Alice", 75000, "IT", 30),
			    new Employee(2, "Bob", 80000, "Finance", 35),
			    new Employee(3, "Charlie", 70000, "IT", 40),
			    new Employee(4, "David", 95000, "Finance", 45),
			    new Employee(5, "Eve", 50000, "HR", 25)
			);
		
		Comparator<Employee> com = (Employee o1, Employee o2)-> {

				return (int) (o1.getSalary() - o2.getSalary());
			
		};
		

							
		Map<String,Long> res = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("Concatenated string: " + res);
		

	}

}
