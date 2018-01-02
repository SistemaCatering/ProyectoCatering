/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.ItemProveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface ItemProveedorFacadeLocal {

    void create(ItemProveedor itemProveedor);

    void edit(ItemProveedor itemProveedor);

    void remove(ItemProveedor itemProveedor);

    ItemProveedor find(Object id);

    List<ItemProveedor> findAll();

    List<ItemProveedor> findRange(int[] range);

    int count();
    
}
