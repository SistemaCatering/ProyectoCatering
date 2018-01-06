/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.FacturaVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
 */
@Local
public interface FacturaVentaFacadeLocal {

    void create(FacturaVenta facturaVenta);

    void edit(FacturaVenta facturaVenta);

    void remove(FacturaVenta facturaVenta);

    FacturaVenta find(Object id);

    List<FacturaVenta> findAll();

    List<FacturaVenta> findRange(int[] range);

    int count();
    
}
