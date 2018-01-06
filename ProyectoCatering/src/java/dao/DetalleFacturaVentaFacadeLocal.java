/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.DetalleFacturaVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface DetalleFacturaVentaFacadeLocal {

    void create(DetalleFacturaVenta detalleFacturaVenta);

    void edit(DetalleFacturaVenta detalleFacturaVenta);

    void remove(DetalleFacturaVenta detalleFacturaVenta);

    DetalleFacturaVenta find(Object id);

    List<DetalleFacturaVenta> findAll();

    List<DetalleFacturaVenta> findRange(int[] range);

    int count();
    
}
