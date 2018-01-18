/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.FactDetalle;
import entities.DetalleFacturaVenta;
import entities.Item;
import facade.ItemFacade;
import facade.DetalleFacturaVentaFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Geovanny
 */
public class FacturaDetalleVBean implements Serializable {

    @EJB
    ItemFacade itemCtrl;
    private Item item;
    private List<Item> items;
    @EJB
    DetalleFacturaVentaFacade detalleFactVCtrl;
    private DetalleFacturaVenta detalleFactV;
    private List<DetalleFacturaVenta> detalleFactVs;
    double precio;
    private FactDetalle factDetalle;
    private List<FactDetalle> factDetalles;

    /**
     * Creates a new instance of FacturaDetalleVBean
     */
    public FacturaDetalleVBean() {
        item = new Item();
        items = new ArrayList();
        detalleFactV = new DetalleFacturaVenta();
        detalleFactVs = new ArrayList();
        factDetalle = new FactDetalle();
        factDetalles = new ArrayList();
    }

    public ItemFacade getItemCtrl() {
        return itemCtrl;
    }

    public void setItemCtrl(ItemFacade itemCtrl) {
        this.itemCtrl = itemCtrl;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public DetalleFacturaVentaFacade getDetalleFactVCtrl() {
        return detalleFactVCtrl;
    }

    public void setDetalleFactVCtrl(DetalleFacturaVentaFacade detalleFactVCtrl) {
        this.detalleFactVCtrl = detalleFactVCtrl;
    }

    public DetalleFacturaVenta getDetalleFactV() {
        return detalleFactV;
    }

    public void setDetalleFactV(DetalleFacturaVenta detalleFactV) {
        this.detalleFactV = detalleFactV;
    }

    public List<DetalleFacturaVenta> getDetalleFactVs() {
        return detalleFactVs;
    }

    public void setDetalleFactVs(List<DetalleFacturaVenta> detalleFactVs) {
        this.detalleFactVs = detalleFactVs;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public FactDetalle getFactDetalle() {
        return factDetalle;
    }

    public void setFactDetalle(FactDetalle factDetalle) {
        this.factDetalle = factDetalle;
    }

    public List<FactDetalle> getFactDetalles() {
        return factDetalles;
    }

    public void setFactDetalles(List<FactDetalle> factDetalles) {
        this.factDetalles = factDetalles;
    }

    public String llenarDatos() {
        items = itemCtrl.findAll();
        for (Item item1 : items) {
            if (item1.getCodigoItem().equals(item.getCodigoItem())) {
                item = item1;
            }
        }
        double valor = Double.valueOf(item.getValorItem());
        precio = Math.rint((valor * (double) detalleFactV.getCantidadDfv()) * 100) / 100;
        factDetalles.add(new FactDetalle(item.getCodigoItem(), item.getDescripcionItem(), valor, detalleFactV.getCantidadDfv(), "30%", precio));
        return "";

    }

    public String nuevoDetaFactV() {
        precio = 0;
        item = new Item();
        detalleFactV = new DetalleFacturaVenta();
        return "ir.nuevo.detalle";
    }

    public String regresarDetaFactV() {
        return "ir.nuevo.factura.detalle";
    }
}
