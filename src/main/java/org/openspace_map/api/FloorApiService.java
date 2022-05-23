package org.openspace_map.api;

import org.openspace_map.api.*;
import org.openspace_map.model.*;


import org.openspace_map.model.InlineResponse2004;
import org.openspace_map.model.InlineResponse2005;

import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public interface FloorApiService {
      Response deleteFloorBuildingIdDelete(Integer floorId,SecurityContext securityContext)
      throws NotFoundException;
      Response getBuildingFloorNumberWalls(Integer floorId,SecurityContext securityContext)
      throws NotFoundException;
      Response getBuildingFloorZones(Integer floorId,SecurityContext securityContext)
      throws NotFoundException;
}
