/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.UsuarioFacadeLocal;
import entities.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Geovanny
 */
public class UsuarioBean implements Serializable {

    @EJB
    UsuarioFacadeLocal usuarioCtrl;
    private Usuario usuario;
    private List<Usuario> usuarios;

    public UsuarioBean() {
        usuario = new Usuario();
        usuarios = new ArrayList();
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
                return "ir.pagina.admin";
            }
        }
        usuario = new Usuario();
        return "registro";
    }
}
