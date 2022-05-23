package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.MapApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import org.openspace_map.model.InlineResponse20010;
import org.openspace_map.model.InlineResponse20012;

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

@Path("/map")


@io.swagger.annotations.Api(description = "the map API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class MapApi  {

    @Inject MapApiService service;

    @GET
    @Path("/item_search/{itemName}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Query for getting items by its names with number of zone. It needs to everyone can see list of item in zone.", response = InlineResponse20010.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse20010.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getItemsItemType( @PathParam("itemName") String itemName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemsItemType(itemName,securityContext);
    }
    @GET
    @Path("/employee_placement/{employee_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Searching employee placement.", response = InlineResponse20012.class, tags={ "employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse20012.class) })
    public Response getMapEmployeePlacementEmployeeId( @PathParam("employee_id") BigDecimal employeeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMapEmployeePlacementEmployeeId(employeeId,securityContext);
    }
}
