package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.ItemsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject4;
import org.openspace_map.model.Item;

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

@Path("/items")


@io.swagger.annotations.Api(description = "the items API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ItemsApi  {

    @Inject ItemsApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint.", notes = "Get list of all Items", response = Item.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Item.class, responseContainer = "List") })
    public Response getItems(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItems(securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "POST endpoint.", notes = "Saving buffered items after editing finish.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response postItemsSave(@ApiParam(value = "" ) @Valid InlineObject4 inlineObject4,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postItemsSave(inlineObject4,securityContext);
    }
}
