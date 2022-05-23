package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.ItemTypesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2006;

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

@Path("/item_types")


@io.swagger.annotations.Api(description = "the item_types API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ItemTypesApi  {

    @Inject ItemTypesApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Your GET endpoint", notes = "Returns all availible items to place on map.", response = InlineResponse2006.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2006.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getItemTypes(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemTypes(securityContext);
    }
}
