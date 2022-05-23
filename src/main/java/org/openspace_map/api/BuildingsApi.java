package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.BuildingsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2002;

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

@Path("/buildings")


@io.swagger.annotations.Api(description = "the buildings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class BuildingsApi  {

    @Inject BuildingsApiService service;

    @GET
    
    
    @Produces({ "application/json", "application/xml", "multipart/form-data" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Returning list of registered in system buildings.", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "building", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getBuilds(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBuilds(securityContext);
    }
}
