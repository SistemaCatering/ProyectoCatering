/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.TipoItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Geovanny
 */
@Stateless
public class TipoItemFacade extends AbstractFacade<TipoItem> implements TipoItemFacadeLocal {
    @PersistenceContext(unitName = "ProyectoCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoItemFacade() {
        super(TipoItem.class);
    }
    
}
