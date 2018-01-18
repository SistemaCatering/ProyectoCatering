/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Geovanny
 */
public class NavegacionBean {

    /**
     * Creates a new instance of NavegacionBean
     */
    public NavegacionBean() {
    }

    public String paginaRegistro() {
        return "registro";
    }

    public String paginaAdmin() {
        return "ir.pagina.admin";
    }

    public String paginaGaleria() {
        return "galeria";
    }

    public String listarProvedores() {
        return "/proveedor/List";
    }

    public String listarItems() {
        return "/item/List";
    }

    public String listarEventos() {
        return "/evento/List";
    }

    public String listarLugares() {
        return "/lugar/List";
    }

    public String listarParametros() {
        return "/parametros/List";
    }

    public String listarClientes() {
        return "/cliente/List";
    }

    public String facturaVenta() {
        return "ir.factura.venta";
    }
}
