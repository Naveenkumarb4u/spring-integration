package com.navy.repository;

import java.util.ArrayList;
import java.util.List;

import com.navy.model.Employee;

public class EmployeeRepository {
	
	public List<Employee> employees;
	
	
	public EmployeeRepository() {
	
	 employees	=	new ArrayList();
		Employee emp1 = new Employee(148,"Naveen","Rythmos");
		Employee emp2= new Employee(149,"Prakash","LM");
		employees.add(emp1);
		employees.add(emp2);
		
		
		
	}
	
	public List<Employee> getAllEmps(){
		return employees;
	}

	public  void createEmp(Employee emp) {
		
		employees.add(emp);
	}
}
