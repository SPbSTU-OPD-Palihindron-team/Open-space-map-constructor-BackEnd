package org.openspace_map;
import org.openspace_map.api.ItemTypesApiService;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

public class ItemsTypesService implements ItemTypesApiService{
    @Inject
    EntityManager em;

    @Override
    public Response getItemTypes(SecurityContext securityContext){
        try{
            em.getTransaction().begin();
            List<?> itemTypes = em.createQuery("SELECT * from ItemType").getResultList();
            em.getTransaction().commit();
            return Response.ok(itemTypes).build();
        }
        catch (Exception e){
            return Response.status(400).build();
        }
    }
}
