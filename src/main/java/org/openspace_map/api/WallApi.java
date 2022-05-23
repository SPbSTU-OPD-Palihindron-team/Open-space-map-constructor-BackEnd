package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.WallApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject5;

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

@Path("/wall/{wall_id}")


@io.swagger.annotations.Api(description = "the wall API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class WallApi  {

    @Inject WallApiService service;

    @DELETE
    
    
    
    @io.swagger.annotations.ApiOperation(value = "DELETE endpoint", notes = "Query for deleting a wall for admin, it shows at map.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "wall", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response deleteWallWallId( @PathParam("wall_id") Integer wallId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteWallWallId(wallId,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "PUT endpoint", notes = "Edit walls for admin.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "wall", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response putWallsWallIdEdit( @PathParam("wall_id") Integer wallId,@ApiParam(value = "" ) @Valid InlineObject5 inlineObject5,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putWallsWallIdEdit(wallId,inlineObject5,securityContext);
    }
}
