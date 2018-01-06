/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TipoLugar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface TipoLugarFacadeLocal {

    void create(TipoLugar tipoLugar);

    void edit(TipoLugar tipoLugar);

    void remove(TipoLugar tipoLugar);

    TipoLugar find(Object id);

    List<TipoLugar> findAll();

    List<TipoLugar> findRange(int[] range);

    int count();
    
}
