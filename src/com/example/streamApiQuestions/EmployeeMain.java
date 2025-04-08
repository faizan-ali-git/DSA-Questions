package com.example.streamApiQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;



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
											.filter(emp ->emp.getSalary() >75000)
											.collect(Collectors.toList());
		
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
		//	System.out.println(ifAgePresent);
			
			//19th November
			
			//1. Find all employees earning more than a certain salary
			
			List<String> empList1= employees.stream().
										filter(e -> e.getSalary()>90000)
										.map(Employee::getName)
										.collect(Collectors.toList());
			
			//2. Get a list of all unique departments
			Map<String, List<Employee>> empList2 = employees.stream().
										collect(Collectors.groupingBy(Employee::getDepartment));

		

			//3. Find the highest-paid employee
			String name = employees.stream().
							//mapToInt(Employee::getSalary).
							max(Comparator.comparing(Employee::getSalary)).
							get().getName()							
							;
			
			
//4. Calculate the average salary of all employees
							double av = employees.stream().
									mapToDouble(Employee::getSalary).
									average().
									orElse(0);
							
							// Find all employees with a salary greater than 50,000.
							
							 
							 List<Employee> result = employees.stream()
							                                   .filter(emp -> emp.getSalary() > 50000)
							                                   .collect(Collectors.toList());

							 result.forEach(System.out::println);
							// 2. Get a list of all employee names.
							
							 
							 List<String> employeeNames = employees.stream()
							                                       .map(Employee::getName)
							                                       .collect(Collectors.toList());

							 System.out.println(employeeNames);
							// 3. Find the highest-paid employee.
							
							 
							 Optional<Employee> highestPaid = employees.stream()
							                                           .max(Comparator.comparingDouble(Employee::getSalary));
							// .max(Comparator.comparing(Employee::getSalary)); "or"

							 highestPaid.ifPresent(System.out::println);
							// 4. Calculate the total salary of all employees.
							
							 
							 double totalSalary = employees.stream()
							                               .mapToDouble(Employee::getSalary)
							                               .sum();

							 System.out.println("Total Salary: " + totalSalary);
							// 5. Group employees by their department.
							
							 
							 Map<String, List<Employee>> employeesByDepartment = employees.stream()
							                                                              .collect(Collectors.groupingBy(Employee::getDepartment));

							 employeesByDepartment.forEach((department, empList) -> {
							     System.out.println(department + ": " + empList);
							 });
							// 6. Find the average salary of employees in the "IT" department.
							
							 
							 OptionalDouble avgSalary = employees.stream()
							                                     .filter(emp -> "IT".equals(emp.getDepartment()))
							                                     .mapToDouble(Employee::getSalary)
							                                     .average();

							 System.out.println("Average Salary in IT: " + (avgSalary.isPresent() ? avgSalary.getAsDouble() : 0.0));
							// 7. Get the names of employees sorted by their salary in descending order.
							
							 
							 List<String> sortedNames = employees.stream()
							                                     .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
							                                     .map(Employee::getName)
							                                     .collect(Collectors.toList());

							 System.out.println(sortedNames);
							// 8. Find employees whose names start with "A".
							
							 
							 List<Employee> employeesWithA = employees.stream()
							                                          .filter(emp -> emp.getName().startsWith("A"))
							                                          .collect(Collectors.toList());

							 employeesWithA.forEach(System.out::println);
							// 9. Check if any employee earns more than 100,000.
							
							 
							 boolean hasHighEarner = employees.stream()
							                                  .anyMatch(emp -> emp.getSalary() > 100000);

							 System.out.println("Any employee earning >100,000: " + hasHighEarner);
							// 10. Get the second-highest salary in the employee list.
							
							 
							 String secondHighestSalary = employees.stream()
							                                                 //.map(Employee::getSalary)
							                                                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())  
							                                                // .sorted(Comparator.reverseOrder())
							                                                 .skip(1)
							                                                 .findFirst().get().getName();
							 //"OR"
							 Optional<Double> secondHighestSalary2 = employees.stream()
                                     .map(Employee::getSalary)
                                     .sorted(Comparator.reverseOrder())
                                     .skip(1)
                                     .findFirst();
							 System.out.println("Second Highest Salary: " + secondHighestSalary2.orElse(0.0));
							// 11. List employees earning less than the average salary.
							
							 
							 double avgSalary1 = employees.stream()
							                             .mapToDouble(Employee::getSalary)
							                             .average()
							                             .orElse(0.0);

							 List<Employee> belowAverage = employees.stream()
							                                        .filter(emp -> emp.getSalary() < avgSalary1)
							                                        .collect(Collectors.toList());

							 belowAverage.forEach(System.out::println);
							// 12. Count the number of employees in each department.
							
							 
							 Map<String, Long> departmentCount = employees.stream()
							                                              .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

							 System.out.println("12 : " +departmentCount);
						//	 13. Get the top 3 highest-paid employees.
							
							 
							 List<Employee> top3Employees = employees.stream()
							                                         .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
							                                         .limit(3)
							                                         .collect(Collectors.toList());
							 System.out.print("13 : ");
							 top3Employees.forEach(System.out::println);
							// 14. Find employees with duplicate names.
							
							 
							 Map<String, Long> nameCounts = employees.stream()
							            .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

							        List<String> duplicateNames = nameCounts.entrySet().stream()
							            .filter(entry -> entry.getValue() > 1) // Keep only names with count > 1
							            .map(Map.Entry::getKey)
							            .collect(Collectors.toList());

							        // Find employees with duplicate names
							        List<Employee> employeesWithDuplicateNames = employees.stream()
							            .filter(emp -> duplicateNames.contains(emp.getName()))
							            .collect(Collectors.toList());
							        
							 System.out.print("14 : ");
						        System.out.println("Employees with duplicate names: " + employeesWithDuplicateNames);

							
							// duplicateNames.forEach(System.out::println);
							// 15. Concatenate all employee names into a single string, separated by commas.
							
							 
							 String names = employees.stream()
							                         .map(Employee::getName)
							                         .collect(Collectors.joining(", "));

							 System.out.println(employeesWithDuplicateNames);
							
							
						//	System.out.println(s);

							
	}
}
