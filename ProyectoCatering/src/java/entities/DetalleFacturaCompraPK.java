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
public class DetalleFacturaCompraPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_iprove")
    private int codIprove;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_factc")
    private int codFactc;

    public DetalleFacturaCompraPK() {
    }

    public DetalleFacturaCompraPK(int codIprove, int codFactc) {
        this.codIprove = codIprove;
        this.codFactc = codFactc;
    }

    public int getCodIprove() {
        return codIprove;
    }

    public void setCodIprove(int codIprove) {
        this.codIprove = codIprove;
    }

    public int getCodFactc() {
        return codFactc;
    }

    public void setCodFactc(int codFactc) {
        this.codFactc = codFactc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codIprove;
        hash += (int) codFactc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturaCompraPK)) {
            return false;
        }
        DetalleFacturaCompraPK other = (DetalleFacturaCompraPK) object;
        if (this.codIprove != other.codIprove) {
            return false;
        }
        if (this.codFactc != other.codFactc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetalleFacturaCompraPK[ codIprove=" + codIprove + ", codFactc=" + codFactc + " ]";
    }
    
}
