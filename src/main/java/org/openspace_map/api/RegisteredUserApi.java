package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.RegisteredUserApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse20011;

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

@Path("/registered_user/is_admin/{user_id}")


@io.swagger.annotations.Api(description = "the registered_user API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class RegisteredUserApi  {

    @Inject RegisteredUserApiService service;

    @GET
    
    
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Request which check status of person (admin or not)", response = InlineResponse20011.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse20011.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getUser( @PathParam("user_id") Integer userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUser(userId,securityContext);
    }
    @PUT
    
    
    
    @io.swagger.annotations.ApiOperation(value = "PUT endpoint", notes = "Query for editing employee's information. User can change only password. ", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response putRegistratedUserUserId( @PathParam("user_id") Integer userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putRegistratedUserUserId(userId,securityContext);
    }
}
