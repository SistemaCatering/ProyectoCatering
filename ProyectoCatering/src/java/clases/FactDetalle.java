/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Geovanny
 */
public class FactDetalle {
    private Integer codigo;
    private String nombreItem;
    private Double precio;
    private Integer cantidad;
    private String descuento;
    private Double total;

    public FactDetalle() {
    }

    public FactDetalle(Integer codigo, String nombreItem, Double precio, Integer cantidad, String descuento, Double total) {
        this.codigo = codigo;
        this.nombreItem = nombreItem;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.total = total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
