/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import facade.UsuarioFacadeLocal;
import entities.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;

/**
 *
 * @author Geovanny
 */
class CompararTipoUsuario implements Comparator<SelectItem> {

    @Override
    public int compare(SelectItem o1, SelectItem o2) {
        return o1.getValue().toString().compareTo(o2.getValue().toString());
    }
}

public class UsuarioBean implements Serializable {

    @EJB
    UsuarioFacadeLocal usuarioCtrl;
    private List<SelectItem> tipoUsuario;
    private Usuario usuario;
    private List<Usuario> usuarios;

    public UsuarioBean() {
        tipoUsuario = new ArrayList();
        tipoUsuario.add(new SelectItem("Administrador", "Administrador"));
        tipoUsuario.add(new SelectItem("Comun", "Comun"));
        usuario = new Usuario();
        usuarios = new ArrayList();
    }

    public List<SelectItem> getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(List<SelectItem> tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String modificar(Usuario usuario) {
        this.usuario = usuario; //le mando el mismo usuario de mi objeto para que se modifique
        return "ir.formulario.persona";
    }

    public String guardar() {
        if (usuario != null) {
            if (usuario.getCodUsu() == null) {
                usuarioCtrl.create(usuario);
            } else {
                usuarioCtrl.edit(usuario);
            }
        }
        usuario = new Usuario();
        return "ir.pagina.principal";//se va a ir al una pagina home
    }

    public String borrar(Usuario usuario) {//retorna null por que se queda dentro de la tabla 
        if (usuario != null) {
            usuarioCtrl.remove(usuario);//para borrar a una persona
        }
        return null;
    }

    public String insertar() {
        usuario = new Usuario();
        return "ir.formulario.persona";//porque se va a ir a un formulario
    }

    public String login() {
        usuarios = usuarioCtrl.findAll();
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getEmailUsu().equals(usuario.getEmailUsu()) && usuario1.getContrasenaUsu().equals(usuario.getContrasenaUsu())) {
                if (usuario1.getTipoUsu().equals("Administrador")) {

                    return "ir.pagina.admin";
                } else if (usuario1.getTipoUsu().equals("Comun")) {

                    return "ir.pagina.comun";
                }
            }
        }
        usuario = new Usuario();
        return "registro";
    }
}
