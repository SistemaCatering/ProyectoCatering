/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
 * @author Geovanny
 */
@Entity
@Table(name = "item_proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemProveedor.findAll", query = "SELECT i FROM ItemProveedor i"),
    @NamedQuery(name = "ItemProveedor.findByCodIprove", query = "SELECT i FROM ItemProveedor i WHERE i.codIprove = :codIprove"),
    @NamedQuery(name = "ItemProveedor.findByDescripcionIprove", query = "SELECT i FROM ItemProveedor i WHERE i.descripcionIprove = :descripcionIprove"),
    @NamedQuery(name = "ItemProveedor.findByAlquilerIprove", query = "SELECT i FROM ItemProveedor i WHERE i.alquilerIprove = :alquilerIprove"),
    @NamedQuery(name = "ItemProveedor.findByCodTipoItem", query = "SELECT i FROM ItemProveedor i WHERE i.codTipoItem = :codTipoItem")})
public class ItemProveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_iprove")
    private Integer codIprove;
    @Size(max = 70)
    @Column(name = "descripcion_iprove")
    private String descripcionIprove;
    @Size(max = 20)
    @Column(name = "alquiler_iprove")
    private String alquilerIprove;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipo_item")
    private int codTipoItem;

    public ItemProveedor() {
    }

    public ItemProveedor(Integer codIprove) {
        this.codIprove = codIprove;
    }

    public ItemProveedor(Integer codIprove, int codTipoItem) {
        this.codIprove = codIprove;
        this.codTipoItem = codTipoItem;
    }

    public Integer getCodIprove() {
        return codIprove;
    }

    public void setCodIprove(Integer codIprove) {
        this.codIprove = codIprove;
    }

    public String getDescripcionIprove() {
        return descripcionIprove;
    }

    public void setDescripcionIprove(String descripcionIprove) {
        this.descripcionIprove = descripcionIprove;
    }

    public String getAlquilerIprove() {
        return alquilerIprove;
    }

    public void setAlquilerIprove(String alquilerIprove) {
        this.alquilerIprove = alquilerIprove;
    }

    public int getCodTipoItem() {
        return codTipoItem;
    }

    public void setCodTipoItem(int codTipoItem) {
        this.codTipoItem = codTipoItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIprove != null ? codIprove.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemProveedor)) {
            return false;
        }
        ItemProveedor other = (ItemProveedor) object;
        if ((this.codIprove == null && other.codIprove != null) || (this.codIprove != null && !this.codIprove.equals(other.codIprove))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ItemProveedor[ codIprove=" + codIprove + " ]";
    }
    
}
