/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.ItemProveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
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
