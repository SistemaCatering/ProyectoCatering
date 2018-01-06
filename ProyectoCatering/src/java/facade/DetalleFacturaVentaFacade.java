/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.DetalleFacturaVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eduardo
 */
@Stateless
public class DetalleFacturaVentaFacade extends AbstractFacade<DetalleFacturaVenta> {

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
