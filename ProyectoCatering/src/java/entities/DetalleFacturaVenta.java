/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "detalle_factura_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFacturaVenta.findAll", query = "SELECT d FROM DetalleFacturaVenta d")
    , @NamedQuery(name = "DetalleFacturaVenta.findByCodigoItem", query = "SELECT d FROM DetalleFacturaVenta d WHERE d.detalleFacturaVentaPK.codigoItem = :codigoItem")
    , @NamedQuery(name = "DetalleFacturaVenta.findByCodFactv", query = "SELECT d FROM DetalleFacturaVenta d WHERE d.detalleFacturaVentaPK.codFactv = :codFactv")
    , @NamedQuery(name = "DetalleFacturaVenta.findByCantidadDfv", query = "SELECT d FROM DetalleFacturaVenta d WHERE d.cantidadDfv = :cantidadDfv")
    , @NamedQuery(name = "DetalleFacturaVenta.findByDescuentoDfv", query = "SELECT d FROM DetalleFacturaVenta d WHERE d.descuentoDfv = :descuentoDfv")})
public class DetalleFacturaVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleFacturaVentaPK detalleFacturaVentaPK;
    @Column(name = "cantidad_dfv")
    private Integer cantidadDfv;
    @Size(max = 20)
    @Column(name = "descuento_dfv")
    private String descuentoDfv;

    public DetalleFacturaVenta() {
    }

    public DetalleFacturaVenta(DetalleFacturaVentaPK detalleFacturaVentaPK) {
        this.detalleFacturaVentaPK = detalleFacturaVentaPK;
    }

    public DetalleFacturaVenta(int codigoItem, int codFactv) {
        this.detalleFacturaVentaPK = new DetalleFacturaVentaPK(codigoItem, codFactv);
    }

    public DetalleFacturaVentaPK getDetalleFacturaVentaPK() {
        return detalleFacturaVentaPK;
    }

    public void setDetalleFacturaVentaPK(DetalleFacturaVentaPK detalleFacturaVentaPK) {
        this.detalleFacturaVentaPK = detalleFacturaVentaPK;
    }

    public Integer getCantidadDfv() {
        return cantidadDfv;
    }

    public void setCantidadDfv(Integer cantidadDfv) {
        this.cantidadDfv = cantidadDfv;
    }

    public String getDescuentoDfv() {
        return descuentoDfv;
    }

    public void setDescuentoDfv(String descuentoDfv) {
        this.descuentoDfv = descuentoDfv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleFacturaVentaPK != null ? detalleFacturaVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturaVenta)) {
            return false;
        }
        DetalleFacturaVenta other = (DetalleFacturaVenta) object;
        if ((this.detalleFacturaVentaPK == null && other.detalleFacturaVentaPK != null) || (this.detalleFacturaVentaPK != null && !this.detalleFacturaVentaPK.equals(other.detalleFacturaVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetalleFacturaVenta[ detalleFacturaVentaPK=" + detalleFacturaVentaPK + " ]";
    }
    
}
