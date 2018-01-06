/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.TipoLugar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eduardo
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
