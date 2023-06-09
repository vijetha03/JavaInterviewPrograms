package tests;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		System.out.println(service.getEmployees());
		//service.getEmployees().stream().map(e->e.getEmpid()).collect(Collectors.groupingBy())
	}

}
