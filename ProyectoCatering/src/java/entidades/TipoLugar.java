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
@Table(name = "tipo_lugar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoLugar.findAll", query = "SELECT t FROM TipoLugar t"),
    @NamedQuery(name = "TipoLugar.findByCodTl", query = "SELECT t FROM TipoLugar t WHERE t.codTl = :codTl"),
    @NamedQuery(name = "TipoLugar.findByNombreTl", query = "SELECT t FROM TipoLugar t WHERE t.nombreTl = :nombreTl")})
public class TipoLugar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tl")
    private Integer codTl;
    @Size(max = 50)
    @Column(name = "nombre_tl")
    private String nombreTl;

    public TipoLugar() {
    }

    public TipoLugar(Integer codTl) {
        this.codTl = codTl;
    }

    public Integer getCodTl() {
        return codTl;
    }

    public void setCodTl(Integer codTl) {
        this.codTl = codTl;
    }

    public String getNombreTl() {
        return nombreTl;
    }

    public void setNombreTl(String nombreTl) {
        this.nombreTl = nombreTl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTl != null ? codTl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoLugar)) {
            return false;
        }
        TipoLugar other = (TipoLugar) object;
        if ((this.codTl == null && other.codTl != null) || (this.codTl != null && !this.codTl.equals(other.codTl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoLugar[ codTl=" + codTl + " ]";
    }
    
}
