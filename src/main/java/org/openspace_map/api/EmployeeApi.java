package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.EmployeeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject;
import org.openspace_map.model.InlineObject1;
import org.openspace_map.model.InlineResponse2001;

import java.util.Map;
import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/employee")


@io.swagger.annotations.Api(description = "the employee API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class EmployeeApi  {

    @Inject EmployeeApiService service;

    @GET
    @Path("/{employee_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Query for getting full information of the user. It needs when employee wants to know more information about some user.  Returns personal information about user.", response = InlineResponse2001.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getSearchEmployee( @PathParam("employee_id") Integer employeeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSearchEmployee(employeeId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "POST endpoint", notes = "Registration of new user in open-space-map service. ", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 203, message = "Non-Authoritative Information", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response postEmployee(@ApiParam(value = "" ) @Valid InlineObject inlineObject,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postEmployee(inlineObject,securityContext);
    }
    @POST
    @Path("/{employee_id}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "POST endpoint", notes = "Query for changing fields of employee.", response = Void.class, tags={ "employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response postEmployeeEmployeeId( @PathParam("employee_id") Integer employeeId,@ApiParam(value = "" ) @Valid InlineObject1 inlineObject1,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postEmployeeEmployeeId(employeeId,inlineObject1,securityContext);
    }
}
