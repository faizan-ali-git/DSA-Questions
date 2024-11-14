package com.example.streamApiQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Alice", 75000, "IT", 30),
			    new Employee(2, "Bob", 80000, "Finance", 35),
			    new Employee(3, "Charlie", 70000, "IT", 40),
			    new Employee(4, "David", 95000, "Finance", 45),
			    new Employee(5, "Eve", 50000, "HR", 25)
			);
		
		List<Employee> greaterThanSalary = employees.stream()
											.filter(emp ->emp.getSalary() >75000).collect(Collectors.toList());
		
		List<String> greaterThanSalaryNames = employees.stream()
				.filter(emp ->emp.getSalary() >75000)
				.map(Employee::getName)
				.collect(Collectors.toList());
		Comparator<Employee> comparator= new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			
			}
		};
			
		
		
		
		Optional<String> greaterThanSalaryHighest = employees.stream()
				.max((o1,o2) ->(int) (o1.getSalary() - o2.getSalary()))
//	or			.max(Comparator.comparing(Employee::getSalary))
				.map(Employee::getName);
//				.map(Employee::getName)
//				.collect(Collectors.toList());
		
		double greaterThanSalaryAvg = employees.stream()
				.mapToDouble(Employee::getSalary)
				.average().
				orElse(0.0);
		List<String> employeeWorkingInIT = employees.stream()
									.filter(emp -> emp.getDepartment().equals("IT"))
									.map(Employee::getName)
									.collect(Collectors.toList());
		
		List<String> employeeSortedIncAge = employees.stream()
									.sorted(Comparator.comparing(Employee::getAge)
											.reversed())//for descending

									.map(Employee::getName)
									.collect(Collectors.toList());
		
		Map<String, List<Employee>> groupByDep = employees.stream()
				
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		int companyExpenditure = (int) employees.stream()
									.mapToDouble(Employee::getSalary)
									.sum();
		Map<Boolean, List<Employee>> partitionedByAge = employees.stream()
			    .collect(Collectors.partitioningBy(emp -> emp.getAge() < 40));

//			partitionedByAge.forEach((isYoung, empList) -> {
//			    System.out.println(isYoung ? "Younger than 40:" : "40 and older:");
//			    empList.forEach(System.out::println);
//			});
			
			Map<String, Long> CountEmployeesEachDepartment= employees.stream()
										.collect(Collectors.groupingBy(Employee::getDepartment
												,Collectors.counting()));
			
			String allNames = employees.stream()
									.map(Employee::getName)
									.collect(Collectors.joining(",") );
			
			Optional<Employee> allSalary =employees.stream()
									//	.map(Employee::getSalary)
										.max(Comparator.comparing(Employee::getSalary));
										//.collect(Collectors.toList());
		boolean ifAgePresent = employees.stream()
								.anyMatch(e->e.getAge()==26);
			System.out.println(ifAgePresent);
	}
}
