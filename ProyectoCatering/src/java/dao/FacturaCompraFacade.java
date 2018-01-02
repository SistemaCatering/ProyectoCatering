/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.FacturaCompra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Geovanny
 */
@Stateless
public class FacturaCompraFacade extends AbstractFacade<FacturaCompra> implements FacturaCompraFacadeLocal {
    @PersistenceContext(unitName = "ProyectoCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturaCompraFacade() {
        super(FacturaCompra.class);
    }
    
}
