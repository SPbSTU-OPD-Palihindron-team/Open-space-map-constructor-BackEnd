package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.ItemApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2007;

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

@Path("/item/{item_id}")


@io.swagger.annotations.Api(description = "the item API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ItemApi  {

    @Inject ItemApiService service;

    @DELETE
    
    
    
    @io.swagger.annotations.ApiOperation(value = "DELETE endpoint", notes = "Query for deleting an item for admin, it shows at map.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response deleteItemsItemId( @PathParam("item_id") Integer itemId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteItemsItemId(itemId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Returns item by its id.", response = InlineResponse2007.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2007.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getItemsItemId( @PathParam("item_id") Integer itemId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemsItemId(itemId,securityContext);
    }
}
