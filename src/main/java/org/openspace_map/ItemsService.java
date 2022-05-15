package org.openspace_map;
import org.openspace_map.api.ItemsApiService;
import org.openspace_map.api.NotFoundException;
import org.openspace_map.model.InlineObject4;
import org.openspace_map.model.Item;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@Transactional
@ApplicationScoped
public class ItemsService implements ItemsApiService{
    @Inject
    EntityManager em;

    @Override
    public Response getItems(SecurityContext securityContext) throws NotFoundException {
        try {
            em.getTransaction().begin();
            List<Item> items = em.createQuery("SELECT * from item", Item.class).getResultList();
            em.getTransaction().commit();
            return Response.ok(items).build();
        }
        catch (Exception e){
            return Response.status(400).build();
        }
    }

    @Override
    public Response postItemsSave(InlineObject4 inlineObject4, SecurityContext securityContext) throws NotFoundException {
        try {
            em.getTransaction().begin();
            for (Item item : inlineObject4.getItemList()){
                em.persist(item);
            }
            em.getTransaction().commit();
            return Response.ok().build();
        }
        catch (Exception e){
            return Response.status(400).build();
        }
    }
}
