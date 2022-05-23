package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.BuildingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject2;
import org.openspace_map.model.InlineObject3;
import org.openspace_map.model.InlineResponse2003;

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

@Path("/building")


@io.swagger.annotations.Api(description = "the building API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class BuildingApi  {

    @Inject BuildingApiService service;

    @GET
    @Path("/{building_id}/floors")
    
    @Produces({ "application/json", "application/xml", "multipart/form-data" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "GET query to show floors of the chosen buiding.  It needs for choosing floor from list for special building.", response = InlineResponse2003.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "building", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2003.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getBuildingFloorsList( @PathParam("building_id") Integer buildingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBuildingFloorsList(buildingId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @io.swagger.annotations.ApiOperation(value = "POST endpoint.", notes = "request to add the building for admin, when creating map", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "building", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response postBuilding(@ApiParam(value = "" ) @Valid InlineObject3 inlineObject3,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postBuilding(inlineObject3,securityContext);
    }
    @POST
    @Path("/{building_id}/floor")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "POST endpoint", notes = "Query for adding new floor in building for admin, when creating map.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "floor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response postBuildingAdd( @PathParam("building_id") Integer buildingId,@ApiParam(value = "" ) @Valid InlineObject2 inlineObject2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postBuildingAdd(buildingId,inlineObject2,securityContext);
    }
}
