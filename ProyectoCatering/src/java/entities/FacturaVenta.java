/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "factura_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacturaVenta.findAll", query = "SELECT f FROM FacturaVenta f")
    , @NamedQuery(name = "FacturaVenta.findByCodFactv", query = "SELECT f FROM FacturaVenta f WHERE f.codFactv = :codFactv")
    , @NamedQuery(name = "FacturaVenta.findByNumeroFactv", query = "SELECT f FROM FacturaVenta f WHERE f.numeroFactv = :numeroFactv")
    , @NamedQuery(name = "FacturaVenta.findByFechaFactv", query = "SELECT f FROM FacturaVenta f WHERE f.fechaFactv = :fechaFactv")
    , @NamedQuery(name = "FacturaVenta.findByIvaFactv", query = "SELECT f FROM FacturaVenta f WHERE f.ivaFactv = :ivaFactv")
    , @NamedQuery(name = "FacturaVenta.findByDescuentoFactv", query = "SELECT f FROM FacturaVenta f WHERE f.descuentoFactv = :descuentoFactv")
    , @NamedQuery(name = "FacturaVenta.findBySubTotalFactv", query = "SELECT f FROM FacturaVenta f WHERE f.subTotalFactv = :subTotalFactv")
    , @NamedQuery(name = "FacturaVenta.findByTotalFactv", query = "SELECT f FROM FacturaVenta f WHERE f.totalFactv = :totalFactv")
    , @NamedQuery(name = "FacturaVenta.findByCodPa", query = "SELECT f FROM FacturaVenta f WHERE f.codPa = :codPa")
    , @NamedQuery(name = "FacturaVenta.findByCodPerso", query = "SELECT f FROM FacturaVenta f WHERE f.codPerso = :codPerso")
    , @NamedQuery(name = "FacturaVenta.findByCodCli", query = "SELECT f FROM FacturaVenta f WHERE f.codCli = :codCli")
    , @NamedQuery(name = "FacturaVenta.findByCodEvento", query = "SELECT f FROM FacturaVenta f WHERE f.codEvento = :codEvento")})
public class FacturaVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_factv")
    private Integer codFactv;
    @Column(name = "numero_factv")
    private Integer numeroFactv;
    @Column(name = "fecha_factv")
    @Temporal(TemporalType.DATE)
    private Date fechaFactv;
    @Size(max = 20)
    @Column(name = "iva_factv")
    private String ivaFactv;
    @Size(max = 20)
    @Column(name = "descuento_factv")
    private String descuentoFactv;
    @Size(max = 20)
    @Column(name = "sub_total_factv")
    private String subTotalFactv;
    @Size(max = 20)
    @Column(name = "total_factv")
    private String totalFactv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_pa")
    private int codPa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_perso")
    private int codPerso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cli")
    private int codCli;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_evento")
    private int codEvento;

    public FacturaVenta() {
    }

    public FacturaVenta(Integer codFactv) {
        this.codFactv = codFactv;
    }

    public FacturaVenta(Integer codFactv, int codPa, int codPerso, int codCli, int codEvento) {
        this.codFactv = codFactv;
        this.codPa = codPa;
        this.codPerso = codPerso;
        this.codCli = codCli;
        this.codEvento = codEvento;
    }

    public Integer getCodFactv() {
        return codFactv;
    }

    public void setCodFactv(Integer codFactv) {
        this.codFactv = codFactv;
    }

    public Integer getNumeroFactv() {
        return numeroFactv;
    }

    public void setNumeroFactv(Integer numeroFactv) {
        this.numeroFactv = numeroFactv;
    }

    public Date getFechaFactv() {
        return fechaFactv;
    }

    public void setFechaFactv(Date fechaFactv) {
        this.fechaFactv = fechaFactv;
    }

    public String getIvaFactv() {
        return ivaFactv;
    }

    public void setIvaFactv(String ivaFactv) {
        this.ivaFactv = ivaFactv;
    }

    public String getDescuentoFactv() {
        return descuentoFactv;
    }

    public void setDescuentoFactv(String descuentoFactv) {
        this.descuentoFactv = descuentoFactv;
    }

    public String getSubTotalFactv() {
        return subTotalFactv;
    }

    public void setSubTotalFactv(String subTotalFactv) {
        this.subTotalFactv = subTotalFactv;
    }

    public String getTotalFactv() {
        return totalFactv;
    }

    public void setTotalFactv(String totalFactv) {
        this.totalFactv = totalFactv;
    }

    public int getCodPa() {
        return codPa;
    }

    public void setCodPa(int codPa) {
        this.codPa = codPa;
    }

    public int getCodPerso() {
        return codPerso;
    }

    public void setCodPerso(int codPerso) {
        this.codPerso = codPerso;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFactv != null ? codFactv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaVenta)) {
            return false;
        }
        FacturaVenta other = (FacturaVenta) object;
        if ((this.codFactv == null && other.codFactv != null) || (this.codFactv != null && !this.codFactv.equals(other.codFactv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FacturaVenta[ codFactv=" + codFactv + " ]";
    }
    
}
