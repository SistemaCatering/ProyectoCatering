/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author eduardo
 */
@Embeddable
public class DetalleFacturaVentaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_item")
    private int codigoItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_factv")
    private int codFactv;

    public DetalleFacturaVentaPK() {
    }

    public DetalleFacturaVentaPK(int codigoItem, int codFactv) {
        this.codigoItem = codigoItem;
        this.codFactv = codFactv;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public int getCodFactv() {
        return codFactv;
    }

    public void setCodFactv(int codFactv) {
        this.codFactv = codFactv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoItem;
        hash += (int) codFactv;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturaVentaPK)) {
            return false;
        }
        DetalleFacturaVentaPK other = (DetalleFacturaVentaPK) object;
        if (this.codigoItem != other.codigoItem) {
            return false;
        }
        if (this.codFactv != other.codFactv) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetalleFacturaVentaPK[ codigoItem=" + codigoItem + ", codFactv=" + codFactv + " ]";
    }
    
}
