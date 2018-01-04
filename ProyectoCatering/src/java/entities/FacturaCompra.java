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
@Table(name = "factura_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacturaCompra.findAll", query = "SELECT f FROM FacturaCompra f")
    , @NamedQuery(name = "FacturaCompra.findByCodFactc", query = "SELECT f FROM FacturaCompra f WHERE f.codFactc = :codFactc")
    , @NamedQuery(name = "FacturaCompra.findByNumeroFactc", query = "SELECT f FROM FacturaCompra f WHERE f.numeroFactc = :numeroFactc")
    , @NamedQuery(name = "FacturaCompra.findByFechaFactc", query = "SELECT f FROM FacturaCompra f WHERE f.fechaFactc = :fechaFactc")
    , @NamedQuery(name = "FacturaCompra.findByIvaFactc", query = "SELECT f FROM FacturaCompra f WHERE f.ivaFactc = :ivaFactc")
    , @NamedQuery(name = "FacturaCompra.findByDescuentoFactc", query = "SELECT f FROM FacturaCompra f WHERE f.descuentoFactc = :descuentoFactc")
    , @NamedQuery(name = "FacturaCompra.findBySubTotalFactc", query = "SELECT f FROM FacturaCompra f WHERE f.subTotalFactc = :subTotalFactc")
    , @NamedQuery(name = "FacturaCompra.findByTotalFactc", query = "SELECT f FROM FacturaCompra f WHERE f.totalFactc = :totalFactc")
    , @NamedQuery(name = "FacturaCompra.findByCodPa", query = "SELECT f FROM FacturaCompra f WHERE f.codPa = :codPa")
    , @NamedQuery(name = "FacturaCompra.findByCodPerso", query = "SELECT f FROM FacturaCompra f WHERE f.codPerso = :codPerso")
    , @NamedQuery(name = "FacturaCompra.findByCodProve", query = "SELECT f FROM FacturaCompra f WHERE f.codProve = :codProve")})
public class FacturaCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_factc")
    private Integer codFactc;
    @Size(max = 20)
    @Column(name = "numero_factc")
    private String numeroFactc;
    @Column(name = "fecha_factc")
    @Temporal(TemporalType.DATE)
    private Date fechaFactc;
    @Size(max = 20)
    @Column(name = "iva_factc")
    private String ivaFactc;
    @Size(max = 20)
    @Column(name = "descuento_factc")
    private String descuentoFactc;
    @Size(max = 20)
    @Column(name = "sub_total_factc")
    private String subTotalFactc;
    @Size(max = 20)
    @Column(name = "total_factc")
    private String totalFactc;
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
    @Column(name = "cod_prove")
    private int codProve;

    public FacturaCompra() {
    }

    public FacturaCompra(Integer codFactc) {
        this.codFactc = codFactc;
    }

    public FacturaCompra(Integer codFactc, int codPa, int codPerso, int codProve) {
        this.codFactc = codFactc;
        this.codPa = codPa;
        this.codPerso = codPerso;
        this.codProve = codProve;
    }

    public Integer getCodFactc() {
        return codFactc;
    }

    public void setCodFactc(Integer codFactc) {
        this.codFactc = codFactc;
    }

    public String getNumeroFactc() {
        return numeroFactc;
    }

    public void setNumeroFactc(String numeroFactc) {
        this.numeroFactc = numeroFactc;
    }

    public Date getFechaFactc() {
        return fechaFactc;
    }

    public void setFechaFactc(Date fechaFactc) {
        this.fechaFactc = fechaFactc;
    }

    public String getIvaFactc() {
        return ivaFactc;
    }

    public void setIvaFactc(String ivaFactc) {
        this.ivaFactc = ivaFactc;
    }

    public String getDescuentoFactc() {
        return descuentoFactc;
    }

    public void setDescuentoFactc(String descuentoFactc) {
        this.descuentoFactc = descuentoFactc;
    }

    public String getSubTotalFactc() {
        return subTotalFactc;
    }

    public void setSubTotalFactc(String subTotalFactc) {
        this.subTotalFactc = subTotalFactc;
    }

    public String getTotalFactc() {
        return totalFactc;
    }

    public void setTotalFactc(String totalFactc) {
        this.totalFactc = totalFactc;
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

    public int getCodProve() {
        return codProve;
    }

    public void setCodProve(int codProve) {
        this.codProve = codProve;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFactc != null ? codFactc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaCompra)) {
            return false;
        }
        FacturaCompra other = (FacturaCompra) object;
        if ((this.codFactc == null && other.codFactc != null) || (this.codFactc != null && !this.codFactc.equals(other.codFactc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FacturaCompra[ codFactc=" + codFactc + " ]";
    }
    
}
