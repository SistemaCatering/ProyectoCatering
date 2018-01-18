package beans;

import entities.Cliente;
import entities.Evento;
import entities.FacturaVenta;
import entities.Parametros;
import entities.Usuario;
import facade.ClienteFacade;
import facade.FacturaVentaFacade;
import facade.ParametrosFacade;
import facade.UsuarioFacadeLocal;
import facade.EventoFacade;
import facade.ParametrosFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Geovanny
 */
public class FacturaBean implements Serializable {

    @EJB
    ParametrosFacade parametrosCtrl;
    private Parametros parametro;
    private List<Parametros> parametros;
    @EJB
    ClienteFacade clienteCtrl;
    private Cliente cliente;
    private List<Cliente> clientes;
    @EJB
    FacturaVentaFacade factVentaCtrl;
    private FacturaVenta factVenta;
    private List<FacturaVenta> factVentas;
    @EJB
    UsuarioFacadeLocal usuarioCtrl;
    private Usuario usuario;
    private List<Usuario> usuarios;
    @EJB
    EventoFacade eventoCtrl;
    private Evento evento;
    private List<Evento> eventos;

    public FacturaBean() {
        cliente = new Cliente();
        clientes = new ArrayList();
        parametro = new Parametros();
        parametros = new ArrayList();
        factVenta = new FacturaVenta();
        factVentas = new ArrayList();
        usuario = new Usuario();
        usuarios = new ArrayList();
        evento = new Evento();
        eventos = new ArrayList();
        factVenta.setFechaFactv(new Date());
    }

    public ClienteFacade getClienteCtrl() {
        return clienteCtrl;
    }

    public void setClienteCtrl(ClienteFacade clienteCtrl) {
        this.clienteCtrl = clienteCtrl;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Parametros getParametro() {
        return parametro;
    }

    public void setParametro(Parametros parametro) {
        this.parametro = parametro;
    }

    public List<Parametros> getParametros() {
        return parametros;
    }

    public void setParametros(List<Parametros> parametros) {
        this.parametros = parametros;
    }

    public ParametrosFacade getParametrosCtrl() {
        return parametrosCtrl;
    }

    public void setParametrosCtrl(ParametrosFacade parametrosCtrl) {
        this.parametrosCtrl = parametrosCtrl;
    }

    public FacturaVentaFacade getFactVentaCtrl() {
        return factVentaCtrl;
    }

    public void setFactVentaCtrl(FacturaVentaFacade factVentaCtrl) {
        this.factVentaCtrl = factVentaCtrl;
    }

    public FacturaVenta getFactVenta() {
        return factVenta;
    }

    public void setFactVenta(FacturaVenta factVenta) {
        this.factVenta = factVenta;
    }

    public List<FacturaVenta> getFactVentas() {
        return factVentas;
    }

    public void setFactVentas(List<FacturaVenta> factVentas) {
        this.factVentas = factVentas;
    }

    public String modificar(FacturaVenta factVenta) {
        this.factVenta = factVenta; //le mando el mismo usuario de mi objeto para que se modifique
        return "";
    }

    public UsuarioFacadeLocal getUsuarioCtrl() {
        return usuarioCtrl;
    }

    public void setUsuarioCtrl(UsuarioFacadeLocal usuarioCtrl) {
        this.usuarioCtrl = usuarioCtrl;
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

    public EventoFacade getEventoCtrl() {
        return eventoCtrl;
    }

    public void setEventoCtrl(EventoFacade eventoCtrl) {
        this.eventoCtrl = eventoCtrl;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public String guardar() {
        if (factVenta != null) {
            if (factVenta.getCodFactv() == null) {
                factVentaCtrl.create(factVenta);
            } else {
                factVentaCtrl.edit(factVenta);
            }
        }
        factVenta = new FacturaVenta();
        return "";//se va a ir al una pagina home
    }

    public String borrar(FacturaVenta factVenta) {//retorna null por que se queda dentro de la tabla 
        if (factVenta != null) {
            factVentaCtrl.remove(factVenta);//para borrar a una persona
        }
        return null;
    }

    public String insertar() {
        factVenta = new FacturaVenta();
        return "";//porque se va a ir a un formulario
    }

    public String llenarDatos() {
        clientes = clienteCtrl.findAll();
        parametros = parametrosCtrl.findAll();
        eventos = eventoCtrl.findAll();
        System.out.println(cliente.getNombreCli());
        for (Cliente cliente1 : clientes) {
            if (cliente1.getCedulaCli().equals(cliente.getCedulaCli())) {
                cliente = cliente1;
            }
        }
        for (Parametros parametro1 : parametros) {
            if (parametro1.getRucPa().equals(parametro.getRucPa())) {
                parametro = parametro1;
            }
        }
        for (Evento evento1 : eventos) {
            evento1.getCodEvento();
            if (evento1.getCodEvento().equals(evento.getCodEvento())) {
                evento = evento1;
            }
        }
        return "";
    }
}