package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.WorkspaceApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineObject8;

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

@Path("/workspace")


@io.swagger.annotations.Api(description = "the workspace API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class WorkspaceApi  {

    @Inject WorkspaceApiService service;

    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Adding new workspace item.", response = Void.class, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response postWorkspace(@ApiParam(value = "" ) @Valid InlineObject8 inlineObject8,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postWorkspace(inlineObject8,securityContext);
    }
}
