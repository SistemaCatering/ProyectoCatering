/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.DetalleFacturaCompra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Geovanny
 */
@Stateless
public class DetalleFacturaCompraFacade extends AbstractFacade<DetalleFacturaCompra> implements DetalleFacturaCompraFacadeLocal {
    @PersistenceContext(unitName = "ProyectoCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleFacturaCompraFacade() {
        super(DetalleFacturaCompra.class);
    }
    
}
