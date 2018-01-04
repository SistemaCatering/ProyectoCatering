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
@Table(name = "item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findByCodigoItem", query = "SELECT i FROM Item i WHERE i.codigoItem = :codigoItem")
    , @NamedQuery(name = "Item.findByDescripcionItem", query = "SELECT i FROM Item i WHERE i.descripcionItem = :descripcionItem")
    , @NamedQuery(name = "Item.findByCantidadItem", query = "SELECT i FROM Item i WHERE i.cantidadItem = :cantidadItem")
    , @NamedQuery(name = "Item.findByEstadoItem", query = "SELECT i FROM Item i WHERE i.estadoItem = :estadoItem")
    , @NamedQuery(name = "Item.findByUbicacionItem", query = "SELECT i FROM Item i WHERE i.ubicacionItem = :ubicacionItem")
    , @NamedQuery(name = "Item.findByCodTipoItem", query = "SELECT i FROM Item i WHERE i.codTipoItem = :codTipoItem")
    , @NamedQuery(name = "Item.findByValorItem", query = "SELECT i FROM Item i WHERE i.valorItem = :valorItem")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_item")
    private Integer codigoItem;
    @Size(max = 30)
    @Column(name = "descripcion_item")
    private String descripcionItem;
    @Column(name = "cantidad_item")
    private Integer cantidadItem;
    @Size(max = 20)
    @Column(name = "estado_item")
    private String estadoItem;
    @Size(max = 20)
    @Column(name = "ubicacion_item")
    private String ubicacionItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipo_item")
    private int codTipoItem;
    @Size(max = 20)
    @Column(name = "valor_item")
    private String valorItem;

    public Item() {
    }

    public Item(Integer codigoItem) {
        this.codigoItem = codigoItem;
    }

    public Item(Integer codigoItem, int codTipoItem) {
        this.codigoItem = codigoItem;
        this.codTipoItem = codTipoItem;
    }

    public Integer getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(Integer codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public Integer getCantidadItem() {
        return cantidadItem;
    }

    public void setCantidadItem(Integer cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public String getEstadoItem() {
        return estadoItem;
    }

    public void setEstadoItem(String estadoItem) {
        this.estadoItem = estadoItem;
    }

    public String getUbicacionItem() {
        return ubicacionItem;
    }

    public void setUbicacionItem(String ubicacionItem) {
        this.ubicacionItem = ubicacionItem;
    }

    public int getCodTipoItem() {
        return codTipoItem;
    }

    public void setCodTipoItem(int codTipoItem) {
        this.codTipoItem = codTipoItem;
    }

    public String getValorItem() {
        return valorItem;
    }

    public void setValorItem(String valorItem) {
        this.valorItem = valorItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoItem != null ? codigoItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.codigoItem == null && other.codigoItem != null) || (this.codigoItem != null && !this.codigoItem.equals(other.codigoItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Item[ codigoItem=" + codigoItem + " ]";
    }
    
}
