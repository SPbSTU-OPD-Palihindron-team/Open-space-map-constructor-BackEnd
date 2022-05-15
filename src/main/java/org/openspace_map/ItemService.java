package org.openspace_map;
import org.openspace_map.api.ItemApiService;
import org.openspace_map.api.NotFoundException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Transactional
@ApplicationScoped
public class ItemService implements ItemApiService {

    @Inject
    EntityManager em;

    @Override
    public Response deleteItemsItemId(Integer itemId, SecurityContext securityContext) {
        try {
            em.getTransaction().begin();
            Item item = em.find(Item.class, Long.valueOf(itemId));
            em.remove(item);
            em.getTransaction().commit();
            return Response.ok().build();
        }
        catch (Exception e){
            return Response.status(400).build();
        }
    }

    @Override
    public Response getItemsItemId(Integer itemId, SecurityContext securityContext) throws NotFoundException {
        try {
            em.getTransaction().begin();
            Item item = em.find(Item.class, Long.valueOf(itemId));
            em.getTransaction().commit();
            return Response.ok(item).build();
        }
        catch (Exception e){
            return Response.status(400).build();
        }
    }
}
