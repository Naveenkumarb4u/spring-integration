package com.rythmos.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.rythmos.model.Employee;

@Service
@Path("/employee")
@Produces("application/xml")
@Consumes("application/xml")
public interface EmployeeGateway {
	
	@POST
	@Path("/send")
	@Produces("application/xml")
	@Consumes("application/xml")
	public Employee send(Employee emp);
	
	
}
