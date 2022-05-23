package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.FloorApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2004;
import org.openspace_map.model.InlineResponse2005;

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

@Path("/floor/{floor_id}")


@io.swagger.annotations.Api(description = "the floor API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class FloorApi  {

    @Inject FloorApiService service;

    @DELETE
    
    
    
    @io.swagger.annotations.ApiOperation(value = "DELETE endpoint.", notes = "Query for deleting floor according to the building by id for admin, it shows at map.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "floor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response deleteFloorBuildingIdDelete( @PathParam("floor_id") Integer floorId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFloorBuildingIdDelete(floorId,securityContext);
    }
    @GET
    @Path("/walls")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Returns walls appropriate to the floor of the building. It shows at map.", response = InlineResponse2005.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "wall", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2005.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getBuildingFloorNumberWalls( @PathParam("floor_id") Integer floorId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBuildingFloorNumberWalls(floorId,securityContext);
    }
    @GET
    @Path("/zones")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Returns information of zones located on the chosen floor.", response = InlineResponse2004.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "zone", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2004.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getBuildingFloorZones( @PathParam("floor_id") Integer floorId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBuildingFloorZones(floorId,securityContext);
    }
}
