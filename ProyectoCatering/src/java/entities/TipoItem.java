/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "tipo_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoItem.findAll", query = "SELECT t FROM TipoItem t")
    , @NamedQuery(name = "TipoItem.findByCodTipoItem", query = "SELECT t FROM TipoItem t WHERE t.codTipoItem = :codTipoItem")
    , @NamedQuery(name = "TipoItem.findByNombreTipoItem", query = "SELECT t FROM TipoItem t WHERE t.nombreTipoItem = :nombreTipoItem")
    , @NamedQuery(name = "TipoItem.findByDescripcionTipoItem", query = "SELECT t FROM TipoItem t WHERE t.descripcionTipoItem = :descripcionTipoItem")})
public class TipoItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipo_item")
    private Integer codTipoItem;
    @Size(max = 20)
    @Column(name = "nombre_tipo_item")
    private String nombreTipoItem;
    @Size(max = 70)
    @Column(name = "descripcion_tipo_item")
    private String descripcionTipoItem;

    public TipoItem() {
    }

    public TipoItem(Integer codTipoItem) {
        this.codTipoItem = codTipoItem;
    }

    public Integer getCodTipoItem() {
        return codTipoItem;
    }

    public void setCodTipoItem(Integer codTipoItem) {
        this.codTipoItem = codTipoItem;
    }

    public String getNombreTipoItem() {
        return nombreTipoItem;
    }

    public void setNombreTipoItem(String nombreTipoItem) {
        this.nombreTipoItem = nombreTipoItem;
    }

    public String getDescripcionTipoItem() {
        return descripcionTipoItem;
    }

    public void setDescripcionTipoItem(String descripcionTipoItem) {
        this.descripcionTipoItem = descripcionTipoItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoItem != null ? codTipoItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoItem)) {
            return false;
        }
        TipoItem other = (TipoItem) object;
        if ((this.codTipoItem == null && other.codTipoItem != null) || (this.codTipoItem != null && !this.codTipoItem.equals(other.codTipoItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TipoItem[ codTipoItem=" + codTipoItem + " ]";
    }
    
}
