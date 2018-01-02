/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
 * @author Geovanny
 */
@Entity
@Table(name = "detalle_factura_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFacturaCompra.findAll", query = "SELECT d FROM DetalleFacturaCompra d"),
    @NamedQuery(name = "DetalleFacturaCompra.findByCodIprove", query = "SELECT d FROM DetalleFacturaCompra d WHERE d.detalleFacturaCompraPK.codIprove = :codIprove"),
    @NamedQuery(name = "DetalleFacturaCompra.findByCodFactc", query = "SELECT d FROM DetalleFacturaCompra d WHERE d.detalleFacturaCompraPK.codFactc = :codFactc"),
    @NamedQuery(name = "DetalleFacturaCompra.findByCantidadDfc", query = "SELECT d FROM DetalleFacturaCompra d WHERE d.cantidadDfc = :cantidadDfc"),
    @NamedQuery(name = "DetalleFacturaCompra.findByDescuentoDfc", query = "SELECT d FROM DetalleFacturaCompra d WHERE d.descuentoDfc = :descuentoDfc")})
public class DetalleFacturaCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleFacturaCompraPK detalleFacturaCompraPK;
    @Column(name = "cantidad_dfc")
    private Integer cantidadDfc;
    @Size(max = 18)
    @Column(name = "descuento_dfc")
    private String descuentoDfc;

    public DetalleFacturaCompra() {
    }

    public DetalleFacturaCompra(DetalleFacturaCompraPK detalleFacturaCompraPK) {
        this.detalleFacturaCompraPK = detalleFacturaCompraPK;
    }

    public DetalleFacturaCompra(int codIprove, int codFactc) {
        this.detalleFacturaCompraPK = new DetalleFacturaCompraPK(codIprove, codFactc);
    }

    public DetalleFacturaCompraPK getDetalleFacturaCompraPK() {
        return detalleFacturaCompraPK;
    }

    public void setDetalleFacturaCompraPK(DetalleFacturaCompraPK detalleFacturaCompraPK) {
        this.detalleFacturaCompraPK = detalleFacturaCompraPK;
    }

    public Integer getCantidadDfc() {
        return cantidadDfc;
    }

    public void setCantidadDfc(Integer cantidadDfc) {
        this.cantidadDfc = cantidadDfc;
    }

    public String getDescuentoDfc() {
        return descuentoDfc;
    }

    public void setDescuentoDfc(String descuentoDfc) {
        this.descuentoDfc = descuentoDfc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleFacturaCompraPK != null ? detalleFacturaCompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturaCompra)) {
            return false;
        }
        DetalleFacturaCompra other = (DetalleFacturaCompra) object;
        if ((this.detalleFacturaCompraPK == null && other.detalleFacturaCompraPK != null) || (this.detalleFacturaCompraPK != null && !this.detalleFacturaCompraPK.equals(other.detalleFacturaCompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DetalleFacturaCompra[ detalleFacturaCompraPK=" + detalleFacturaCompraPK + " ]";
    }
    
}
