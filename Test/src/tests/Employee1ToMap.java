package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee1ToMap {

	public static void main(String[] args) {
		
		List<Employee1> empList = new ArrayList<>();
		
		CreateEmployeeList(empList);
		Map<String, List<Employee1>> collect = empList.stream().collect(Collectors.groupingBy(Employee1::getCity));
		
		collect.forEach((k,v)-> System.out.println("Key: "+k +" Value: "+v));
	}
	
	
	private static void CreateEmployeeList(List<Employee1> list) {
		
		Employee1 emp1 = new Employee1();
		emp1.setId(1);
		emp1.setName("Vijetha");
		emp1.setCity("Hyderabad");
		Employee1 emp2 = new Employee1();
		emp2.setId(2);
		emp2.setName("Vijetha1");
		emp2.setCity("London");
		list.add(emp1);
		list.add(emp2);
		
			
	}
	


}
