package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.WallsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject6;
import org.openspace_map.model.Zone;

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

@Path("/walls")


@io.swagger.annotations.Api(description = "the walls API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class WallsApi  {

    @Inject WallsApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "POST endpoint", notes = "Save walls.", response = Zone.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "wall", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Zone.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response postWallsSave(@ApiParam(value = "" ) @Valid InlineObject6 inlineObject6,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postWallsSave(inlineObject6,securityContext);
    }
}
