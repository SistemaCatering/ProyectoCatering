/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Parametros;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Geovanny
 */
@Local
public interface ParametrosFacadeLocal {

    void create(Parametros parametros);

    void edit(Parametros parametros);

    void remove(Parametros parametros);

    Parametros find(Object id);

    List<Parametros> findAll();

    List<Parametros> findRange(int[] range);

    int count();
    
}
