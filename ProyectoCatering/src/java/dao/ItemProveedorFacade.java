/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.ItemProveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Geovanny
 */
@Stateless
public class ItemProveedorFacade extends AbstractFacade<ItemProveedor> implements ItemProveedorFacadeLocal {
    @PersistenceContext(unitName = "ProyectoCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemProveedorFacade() {
        super(ItemProveedor.class);
    }
    
}
