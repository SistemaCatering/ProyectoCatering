/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.DetalleFacturaVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Geovanny
 */
@Stateless
public class DetalleFacturaVentaFacade extends AbstractFacade<DetalleFacturaVenta> implements DetalleFacturaVentaFacadeLocal {
    @PersistenceContext(unitName = "ProyectoCateringPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleFacturaVentaFacade() {
        super(DetalleFacturaVenta.class);
    }
    
}
