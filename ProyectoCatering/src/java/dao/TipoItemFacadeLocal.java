/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TipoItem;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface TipoItemFacadeLocal {

    void create(TipoItem tipoItem);

    void edit(TipoItem tipoItem);

    void remove(TipoItem tipoItem);

    TipoItem find(Object id);

    List<TipoItem> findAll();

    List<TipoItem> findRange(int[] range);

    int count();
    
}
