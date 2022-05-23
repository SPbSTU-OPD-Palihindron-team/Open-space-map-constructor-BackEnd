package org.openspace_map.api;

import org.openspace_map.api.*;
import org.openspace_map.model.*;


import org.openspace_map.model.InlineObject;
import org.openspace_map.model.InlineObject1;
import org.openspace_map.model.InlineResponse2001;

import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public interface EmployeeApiService {
      Response getSearchEmployee(Integer employeeId,SecurityContext securityContext)
      throws NotFoundException;
      Response postEmployee(InlineObject inlineObject,SecurityContext securityContext)
      throws NotFoundException;
      Response postEmployeeEmployeeId(Integer employeeId,InlineObject1 inlineObject1,SecurityContext securityContext)
      throws NotFoundException;
}
