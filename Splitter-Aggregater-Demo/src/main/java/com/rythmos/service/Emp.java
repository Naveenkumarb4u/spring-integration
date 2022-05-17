package com.rythmos.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/emp")
public interface Emp {
	
	@POST
	@Produces("text/plain")
	@Consumes("text/plain")
	@Path("/msg")
	public String test(String str);
}
