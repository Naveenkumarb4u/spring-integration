package com.rythmos.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rythmos.model.Employee;


@Service
public class IEmployeeServiceImpl implements IEmployeeService {
	List<Employee> employees;
	public Employee saveEmployee(Employee emp) {
		employees	= new ArrayList();
		employees.add(emp);
		System.out.println("=========_____+++++++++");
		System.out.println(employees);
		return emp;

	}

	public String sendEmployee(String abcd) {
		System.out.println(this+"sendEmployee method called");
		return "HelllllllloooooooGETRequest:" + abcd;
	}

}
