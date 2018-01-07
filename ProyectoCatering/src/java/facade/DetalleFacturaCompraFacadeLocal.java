/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.DetalleFacturaCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface DetalleFacturaCompraFacadeLocal {

    void create(DetalleFacturaCompra detalleFacturaCompra);

    void edit(DetalleFacturaCompra detalleFacturaCompra);

    void remove(DetalleFacturaCompra detalleFacturaCompra);

    DetalleFacturaCompra find(Object id);

    List<DetalleFacturaCompra> findAll();

    List<DetalleFacturaCompra> findRange(int[] range);

    int count();
    
}
