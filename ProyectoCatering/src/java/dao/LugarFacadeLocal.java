/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Lugar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface LugarFacadeLocal {

    void create(Lugar lugar);

    void edit(Lugar lugar);

    void remove(Lugar lugar);

    Lugar find(Object id);

    List<Lugar> findAll();

    List<Lugar> findRange(int[] range);

    int count();
    
}
