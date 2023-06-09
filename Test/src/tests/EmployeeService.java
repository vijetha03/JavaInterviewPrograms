package tests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	
	public List<Employee> getEmployees() {
			return null;
		
			}

		public static void main(String[] args) {
			
			
			List<Employee> employees = Stream.of(
					new Employee(1,"v1",Arrays.asList("v1@gmail.com","v2@gmail.com")),
					new Employee(2,"v2",Arrays.asList("v1@gmail.com","v2@gmail.com")),
					new Employee(3,"v3",Arrays.asList("v1@gmail.com","v2@gmail.com")),
					new Employee(4,"v4",Arrays.asList("v1@gmail.com","v2@gmail.com")),
					new Employee(5,"v4",Arrays.asList("v1@gmail.com","v2@gmail.com"))).collect(Collectors.toList());
			
			List<Integer> ids = employees.stream().map(e->e.getEmpid()).collect(Collectors.toList());
			
			 List<String> collect = employees.stream().flatMap(e->e.getEmail().stream()).collect(Collectors.toList());
			
			System.out.println(ids);
			System.out.println(collect);
					
			
			List<Employee> employees1 = Stream.of(
					new Employee(1,"v1",Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(2,"v2",Arrays.asList("v1@gmail.com","v2@gmail.com"),"QA"),
					new Employee(3,"v3",Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(4,"v4",Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(5,"v4",Arrays.asList("v1@gmail.com","v2@gmail.com"),"QA")).collect(Collectors.toList());
			
			Map<String, List<Employee>> deptgrouping = employees1.stream().collect(Collectors.groupingBy(e->e.getDept()));
			System.out.println(deptgrouping);
			
			
			List<Employee> employees3 = Stream.of(
					new Employee(1,"v1",20000,Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(2,"v2",25000,Arrays.asList("v1@gmail.com","v2@gmail.com"),"QA"),
					new Employee(3,"v3",50000,Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(4,"v4",35000,Arrays.asList("v1@gmail.com","v2@gmail.com"),"DEV"),
					new Employee(5,"v4",45000,Arrays.asList("v1@gmail.com","v2@gmail.com"),"QA")).collect(Collectors.toList());
			
			
			Comparator<Employee> comparingBySalary = Comparator.comparing(Employee::getSalary);
			Map<String, Optional<Employee>> employeeMap = employees3.stream().
					collect(Collectors.groupingBy(e->e.getDept(),Collectors.reducing(BinaryOperator.maxBy(comparingBySalary))));
			
			System.out.println(employeeMap);
			
			
			
			
		}
	
}
