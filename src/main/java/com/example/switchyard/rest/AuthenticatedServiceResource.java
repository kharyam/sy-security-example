package com.example.switchyard.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@RequestScoped
@Path("/")
public interface AuthenticatedServiceResource {

	@POST
	public String doSomething(String payload);

}