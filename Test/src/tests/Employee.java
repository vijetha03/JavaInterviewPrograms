package tests;

import java.util.List;

public class Employee {

	int empid;
	String name;
	double salary;
	public Employee(int empid, String name, double salary, List<String> email, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	List<String> email;
	String dept;
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
	}
	
	public Employee(int empid, String name, List<String> email, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(int empid, String name, List<String> email) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getEmail() {
		return email;
	}
	
	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	
}
