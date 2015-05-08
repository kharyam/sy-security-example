package com.example.switchyard.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@RequestScoped
@Path("/")
public interface MembersServiceResource {

	
	@GET
	@Path("/v1")
	public void callMembersV1(@QueryParam("payload") String payload);
	
	@GET
	@Path("/v2")
	public void callMembersV2(@QueryParam("payload") String payload);

}