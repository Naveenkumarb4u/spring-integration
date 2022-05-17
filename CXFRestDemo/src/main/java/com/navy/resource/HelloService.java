package com.navy.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/hello")					//Any webservice class can be identified by using path annotation.
public class HelloService {
	
	@GET
	@Produces("text/plain")
	@Path("/test")		
	public String sayHello(){
		
		return "Hellooo Naveen!";
	}

}