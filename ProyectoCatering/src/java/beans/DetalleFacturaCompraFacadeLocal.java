/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.DetalleFacturaCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
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
