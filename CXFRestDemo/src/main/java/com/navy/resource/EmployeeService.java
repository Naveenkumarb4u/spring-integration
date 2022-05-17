package com.navy.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.navy.model.Employee;
import com.navy.repository.EmployeeRepository;

@Service
@Path("/employeeService")
public class EmployeeService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/employees")
	public List<Employee> getEmployees() {

		EmployeeRepository employeeRepository = new EmployeeRepository();
		System.out.println("Getting all employees...");
		return employeeRepository.getAllEmps();
	}
	
/*	public void createEmployee(Employee emp){
		System.out.println("Creating an employee........");
		EmployeeRepository.createEmp(emp);
	}
*/
}
